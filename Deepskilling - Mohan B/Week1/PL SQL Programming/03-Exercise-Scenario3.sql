SELECT AccountID,Balance
FROM Accounts;
CREATE OR REPLACE PROCEDURE TransferFunds
(
    p_from_account IN NUMBER,
    p_to_account   IN NUMBER,
    p_amount       IN NUMBER
)
IS

    v_balance NUMBER;

BEGIN

    SELECT Balance
    INTO v_balance
    FROM Accounts
    WHERE AccountID = p_from_account;

    IF v_balance >= p_amount THEN

        UPDATE Accounts
        SET Balance = Balance - p_amount
        WHERE AccountID = p_from_account;

        UPDATE Accounts
        SET Balance = Balance + p_amount
        WHERE AccountID = p_to_account;

        COMMIT;

        DBMS_OUTPUT.PUT_LINE(
            'Transfer Successful'
        );

    ELSE

        DBMS_OUTPUT.PUT_LINE(
            'Insufficient Balance'
        );

    END IF;

EXCEPTION

    WHEN NO_DATA_FOUND THEN

        DBMS_OUTPUT.PUT_LINE(
            'Account Not Found'
        );

    WHEN OTHERS THEN

        ROLLBACK;

        DBMS_OUTPUT.PUT_LINE(
            'Error: ' || SQLERRM
        );
select accountid,balance
from accounts;
create or replace procedure transferfunds
(
    p_from_account in number,
    p_to_account   in number,
    p_amount       in number
)
is

    v_balance number;

begin

    select balance
    into v_balance
    from accounts
    where accountid = p_from_account;

    if v_balance >= p_amount then

        update accounts
        set balance = balance - p_amount
        where accountid = p_from_account;

        update accounts
        set balance = balance + p_amount
        where accountid = p_to_account;

        commit;

        dbms_output.put_line(
            'transfer successful'
        );

    else

        dbms_output.put_line(
            'insufficient balance'
        );

    end if;

exception

    when no_data_found then

        dbms_output.put_line(
            'account not found'
        );

    when others then

        rollback;

        dbms_output.put_line(
            'error: ' || sqlerrm
        );

end;
/

exec transferfunds(1,2,459);
END;
/

EXEC TransferFunds(1,2,459);