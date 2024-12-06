use project_cse305;

create table login (
	username varchar(25) not null primary key,
    password varchar(25) not null
);
update login set mail = 'vi123@gmail.com' where username = 'Vi123';


create table user (
	username varchar(25) not null,
    fullname varchar(25),
    Date_of_birth date,
    job varchar(25),
    monthlyIncome float,
    constraint fk_username foreign key (username) references login(username)
);

insert into user
values ('Anh123','Đỗ Viết Anh','2003-01-18','Student','2000000'),
('Hieu123','Thái Phan Anh Hiểu','2004-05-19','Developer','10000000');

select * from login;

create table expenses (
	expense_id int unique not null primary key,
	username varchar(25) not null,
    year int,
    month int,
    day int,
    type_name varchar(25),
    amount float,
    description varchar(45) 
);

select * from expenses;


insert into expenses
values (null,'ABC123','2023','11','01','Food','100000', null);
select * from expenses;

create table types (
	type_name varchar(25) primary key
);

create table limits (
	username varchar(25),
    type_name varchar(25),
    limitation int,
    status varchar(25)
);
insert into limits 
values 
('Anh123', 'Coffee', null,null),
('Hieu123', 'Coffee', null,null),
('Binh123', 'Coffee', null,null),
('Vi123', 'Coffee', null,null),
('Duc123', 'Coffee', null,null),
('ABC123', 'Coffee', null,null),
('Nhan123', 'Coffee', null,null),
('Huy', 'Coffee', null,null),
('Hung123', 'Coffee', null,null),
('Phuc123', 'Coffee', null,null),
('Anh123', 'Shopping', null,null),
('Hieu123', 'Shopping', null,null),
('Binh123', 'Shopping', null,null),
('Vi123', 'Shopping', null,null),
('Duc123', 'Shopping', null,null),
('ABC123', 'Shopping', null,null),
('Nhan123', 'Shopping', null,null),
('Huy', 'Shopping', null,null),
('Hung123', 'Shopping', null,null),
('Phuc123', 'Shopping', null,null),
('Anh123', 'House Fee', null,null),
('Hieu123', 'House Fee', null,null),
('Binh123', 'House Fee', null,null),
('Vi123', 'House Fee', null,null),
('Duc123', 'House Fee', null,null),
('ABC123', 'House Fee', null,null),
('Nhan123', 'House Fee', null,null),
('Huy', 'House Fee', null,null),
('Hung123', 'House Fee', null,null),
('Phuc123', 'House Fee', null,null),
('Anh123', 'Education', null,null),
('Hieu123', 'Education', null,null),
('Binh123', 'Education', null,null),
('Vi123', 'Education', null,null),
('Duc123', 'Education', null,null),
('ABC123', 'Education', null,null),
('Nhan123', 'Education', null,null),
('Huy', 'Education', null,null),
('Hung123', 'Education', null,null),
('Phuc123', 'Education', null,null),
('Anh123', 'Food', null,null),
('Hieu123', 'Food', null,null),
('Binh123', 'Food', null,null),
('Vi123', 'Food', null,null),
('Duc123', 'Food', null,null),
('ABC123', 'Food', null,null),
('Nhan123', 'Food', null,null),
('Huy', 'Food', null,null),
('Hung123', 'Food', null,null),
('Phuc123', 'Food', null,null);


insert into types
values 
('Education'),
('Coffee'),
('House Fee');



update expenses set amount = 15000, type_name = 'Food' where expense_id = 2;
update expenses set date = '2024-10-18' where expense_id = 1;
alter table user drop foreign key fk_username;
select username, password from login where username = 'vieu123'and password = '123456';

select type_name, sum(amount) from expenses where username = 'Anh123'
group by type_name;

alter table user add column mail varchar(25);

select l.limitation, l.type_name from limits l
where l.username = 'ABC123'
order by type_name;



SELECT l.type_name, sum(e.amount) as total_spend, l.limitation  as limit_amount FROM limits l JOIN expenses e ON e.type_name = l.type_name where l.username = 'ABC123' and e.username = 'ABC123' GROUP By e.username , l.type_name, l.limitation;


update limits set limitation = 4000000 where username = 'ABC123' and type_name = 'House Fee';


SELECT sum(amount) from expenses where username = 'ABC123'




