-- ============================================================
-- Scenario 3: Transfer funds between two customer accounts
-- Checks source balance first. If not enough, stops cleanly.
-- ============================================================

CREATE OR REPLACE PROCEDURE TransferFunds (
    p_src_acc   IN NUMBER,
    p_dst_acc   IN NUMBER,
    p_amount    IN NUMBER
)
IS
    v_src_balance NUMBER;
BEGIN
    -- get current balance and lock the row while we work
    SELECT Balance
    INTO   v_src_balance
    FROM   Accounts
    WHERE  AccountID = p_src_acc
    FOR UPDATE;

    -- make sure there's enough to transfer
    IF v_src_balance < p_amount THEN
        DBMS_OUTPUT.PUT_LINE('Cannot transfer: account ' || p_src_acc ||
                             ' has only ' || v_src_balance ||
                             '. Required: ' || p_amount);
        RETURN;
    END IF;

    -- subtract from source
    UPDATE Accounts
    SET    Balance      = Balance - p_amount,
           LastModified = SYSDATE
    WHERE  AccountID    = p_src_acc;

    -- add to destination
    UPDATE Accounts
    SET    Balance      = Balance + p_amount,
           LastModified = SYSDATE
    WHERE  AccountID    = p_dst_acc;

    COMMIT;
    DBMS_OUTPUT.PUT_LINE('Transferred ' || p_amount ||
                         ' from account ' || p_src_acc ||
                         ' to account ' || p_dst_acc || ' successfully.');

EXCEPTION
    WHEN NO_DATA_FOUND THEN
        ROLLBACK;
        DBMS_OUTPUT.PUT_LINE('Error: one of the given account IDs does not exist.');

    WHEN OTHERS THEN
        ROLLBACK;
        DBMS_OUTPUT.PUT_LINE('Transfer failed: ' || SQLERRM);
END TransferFunds;
/

-- test runs
BEGIN
    TransferFunds(1, 2, 300);    -- normal transfer
    TransferFunds(1, 2, 99999);  -- should fail: not enough balance
END;
/
