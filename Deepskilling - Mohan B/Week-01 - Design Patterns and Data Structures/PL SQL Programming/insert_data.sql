INSERT INTO Customers (CustomerID, Name, DOB, Balance, LastModified)
VALUES (1, 'John Doe', TO_DATE('1985-05-15', 'YYYY-MM-DD'), 1000, SYSDATE);

INSERT INTO Customers (CustomerID, Name, DOB, Balance, LastModified)
VALUES (2, 'Jane Smith', TO_DATE('1990-07-20', 'YYYY-MM-DD'), 1500, SYSDATE);

INSERT INTO Accounts (AccountID, CustomerID, AccountType, Balance, LastModified)
VALUES (1, 1, 'Savings', 1000, SYSDATE);

INSERT INTO Accounts (AccountID, CustomerID, AccountType, Balance, LastModified)
VALUES (2, 2, 'Checking', 1500, SYSDATE);

INSERT INTO Transactions (TransactionID, AccountID, TransactionDate, Amount, TransactionType)
VALUES (1, 1, SYSDATE, 200, 'Deposit');

INSERT INTO Transactions (TransactionID, AccountID, TransactionDate, Amount, TransactionType)
VALUES (2, 2, SYSDATE, 300, 'Withdrawal');

INSERT INTO Loans (LoanID, CustomerID, LoanAmount, InterestRate, StartDate, EndDate)
VALUES (1, 1, 5000, 5, SYSDATE, ADD_MONTHS(SYSDATE, 60));

INSERT INTO Employees (EmployeeID, Name, Position, Salary, Department, HireDate)
VALUES (1, 'Alice Johnson', 'Manager', 70000, 'HR', TO_DATE('2015-06-15', 'YYYY-MM-DD'));

INSERT INTO Employees (EmployeeID, Name, Position, Salary, Department, HireDate)
VALUES (2, 'Bob Brown', 'Developer', 60000, 'IT', TO_DATE('2017-03-20', 'YYYY-MM-DD'));


-- ====================================================================
-- 1. INSERT 10 RECORDS INTO CUSTOMERS
-- Includes a mix of ages: >60 years old and ~30 years old
-- ====================================================================
INSERT INTO Customers (CustomerID, Name, DOB, Balance, LastModified)
VALUES (3, 'Charlie Green', TO_DATE('1955-03-12', 'YYYY-MM-DD'), 2500, SYSDATE); -- Age: >60

INSERT INTO Customers (CustomerID, Name, DOB, Balance, LastModified)
VALUES (4, 'Emily White', TO_DATE('1996-08-24', 'YYYY-MM-DD'), 1200, SYSDATE);  -- Age: ~30

INSERT INTO Customers (CustomerID, Name, DOB, Balance, LastModified)
VALUES (5, 'David Miller', TO_DATE('1961-11-05', 'YYYY-MM-DD'), 8000, SYSDATE); -- Age: >60

INSERT INTO Customers (CustomerID, Name, DOB, Balance, LastModified)
VALUES (6, 'Jessica Taylor', TO_DATE('1995-01-15', 'YYYY-MM-DD'), 450, SYSDATE);-- Age: ~30

INSERT INTO Customers (CustomerID, Name, DOB, Balance, LastModified)
VALUES (7, 'George Clark', TO_DATE('1958-05-30', 'YYYY-MM-DD'), 15000, SYSDATE);-- Age: >60

INSERT INTO Customers (CustomerID, Name, DOB, Balance, LastModified)
VALUES (8, 'Sarah Paul', TO_DATE('1997-04-18', 'YYYY-MM-DD'), 3100, SYSDATE);   -- Age: ~30

INSERT INTO Customers (CustomerID, Name, DOB, Balance, LastModified)
VALUES (9, 'Frank Wright', TO_DATE('1964-07-22', 'YYYY-MM-DD'), 9500, SYSDATE); -- Age: >60

INSERT INTO Customers (CustomerID, Name, DOB, Balance, LastModified)
VALUES (10, 'Anna Jones', TO_DATE('1994-12-02', 'YYYY-MM-DD'), 2200, SYSDATE);  -- Age: ~30

INSERT INTO Customers (CustomerID, Name, DOB, Balance, LastModified)
VALUES (11, 'Henry Ford', TO_DATE('1952-09-10', 'YYYY-MM-DD'), 11000, SYSDATE); -- Age: >60

INSERT INTO Customers (CustomerID, Name, DOB, Balance, LastModified)
VALUES (12, 'Laura Wilson', TO_DATE('1996-06-30', 'YYYY-MM-DD'), 1750, SYSDATE);-- Age: ~30


-- ====================================================================
-- 2. INSERT 10 RECORDS INTO ACCOUNTS (Mapped to CustomerID 3 to 12)
-- ====================================================================
INSERT INTO Accounts (AccountID, CustomerID, AccountType, Balance, LastModified)
VALUES (3, 3, 'Savings', 2500, SYSDATE);

INSERT INTO Accounts (AccountID, CustomerID, AccountType, Balance, LastModified)
VALUES (4, 4, 'Checking', 1200, SYSDATE);

INSERT INTO Accounts (AccountID, CustomerID, AccountType, Balance, LastModified)
VALUES (5, 5, 'Savings', 8000, SYSDATE);

INSERT INTO Accounts (AccountID, CustomerID, AccountType, Balance, LastModified)
VALUES (6, 6, 'Checking', 450, SYSDATE);

INSERT INTO Accounts (AccountID, CustomerID, AccountType, Balance, LastModified)
VALUES (7, 7, 'Savings', 15000, SYSDATE);

INSERT INTO Accounts (AccountID, CustomerID, AccountType, Balance, LastModified)
VALUES (8, 8, 'Checking', 3100, SYSDATE);

INSERT INTO Accounts (AccountID, CustomerID, AccountType, Balance, LastModified)
VALUES (9, 9, 'Savings', 9500, SYSDATE);

INSERT INTO Accounts (AccountID, CustomerID, AccountType, Balance, LastModified)
VALUES (10, 10, 'Checking', 2200, SYSDATE);

INSERT INTO Accounts (AccountID, CustomerID, AccountType, Balance, LastModified)
VALUES (11, 11, 'Savings', 11000, SYSDATE);

INSERT INTO Accounts (AccountID, CustomerID, AccountType, Balance, LastModified)
VALUES (12, 12, 'Checking', 1750, SYSDATE);


-- ====================================================================
-- 3. INSERT 10 RECORDS INTO TRANSACTIONS (Mapped to AccountID 3 to 12)
-- ====================================================================
INSERT INTO Transactions (TransactionID, AccountID, TransactionDate, Amount, TransactionType)
VALUES (3, 3, SYSDATE, 500, 'Deposit');

INSERT INTO Transactions (TransactionID, AccountID, TransactionDate, Amount, TransactionType)
VALUES (4, 4, SYSDATE, 100, 'Withdrawal');

INSERT INTO Transactions (TransactionID, AccountID, TransactionDate, Amount, TransactionType)
VALUES (5, 5, SYSDATE, 1500, 'Deposit');

INSERT INTO Transactions (TransactionID, AccountID, TransactionDate, Amount, TransactionType)
VALUES (6, 6, SYSDATE, 50, 'Withdrawal');

INSERT INTO Transactions (TransactionID, AccountID, TransactionDate, Amount, TransactionType)
VALUES (7, 7, SYSDATE, 2000, 'Deposit');

INSERT INTO Transactions (TransactionID, AccountID, TransactionDate, Amount, TransactionType)
VALUES (8, 8, SYSDATE, 350, 'Withdrawal');

INSERT INTO Transactions (TransactionID, AccountID, TransactionDate, Amount, TransactionType)
VALUES (9, 9, SYSDATE, 1200, 'Deposit');

INSERT INTO Transactions (TransactionID, AccountID, TransactionDate, Amount, TransactionType)
VALUES (10, 10, SYSDATE, 400, 'Withdrawal');

INSERT INTO Transactions (TransactionID, AccountID, TransactionDate, Amount, TransactionType)
VALUES (11, 11, SYSDATE, 3000, 'Deposit');

INSERT INTO Transactions (TransactionID, AccountID, TransactionDate, Amount, TransactionType)
VALUES (12, 12, SYSDATE, 150, 'Withdrawal');


-- ====================================================================
-- 4. INSERT 10 RECORDS INTO LOANS (Mapped to CustomerID 3 to 12)
-- ====================================================================
INSERT INTO Loans (LoanID, CustomerID, LoanAmount, InterestRate, StartDate, EndDate)
VALUES (2, 3, 10000, 4.5, SYSDATE, ADD_MONTHS(SYSDATE, 36));

INSERT INTO Loans (LoanID, CustomerID, LoanAmount, InterestRate, StartDate, EndDate)
VALUES (3, 4, 15000, 6.0, SYSDATE, ADD_MONTHS(SYSDATE, 48));

INSERT INTO Loans (LoanID, CustomerID, LoanAmount, InterestRate, StartDate, EndDate)
VALUES (4, 5, 20000, 3.9, SYSDATE, ADD_MONTHS(SYSDATE, 60));

INSERT INTO Loans (LoanID, CustomerID, LoanAmount, InterestRate, StartDate, EndDate)
VALUES (5, 6, 5000, 7.2, SYSDATE, ADD_MONTHS(SYSDATE, 24));

INSERT INTO Loans (LoanID, CustomerID, LoanAmount, InterestRate, StartDate, EndDate)
VALUES (6, 7, 30000, 4.0, SYSDATE, ADD_MONTHS(SYSDATE, 72));

INSERT INTO Loans (LoanID, CustomerID, LoanAmount, InterestRate, StartDate, EndDate)
VALUES (7, 8, 12000, 5.5, SYSDATE, ADD_MONTHS(SYSDATE, 48));

INSERT INTO Loans (LoanID, CustomerID, LoanAmount, InterestRate, StartDate, EndDate)
VALUES (8, 9, 8000, 4.8, SYSDATE, ADD_MONTHS(SYSDATE, 36));

INSERT INTO Loans (LoanID, CustomerID, LoanAmount, InterestRate, StartDate, EndDate)
VALUES (9, 10, 25000, 6.5, SYSDATE, ADD_MONTHS(SYSDATE, 60));

INSERT INTO Loans (LoanID, CustomerID, LoanAmount, InterestRate, StartDate, EndDate)
VALUES (10, 11, 40000, 3.5, SYSDATE, ADD_MONTHS(SYSDATE, 120));

INSERT INTO Loans (LoanID, CustomerID, LoanAmount, InterestRate, StartDate, EndDate)
VALUES (11, 12, 14000, 5.9, SYSDATE, ADD_MONTHS(SYSDATE, 48));


-- ====================================================================
-- 5. INSERT 10 RECORDS INTO EMPLOYEES
-- ====================================================================
INSERT INTO Employees (EmployeeID, Name, Position, Salary, Department, HireDate)
VALUES (3, 'Charlie Green', 'Analyst', 55000, 'Finance', TO_DATE('2019-04-10', 'YYYY-MM-DD'));

INSERT INTO Employees (EmployeeID, Name, Position, Salary, Department, HireDate)
VALUES (4, 'Diana Prince', 'Director', 95000, 'Management', TO_DATE('2012-11-01', 'YYYY-MM-DD'));

INSERT INTO Employees (EmployeeID, Name, Position, Salary, Department, HireDate)
-->
VALUES (5, 'Evan Wright', 'Developer', 65000, 'IT', TO_DATE('2021-06-01', 'YYYY-MM-DD'));

INSERT INTO Employees (EmployeeID, Name, Position, Salary, Department, HireDate)
VALUES (6, 'Fiona Gallagher', 'HR Specialist', 48000, 'HR', TO_DATE('2020-01-15', 'YYYY-MM-DD'));

INSERT INTO Employees (EmployeeID, Name, Position, Salary, Department, HireDate)
VALUES (7, 'George Brooks', 'QA Engineer', 58000, 'IT', TO_DATE('2018-08-22', 'YYYY-MM-DD'));

INSERT INTO Employees (EmployeeID, Name, Position, Salary, Department, HireDate)
VALUES (8, 'Hannah Abbott', 'Accountant', 62000, 'Finance', TO_DATE('2016-05-14', 'YYYY-MM-DD'));

INSERT INTO Employees (EmployeeID, Name, Position, Salary, Department, HireDate)
VALUES (9, 'Ian Malcolm', 'Data Scientist', 85000, 'IT', TO_DATE('2022-03-11', 'YYYY-MM-DD'));

INSERT INTO Employees (EmployeeID, Name, Position, Salary, Department, HireDate)
VALUES (10, 'Julia Roberts', 'Recruiter', 50000, 'HR', TO_DATE('2021-09-19', 'YYYY-MM-DD'));

INSERT INTO Employees (EmployeeID, Name, Position, Salary, Department, HireDate)
VALUES (11, 'Kevin Bacon', 'Support Tech', 45000, 'IT', TO_DATE('2023-02-01', 'YYYY-MM-DD'));

INSERT INTO Employees (EmployeeID, Name, Position, Salary, Department, HireDate)
VALUES (12, 'Lisa Kudrow', 'VP', 120000, 'Management', TO_DATE('2010-07-07', 'YYYY-MM-DD'));