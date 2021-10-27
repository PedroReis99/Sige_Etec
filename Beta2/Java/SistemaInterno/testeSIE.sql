create database testeSIE;
use  testeSIE;

create table tblLogin (idlogin int primary key auto_increment,
Nome varchar(50),
Email varchar(50),
cpf varchar(12),
login varchar(50),
senha varchar(12)
);


create table tblAluno (idAluno int primary key auto_increment,
NomeAluno varchar(50),
RG varchar(15),
descricao varchar(150)
);

create table tblResponsaveis(idres int primary key auto_increment,
NomePai varchar(50),
NomeMae varchar(50),
CpfPai varchar(15),
CpfMae varchar(15) 
);

alter table tblResponsaveis add idAlunoFK int not null;
-- alter table tblproduto add idmarcaFK int not null;
describe tblResponsaveis;
describe tblTelefone;

create table tblTelefone (idtel int primary key auto_increment,
telefone varchar(11)
);
alter table tblTelefone add idAlunoFK int not null;

create table tblEndereco (idend int primary key auto_increment,
cidade varchar(50),
estado varchar(50),
rua varchar(60),
cep varchar(20),
numero varchar(7)
);
alter table tblEndereco add idAlunoFK int not null;

describe tblResponsaveis;
describe tblTelefone;
describe tblAluno;
describe tblEndereco;
describe tblLogin;
select*from tblAluno;
select*from tblResponsaveis;








describe  tblLogin;
select*from tblLogin;
select*from tblAluno2;


create table tblAluno2 (idAluno int primary key,
NomeAluno varchar(50),
RG varchar(15),
descricao varchar(150),
NomePai varchar(50),
NomeMae varchar(50),
CpfPai varchar(15),
CpfMae varchar(15),
telefone varchar(11),
telCelP varchar(11),
telCelM varchar(11),
cidade varchar(50),
estado varchar(50),
rua varchar(60),
cep varchar(20),
numero varchar(7)
);

