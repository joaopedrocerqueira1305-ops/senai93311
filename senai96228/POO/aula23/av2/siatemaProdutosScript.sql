create database sistema_produto;
use sistema_produto;
CREATE TABLE usuario ( 
 id INT PRIMARY KEY AUTO_INCREMENT,  
 nome VARCHAR(20) NOT NULL,  
 senha VARCHAR(20) NOT NULL
); 

CREATE TABLE Produto ( 
 id_produto INT PRIMARY KEY AUTO_INCREMENT,  
 nome VARCHAR(30) NOT NULL,  
 quantidade INT NOT NULL,  
 preco FLOAT NOT NULL,  
 idUsuario INT ); 

ALTER TABLE Produto ADD FOREIGN KEY(idUsuario) REFERENCES usuario (id);
show tables;
select * from usuario;
select * from produto;