-- ============================================================
-- Scenario 1: Bank wants to give a 1% interest discount on
-- loans for customers who are above 60 years old.
-- We loop through all customers, check their age, and update
-- the loan interest rate where needed.
-- ============================================================

DECLARE
    -- cursor to get all customers with their birth date
    CURSOR cust_cur IS
        SELECT CustomerID, Name, DOB
        FROM   Customers;

    v_age  NUMBER;
BEGIN
    FOR cust IN cust_cur LOOP
        -- calculate how old this customer is in years
        v_age := TRUNC(MONTHS_BETWEEN(SYSDATE, cust.DOB) / 12);

        IF v_age > 60 THEN
            -- apply 1% discount to all their active loans
            UPDATE Loans
            SET    InterestRate = InterestRate - 1
            WHERE  CustomerID   = cust.CustomerID
            AND    InterestRate  > 1;   -- avoid going below 0 or 1

            DBMS_OUTPUT.PUT_LINE('Senior discount applied for: ' || cust.Name ||
                                 ' (Age: ' || v_age || ')');
        ELSE
            DBMS_OUTPUT.PUT_LINE('No discount for: ' || cust.Name ||
                                 ' (Age: ' || v_age || ')');
        END IF;
    END LOOP;

    COMMIT;
    DBMS_OUTPUT.PUT_LINE('Senior citizen loan discount processing complete.');
EXCEPTION
    WHEN OTHERS THEN
        ROLLBACK;
        DBMS_OUTPUT.PUT_LINE('Error occurred: ' || SQLERRM);
END;
/
