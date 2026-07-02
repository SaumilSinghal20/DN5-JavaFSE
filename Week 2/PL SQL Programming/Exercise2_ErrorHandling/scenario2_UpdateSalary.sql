-- ============================================================
-- Scenario 2: Update salary of an employee by a given %
-- If the employee ID is wrong, catch it and log it cleanly.
-- ============================================================

CREATE OR REPLACE PROCEDURE UpdateSalary (
    p_emp_id      IN NUMBER,
    p_percent_hike IN NUMBER
)
IS
    v_current_sal NUMBER;
BEGIN
    -- see if employee actually exists
    SELECT Salary
    INTO   v_current_sal
    FROM   Employees
    WHERE  EmployeeID = p_emp_id;

    -- calculate and apply the hike
    UPDATE Employees
    SET    Salary = Salary + (Salary * p_percent_hike / 100)
    WHERE  EmployeeID = p_emp_id;

    COMMIT;
    DBMS_OUTPUT.PUT_LINE('Salary updated. Employee ' || p_emp_id ||
                         ' old salary: ' || v_current_sal ||
                         ', hike applied: ' || p_percent_hike || '%');

EXCEPTION
    WHEN NO_DATA_FOUND THEN
        -- employee not in the table, log and stop
        DBMS_OUTPUT.PUT_LINE('Error: Employee with ID ' || p_emp_id ||
                             ' was not found. No update done.');

    WHEN OTHERS THEN
        ROLLBACK;
        DBMS_OUTPUT.PUT_LINE('Something went wrong: ' || SQLERRM);
END UpdateSalary;
/

-- test run with a valid and invalid ID
BEGIN
    UpdateSalary(1, 10);   -- should work
    UpdateSalary(999, 10); -- should show error
END;
/
