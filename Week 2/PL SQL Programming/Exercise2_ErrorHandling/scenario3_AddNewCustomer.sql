-- ============================================================
-- Scenario 3: Insert a new customer safely
-- If the same CustomerID already exists, we catch the
-- duplicate primary key error and log it instead of crashing.
-- ============================================================

CREATE OR REPLACE PROCEDURE AddNewCustomer (
    p_cust_id   IN NUMBER,
    p_name      IN VARCHAR2,
    p_dob       IN DATE,
    p_balance   IN NUMBER
)
IS
BEGIN
    INSERT INTO Customers (CustomerID, Name, DOB, Balance, LastModified)
    VALUES (p_cust_id, p_name, p_dob, p_balance, SYSDATE);

    COMMIT;
    DBMS_OUTPUT.PUT_LINE('Customer ' || p_name || ' added successfully with ID ' || p_cust_id);

EXCEPTION
    WHEN DUP_VAL_ON_INDEX THEN
        -- duplicate primary key caught here
        DBMS_OUTPUT.PUT_LINE('Warning: Customer with ID ' || p_cust_id ||
                             ' already exists. Skipping insertion.');

    WHEN OTHERS THEN
        ROLLBACK;
        DBMS_OUTPUT.PUT_LINE('Error inserting customer: ' || SQLERRM);
END AddNewCustomer;
/

-- testing both cases
BEGIN
    -- this one should insert fine
    AddNewCustomer(10, 'Ravi Sharma', TO_DATE('1995-03-12', 'YYYY-MM-DD'), 5000);
    -- this one uses ID 1 which already exists in sample data
    AddNewCustomer(1, 'Duplicate Guy', TO_DATE('2000-01-01', 'YYYY-MM-DD'), 100);
END;
/
