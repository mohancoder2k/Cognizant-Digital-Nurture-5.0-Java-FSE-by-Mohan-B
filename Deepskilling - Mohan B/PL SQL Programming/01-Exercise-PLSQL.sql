DECLARE
    CURSOR cust_cursor IS
    SELECT c.CustomerID, l.LoanID
    FROM Customers c
    JOIN Loans l
    ON c.CustomerID = l.CustomerID
    WHERE FLOOR(MONTHS_BETWEEN(SYSDATE, c.DOB)/12) > 60;
BEGIN
    FOR rec IN cust_cursor LOOP
        UPDATE Loans
        SET InterestRate = InterestRate - 1
        WHERE LoanID = rec.LoanID;
    END LOOP;

    COMMIT;
END;
/
select * from customers;
select * from loans;