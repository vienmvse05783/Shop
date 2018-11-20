use master
go
drop database shop

use master
go

create database shop

go

use shop

go

create table [Role](
	role_id int primary key,
	role_name varchar(100) not null
)

create table [User](
	id int identity,
	email varchar(50),
	username varchar(50) unique not null,
	[password] varchar(36) not null,
	role_id int not null references [Role](role_id),
	avatar varchar(50),

	primary key(id)
)



create table Category(
	cate_id int identity primary key,
	cate_name nvarchar(255) not null,
)


create table Product(
	pro_id int identity primary key,
	pro_name nvarchar(255) not null,
	origin_price numeric(12,2) not null,
	sale_price numeric(12,2) not null,
	quantity int not null,
	cate_id int references Category(cate_id) not null,
	pro_size varchar(50),
	pro_desc nvarchar(255)
)


create table [Order](
	order_id int identity primary key,
	customer_id int not null references [User](id),
	order_date timestamp not null
)

create table Order_Detail(
	order_id int references [Order](order_id),
	pro_id int not null references Product(pro_id),
	unit_price numeric(12,2) not null,
	quantity int not null,
	total numeric(12,2) not null,
	primary key (order_id,pro_id)
)



insert into [Role] values(1,'admin')
insert into [Role] values(2,'customer')
