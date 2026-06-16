-- Scenario 1 
create or replace procedure processmonthlyinterest
is
begin

    update accounts
    set balance = balance + (balance * 0.01)
    where accounttype = 'savings';

    commit;

    dbms_output.put_line('monthly interest processed.');

end;
/

exec processmonthlyinterest;
select * from accounts;

-- Scenario 2 
select * from employees where department='IT';

create or replace procedure updateemployeebonus
(
    p_department     in varchar2,
    p_bonus_percent  in number
)
is
begin

    update employees
    set salary = salary +
                 (salary * p_bonus_percent / 100)
    where department = p_department;

    commit;

    dbms_output.put_line(
        'bonus applied to department: '
        || p_department
    );

end;
/
exec UPDATEEMPLOYEEBONUS('IT', 50);