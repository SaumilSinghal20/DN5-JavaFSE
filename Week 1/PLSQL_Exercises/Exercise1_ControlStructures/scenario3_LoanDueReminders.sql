-- ============================================================
-- Scenario 3: Print a reminder for every customer whose loan
-- is due within the next 30 days from today.
-- ============================================================

DECLARE
    CURSOR due_loans_cur IS
        SELECT l.LoanID,
               l.CustomerID,
               c.Name         AS customer_name,
               l.EndDate,
               l.LoanAmount
        FROM   Loans     l
        JOIN   Customers c ON l.CustomerID = c.CustomerID
        WHERE  l.EndDate BETWEEN SYSDATE AND SYSDATE + 30;

    v_days_left NUMBER;
BEGIN
    DBMS_OUTPUT.PUT_LINE('=== Loan Due Date Reminders ===');

    FOR loan_rec IN due_loans_cur LOOP
        -- how many days until this loan is due
        v_days_left := TRUNC(loan_rec.EndDate - SYSDATE);

        DBMS_OUTPUT.PUT_LINE('REMINDER -> Customer: ' || loan_rec.customer_name ||
                             ' | Loan ID: ' || loan_rec.LoanID ||
                             ' | Amount: '  || loan_rec.LoanAmount ||
                             ' | Due in '   || v_days_left || ' day(s) on ' ||
                             TO_CHAR(loan_rec.EndDate, 'DD-MON-YYYY'));
    END LOOP;

    DBMS_OUTPUT.PUT_LINE('=== End of Reminders ===');
EXCEPTION
    WHEN OTHERS THEN
        DBMS_OUTPUT.PUT_LINE('Error fetching loan reminders: ' || SQLERRM);
END;
/
