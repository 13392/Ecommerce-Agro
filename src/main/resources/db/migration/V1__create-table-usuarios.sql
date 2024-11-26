CREATE TABLE usuarios (
    id INT PRIMARY KEY not null auto_increment,
    nome VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL,
    telefone VARCHAR(20),
    endereco varchar(100)
);