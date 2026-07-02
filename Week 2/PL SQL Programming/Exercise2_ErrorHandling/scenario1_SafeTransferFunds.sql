-- ============================================================
-- Scenario 1: Safe transfer of funds between two accounts
-- If anything goes wrong (e.g. not enough balance) we roll
-- back the whole thing and log the issue.
-- ============================================================

CREATE OR REPLACE PROCEDURE SafeTransferFunds (
    p_from_account  IN  NUMBER,
    p_to_account    IN  NUMBER,
    p_amount        IN  NUMBER
)
IS
    v_avail_balance NUMBER;
BEGIN
    -- first check how much is in the source account
    SELECT Balance
    INTO   v_avail_balance
    FROM   Accounts
    WHERE  AccountID = p_from_account
    FOR UPDATE;   -- lock the row so nothing else touches it mid-transfer

    IF v_avail_balance < p_amount THEN
        -- not enough money, we just raise an application error
        RAISE_APPLICATION_ERROR(-20001,
            'Transfer failed: account ' || p_from_account ||
            ' only has ' || v_avail_balance ||
            ', but tried to transfer ' || p_amount);
    END IF;

    -- debit the sender
    UPDATE Accounts
    SET    Balance       = Balance - p_amount,
           LastModified  = SYSDATE
    WHERE  AccountID     = p_from_account;

    -- credit the receiver
    UPDATE Accounts
    SET    Balance       = Balance + p_amount,
           LastModified  = SYSDATE
    WHERE  AccountID     = p_to_account;

    COMMIT;
    DBMS_OUTPUT.PUT_LINE('Transfer of ' || p_amount ||
                         ' from account ' || p_from_account ||
                         ' to account ' || p_to_account || ' done.');

EXCEPTION
    WHEN NO_DATA_FOUND THEN
        ROLLBACK;
        DBMS_OUTPUT.PUT_LINE('Error: one of the account IDs does not exist.');

    WHEN OTHERS THEN
        ROLLBACK;
        -- print the actual oracle error so we can debug
        DBMS_OUTPUT.PUT_LINE('Unexpected error during transfer: ' || SQLERRM);
END SafeTransferFunds;
/

-- quick test
BEGIN
    SafeTransferFunds(1, 2, 200);
END;
/
