use cadastro_produto;
show tables;
drop database cadastro_produto;
create database cadastro_produto;
create table produto(
id int primary key auto_increment,
nome varchar(20) not null,
categoria varchar(30) not null,
preco float not null,
quantidade int not null);

select * from produto;