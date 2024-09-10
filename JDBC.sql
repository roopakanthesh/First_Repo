
show databases;
use kodnest;
show tables;

create database KODNESTJDBC;
use KODNESTjdbc;
show tables;
select * from student;
select* from kodnestjdbc;
select * from products;


create table bank(acc_no int,name varchar(20),balance int);
desc bank;

select * from bank;

create table employee(id int,name varchar(30));
desc employee;
select * from employee;