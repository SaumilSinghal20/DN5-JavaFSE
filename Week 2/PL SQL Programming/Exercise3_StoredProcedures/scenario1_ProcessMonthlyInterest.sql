-- ============================================================
-- Scenario 1: Apply 1% interest to every savings account
-- This runs every month to top up savings balances.
-- ============================================================

CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest
IS
    -- going through every savings account one by one using a cursor
    CURSOR savings_cur IS
        SELECT AccountID, Balance
        FROM   Accounts
        WHERE  AccountType = 'Savings';

    v_interest NUMBER;
BEGIN
    FOR rec IN savings_cur LOOP
        -- 1% of current balance is the monthly interest
        v_interest := rec.Balance * 0.01;

        UPDATE Accounts
        SET    Balance      = Balance + v_interest,
               LastModified = SYSDATE
        WHERE  AccountID    = rec.AccountID;

        DBMS_OUTPUT.PUT_LINE('Account ' || rec.AccountID ||
                             ': added interest Rs ' || v_interest ||
                             ', new balance = ' || (rec.Balance + v_interest));
    END LOOP;

    COMMIT;
    DBMS_OUTPUT.PUT_LINE('Monthly interest processing done for all savings accounts.');

EXCEPTION
    WHEN OTHERS THEN
        ROLLBACK;
        DBMS_OUTPUT.PUT_LINE('Error while processing interest: ' || SQLERRM);
END ProcessMonthlyInterest;
/

-- run it
BEGIN
    ProcessMonthlyInterest;
END;
/
