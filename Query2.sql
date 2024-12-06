create table sample (id int auto_increment primary key, name varchar(20));
insert into sample(name) values ('jack');
select * from sample;


show databases;
use kodnest;
show tables;
select * from student;
desc student;
drop table student;
drop table product;

create table student(Sid int primary key,Sname varchar(40));
insert into student values(1,'John'),(2,'Jack'),(3,'Jogi'),(4,'Thomus'),(5,'Riya'); 





create table branch(
bid int primary key,bname varchar(20),
sid int,
foreign key(Sid) references student(Sid)
);

desc branch;

insert into branch values(1,'ISE',1);
insert into branch values(2,'CSE',2);
insert into branch values(2,'CSE',2);
insert into branch values(3,'CSE',2);
insert into branch values(4,'CSE',3);
insert into branch values(5,'CSE',4);
insert into branch values(6,'Mech',5);
insert into branch values(7,'CSE',6);


create table product(
pid int primary key,
pname varchar(20),
pprice int
);

select * from product; 

insert into product values(1,'mobile',10000),(2,'mobile',20000),(3,'mobile',30000),
(4,'mobile',40000),(5,'mobile',50000);

create view list15 as
select * from product where(pprice>15000);

select * from list15;

create view list25 as
select * from product where pprice>25000;

select * from list25;

show databases;
create database ecommerce;
use ecommerce;

create table cart(count int);
select * from cart;
insert into cart values(0);

show tables;
create table myntracart(

pid int,
pname varchar(20),
pprice int
);

select * from myntracart;
insert into myntracart values(1,'shirt',2000);
delimiter //
create trigger trig_cart
after insert on myntracart for each row 
begin
update cart set count=count+1;
end
//

set sql_safe_updates=0;

create index pricelist
on myntracart(pprice);


create table sample (id int auto_increment primary key, name varchar(20));

select* from sample;
