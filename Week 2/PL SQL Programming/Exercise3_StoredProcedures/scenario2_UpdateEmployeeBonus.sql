-- ============================================================
-- Scenario 2: Give bonus to employees in a particular dept
-- The bonus % is passed in by the caller.
-- ============================================================

CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus (
    p_department   IN VARCHAR2,
    p_bonus_pct    IN NUMBER
)
IS
    v_count NUMBER := 0;
BEGIN
    -- update all employees belonging to that department
    UPDATE Employees
    SET    Salary = Salary + (Salary * p_bonus_pct / 100)
    WHERE  Department = p_department;

    -- how many rows got updated
    v_count := SQL%ROWCOUNT;

    IF v_count = 0 THEN
        DBMS_OUTPUT.PUT_LINE('No employees found in department: ' || p_department);
    ELSE
        COMMIT;
        DBMS_OUTPUT.PUT_LINE(v_count || ' employee(s) in ' || p_department ||
                             ' got a ' || p_bonus_pct || '% bonus.');
    END IF;

EXCEPTION
    WHEN OTHERS THEN
        ROLLBACK;
        DBMS_OUTPUT.PUT_LINE('Error applying bonus: ' || SQLERRM);
END UpdateEmployeeBonus;
/

-- test
BEGIN
    UpdateEmployeeBonus('IT', 15);
    UpdateEmployeeBonus('HR', 10);
    UpdateEmployeeBonus('Finance', 5); -- might print 0 rows found
END;
/
