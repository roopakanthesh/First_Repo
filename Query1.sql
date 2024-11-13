show databases;
use kodnest;

show tables;
select * from student;

delete from student where id=3; 
update student set age = 21 where id=2;

create table mobile
(id int primary key,price int,model varchar(30));

insert into mobile values(4,56000,"i13");
insert into mobile values(5,50000,"i14");
update mobile set price = 160000,model = "i15" where id= 5;

select * from  mobile;

update mobile set model = 'i13', price=200000 where id = 4;

alter table mobile rename to mobileshop;


select * from mobileshop;

insert into mobileshop values (3,25000,"realme");
alter table mobileshop add location varchar(30);


alter table mobileshop drop column location;

delete from mobileshop where id =4;

truncate table mobileshop;

desc mobileshop;
rollback;

set autocommit = 0;
delete  from mobileshop where id = 3;


create user 'roopak'@'localhost' identified by 'roopak89';
grant all privileges on *.* to 'roopak'@'localhost';


create user 'kroopa'@'localhost' identified by 'kroopa89';
grant all privileges on *.* to 'kroopa'@'localhost';


insert into mobileshop values (4,10000,'realme'),(5,20000,'realme'),(6,30000,'realme');

delimiter //
create procedure pro1()
begin
select * from mobileshop where price>25000;
end
//

call pro1();

delimiter ??
create procedure pro5(in a int)
begin
select * from mobileshop where price<a;
end
??
call pro5(30000);

select * from product;
delimiter //
create procedure pro2()
begin
select * from product where price<50000;
end
//
call pro2();

select * from product;
delimiter //
create procedure pro2()
begin
select * from product where price<50000;
end
//
call pro2();
