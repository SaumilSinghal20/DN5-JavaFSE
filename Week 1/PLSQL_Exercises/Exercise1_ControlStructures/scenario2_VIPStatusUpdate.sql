-- ============================================================
-- Scenario 2: Promote a customer to VIP if their balance
-- is over 10,000. We use a flag column IsVIP on Customers.
-- NOTE: Run this first to add the column if it doesn't exist:
--   ALTER TABLE Customers ADD (IsVIP VARCHAR2(5) DEFAULT 'FALSE');
-- ============================================================

DECLARE
    CURSOR balance_cur IS
        SELECT CustomerID, Name, Balance
        FROM   Customers;
BEGIN
    FOR rec IN balance_cur LOOP
        IF rec.Balance > 10000 THEN
            UPDATE Customers
            SET    IsVIP = 'TRUE'
            WHERE  CustomerID = rec.CustomerID;

            DBMS_OUTPUT.PUT_LINE(rec.Name || ' (balance: ' || rec.Balance ||
                                 ') -> marked as VIP');
        ELSE
            UPDATE Customers
            SET    IsVIP = 'FALSE'
            WHERE  CustomerID = rec.CustomerID;

            DBMS_OUTPUT.PUT_LINE(rec.Name || ' (balance: ' || rec.Balance ||
                                 ') -> not VIP yet');
        END IF;
    END LOOP;

    COMMIT;
    DBMS_OUTPUT.PUT_LINE('VIP status update finished for all customers.');
EXCEPTION
    WHEN OTHERS THEN
        ROLLBACK;
        DBMS_OUTPUT.PUT_LINE('Something went wrong: ' || SQLERRM);
END;
/
