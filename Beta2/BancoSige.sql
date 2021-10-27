create database Beta2;
use  Beta2;

-- tabela dos estados
 
create table tblSecretariaEducacao(
Id_Secretaria int not null primary key auto_increment,
Secretaria varchar(150)
);

insert into tblSecretariaEducacao(Secretaria)value('Secretaria da Educação de Cotia');

create table tblEscola(Id_escola int primary key,
NomeEscola varchar(30),
Vagas int,
SecretariaEducacao int not null,
constraint fkSecretaria foreign key(SecretariaEducacao) references tblSecretariaEducacao(Id_Secretaria) on delete cascade on update cascade
);

insert into tblEscola(Id_Escola, NomeEscola,SecretariaEducacao) values(1,"Jose de Abreu",1);
insert into tblEscola(Id_Escola, NomeEscola,SecretariaEducacao) values(2,"E.E. Teste1",1);

create table tblFuncionario(Matricula int primary key,
Nome varchar(90),
Cpf varchar(15),
Email varchar(45),
Perfil varchar(15),
Funcao varchar(15),
Usuario varchar(30) unique,
Senha varchar(16),
Escola  int,
constraint escola_fk foreign key(Escola) references tblEscola(Id_escola) on delete cascade on update cascade,
Secretaria int,
constraint Secretaria_fk foreign key(Secretaria) references tblSecretariaEducacao(Id_Secretaria)
);

insert into tblFuncionario(Matricula,Nome,Cpf,Email,Perfil,Funcao,Usuario,Senha,Secretaria)values(3,"Administrador","11122233344","email@email.com",
"Diretor(a)","Administrador","Admin","admin2332", 1);
insert into tblFuncionario(Matricula,Nome,Cpf,Email,Perfil,Funcao,Usuario,Senha,Escola)values(4,"Administrador","11122233344","email@email.com",
"Diretor(a)","Diretor(a)","AdminEscola","admin2332", 1);
insert into tblFuncionario(Matricula,Nome,Cpf,Email,Perfil,Funcao,Usuario,Senha,Escola)values(5,"Administrador","11122233344","email@email.com",
"Diretor(a)","Diretor(a)","AdminEscola2","admin2332", 2);


create table tblAluno (Id_aluno int primary key,
NomeAluno varchar(50),
RG varchar(15),
Genero varchar(15),
DtNasc date,
Serie varchar(25),
DataMatricula datetime null default now(),
Foto longblob,
Periodo varchar(6),
Fk_escola int not null,
constraint escolafk foreign key(Fk_escola) references tblEscola(Id_escola) on delete cascade on update cascade 
);

create table tblResponsaveis(Id_res int primary key auto_increment,
NomeResponsavel1 varchar(50),
CpfRes1 varchar(15),
NomeResponsavel2 varchar(50),
CpfRes2 varchar(15),
fk_aluno1 int unique,
constraint aluno_fk foreign key(fk_aluno1) references tblAluno(Id_aluno) on delete cascade on update cascade 
);

create table tblContato (Id_tel int primary key auto_increment,
Celular_Res1 varchar(17),
Email varchar(60),
Celular_Res2  varchar(17),
Telefone varchar(15),
Telefone2 varchar(15),
fk_aluno2 int,
constraint aluno_fk2 foreign key(fk_aluno2) references tblAluno(Id_aluno) on delete cascade on update cascade 
);

create table tblEndereco (Id_end int primary key auto_increment,
Cidade varchar(50),
UF varchar(20),
Bairro varchar(40),
Rua varchar(60),
Cep varchar(20),
Numero varchar(9),
Bloco varchar(12),
fk_aluno3 int,
constraint aluno_fk3 foreign key(fk_aluno3) references tblAluno(Id_aluno) on delete cascade on update cascade,
Id_Escola int,
constraint fk_escola foreign key(Id_Escola) references tblEscola(Id_escola) on delete cascade on update cascade 
);

select*from tblaluno;

create table tblParto (Id_Parto int primary key auto_increment,
LocalPar varchar(10),
Peso varchar(6),
Altura varchar(15),
Duracao varchar(10),
DesenvPar varchar(11),
Anestesia varchar(3),
TipoAnes varchar(50),
Choro varchar(20),
Roxo varchar(3),
Ictericia varchar(3),
Incubadora varchar(3),
DiasIncub varchar(10),
fk_aluno4 int not null,
constraint aluno_fk4 foreign key(fk_aluno4) references tblAluno(Id_aluno) on delete cascade on update cascade 
);

create table tblAlimentacao (Id_Alimentacao int primary key auto_increment,
MamaPeito varchar(3),
VezesDia numeric,
UsoMamadeira varchar(3),
MamadeiraQntDia varchar(12),
AlimentoSolido varchar(150),
fk_aluno5 int unique not null,
constraint aluno_fk5 foreign key(fk_aluno5) references tblAluno(Id_aluno) on delete cascade on update cascade 
);

create table tblSono (Id_Sono int primary key auto_increment,
DormeBemNoite varchar(3),
AcordaMadrugada varchar(20),
DormeDia varchar(3),
QuntHr varchar(15),
fk_aluno6 int unique not null,
constraint aluno_fk6 foreign key(fk_aluno6) references tblAluno(Id_aluno) on delete cascade on update cascade 
);

create table tblSaude (Id_Saude int primary key auto_increment,
DecMedic varchar(200),
DescAlergia varchar(200),
ProbRespiratorio varchar(10),
DescCardiaco varchar(150),
DescNeurologico varchar(100),
AcompanhamentoNeuro varchar(150),
DescRestri varchar(150),
RefluxoGastroesofagico varchar(3),
UsoSonda varchar(3),
DescPomada varchar(100),
DeficienciaMotora varchar(3),
DescMotor varchar(100),
ProtesePinosCadeiraRodas varchar(3),
DescConvulsao varchar(100),
DoencasPassadas varchar(30),
OutrasDoencas varchar(100),
Internacao varchar(100),
Benzetacil varchar(100),
MedicamentoFebre varchar(100),
DescConvenio varchar(100),
fk_aluno7 int unique not null,
constraint aluno_fk7 foreign key(fk_aluno7) references tblAluno(Id_aluno) on delete cascade on update cascade 
);

create table tblComportamento (Id_Comportamento int primary key auto_increment,
DescComportamento varchar(100),
Amigavel varchar(3),
TrabSoloGrupo varchar(10),
Frustracao varchar(10),
AjudaColega varchar(3),
AdaptaNovoGptrab varchar(3),
ContatoAmigos varchar(3),
fk_aluno8 int unique not null,
constraint aluno_fk8 foreign key(fk_aluno8) references tblAluno(Id_aluno) on delete cascade on update cascade 
);

create table tblOcorrencia (Id_Ocorrencia int primary key auto_increment,
TipoDeOcorrencia varchar(15),
Descricao varchar(500),
DataDaOcorrencia datetime default now(),
fk_aluno10 int not null,
constraint aluno_fk10 foreign key(fk_aluno10) references tblAluno(Id_aluno) on delete cascade on update cascade 
);

create table tblCensoIBGE (Id_Censo int primary key auto_increment,
Pai varchar(85),
Mae varchar(85),
NumCertidao numeric (30) unique,
Livro varchar(30),
DtExpedicao varchar(30),
Folha varchar(10),
Etnia varchar(15),
fk_aluno9 int unique not null,
constraint fk_aluno9 foreign key(fk_aluno9) references tblAluno(Id_aluno) on delete cascade on update cascade 
);


create view Login as
Select tblFuncionario.Matricula, tblFuncionario.Nome as 'Nome', tblFuncionario.Cpf, tblFuncionario.Usuario as 'Usuario', 
tblFuncionario.Senha as 'Senha', tblFuncionario.Funcao, tblFuncionario.Escola as 'Escola', tblEscola.NomeEscola as 'NomeEscola'
 from tblFuncionario
 inner join tblEscola on tblFuncionario.Escola = tblEscola.Id_escola;
 
select*from Login;

-- Login da secretaria de educação

create view LoginSecretaria as
Select tblFuncionario.Nome as 'Nome', tblFuncionario.Usuario as 'Usuario', tblFuncionario.Senha as 'Senha',
 tblFuncionario.Funcao, tblFuncionario.Secretaria as 'SecretariaId', tblSecretariaEducacao.Secretaria as 'Secretaria'
 from tblFuncionario
 inner join tblSecretariaEducacao on tblFuncionario.Secretaria = tblSecretariaEducacao.Id_Secretaria;

 /* 
 select*from LoginSecretaria;
select*from tblEscola;
select*from tblAluno;
select*from tblendereco;
describe tblEscola;
describe tblEndereco;
describe tblEstado;
describe tblFuncionario;
*/
describe tblAluno;

create table tblAlunoInativo(Id_aluno int not null primary key,
NomeAluno varchar(50),
RG varchar(15),
Genero varchar(15),
DtNasc date, 
Serie varchar(25),
DataSaida datetime default now(),
Foto longblob,
Periodo varchar(6),
EscolaFk int,
constraint escolaAl foreign key(EscolaFk) references tblescola(Id_Escola)
);

create table tblFuncionarioInativo(MatriculaInativo int not null primary key,
Nome varchar(90),
Cpf varchar(15),
Email varchar(45),
Perfil varchar(15),
Funcao varchar(15),
Usuario varchar(30),
Senha varchar(30),
EscolaCod int,
constraint codEscolafk foreign key(EscolaCod) references tblEscola(Id_escola) on delete cascade on update cascade,
CodSecretaria int,
constraint CodSecretariafk foreign key(CodSecretaria) references tblSecretariaEducacao(Id_Secretaria) on delete cascade on update cascade 
);

-- Trigger para armazenar os funcionarios excluidos ou aposentados
Delimiter %%
Create trigger FuncionarioInativo after delete on tblFuncionario for each row

begin
	
    set @Matricula = OLD.Matricula;
    set @Nome = OLD.Nome;
    Set @Cpf = OLD.Cpf;
    set @Email = OLD.Email;
    set @Perfil = OLD.Perfil;
    set @Funcao = OLD.Funcao;
    set @Usuario = OLD.Usuario;
    set @Senha = OLD.Senha;
    set @EscolaCod = OLD.Escola;
    set @CodSecretaria = OLD.Secretaria;
    
    insert into tblFuncionarioInativo(MatriculaInativo,Nome,Cpf,Email,Perfil,Funcao,Usuario,Senha,EscolaCod,CodSecretaria)
    values(@Matricula,@Nome,@Cpf,@Email,@Perfil,@Funcao,@Usuario,@Senha,@EscolaCod,@CodSecretaria);
    
end %%

-- Trigger que armazena todos os alunos que sairam da rede de educação de cotia
Delimiter $$
create trigger AlunoExcluido after delete on tblAluno for each row

begin

	set @CodAluno := OLD.Id_aluno;
	set @Nome := OLD.NomeAluno;
	set @Rg := OLD.RG;
	set @Gen := OLD.Genero;
	set @Nasc := OLD.DtNasc;
	set @Serie := OLD.Serie;
	set @Foto := OLD.Foto;
    set @Periodo :=OLD.Periodo;
	set @escola := OLD.Fk_escola;

	insert into tblAlunoInativo(Id_aluno,NomeAluno,RG,Genero,DtNasc,Serie,Foto,Periodo,EscolaFK)
    values(@CodAluno,@Nome,@Rg,@Gen,@Nasc,@Serie,@Foto,@Periodo,@escola);
end $$
select*from tblAlunoInativo;


-- Conta a quantidade de registros da tabela.
SELECT COUNT(Matricula) FROM tblFuncionario;


-- ---------- Teste do Boletim -----------------------

CREATE TABLE tblDisciplina (
    Id_Disciplina INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    Disciplina NVARCHAR(60)
);


create table tblBoletim(Id_Boletim int not null primary key auto_increment,
Aluno int,
constraint alunofk foreign key(Aluno) references tblAluno(Id_aluno)on delete cascade on update cascade,
Disciplina int,
constraint disciplinafk foreign key(Disciplina) references tblDisciplina(Id_Disciplina)on delete cascade on update cascade,
Bim1 double(4,2),
Bim2 double(4,2),
Bim3 double(4,2),
Bim4 double(4,2),
Anual double(4,2),
Ano datetime default now() 
);

-- Registro de acesso no sistema -------  

drop table tblregistrologin;  

create table tblHistorico(Id_Registro int not null auto_increment primary key,
CodFuncionario int,
Nome varchar(70),
Cpf varchar(16),
CodEscola int,
CodSecretaria int,
Horario datetime default now()
);

 
 create table tblTurma(Id_Turma int not null auto_increment primary key,
 TurmaT varchar(8),
 SerieT varchar(17),
 PeriodoT varchar(7),
 CodAluno int unique,
 constraint CodAluno foreign key(CodAluno) references tblAluno(Id_aluno),
 EscolaCod int,
 constraint EscolaCod foreign key(EscolaCod) references tblEscola(Id_Escola)
 );


create table tblHistoricoTransferencia(Id_transferencia int not null primary key auto_increment,
CodigoAluno int,
constraint CodigoAluno foreign key(CodigoAluno) references tblAluno(Id_aluno),
Periodo varchar(10),
CodigoEscola int,
constraint CodigoEscola foreign key(CodigoEscola) references tblEscola(Id_escola),
DataTranferencia datetime default now()
);


create table tblSolicitacaoTrf(Id_Solicitacao int not null primary key auto_increment,
Aluno int,
constraint Aluno foreign key(Aluno) references tblAluno(Id_aluno),
PeriodoTrf varchar(50),
SerieTrf varchar(50),
TurmaTrf varchar(50),
DataSolicitacao datetime default now(),
CodigoEscolar int,
constraint CodigoEscolar foreign key(CodigoEscolar) references tblEscola(Id_escola),
Stats varchar(20)
);

update tblSolicitacaoTrf set Stats = 'Inativo' where Aluno = '123456789';

select day(DataSolicitacao) as 'Dia' from tblSolicitacaoTrf; 
select*from tblSolicitacaoTrf;
select*from tblAluno;
select*from tblTurma;
select*from tblHistorico;

update tblSolicitacaoTrf set DataSolicitacao = '2019-10-19 00:25:53' where Id_Solicitacao = 9;

delete from tblTurma where TurmaT = 'Turma B' and SerieT = 'Maternal I' and PeriodoT = 'Manhã' and EscolaCod = '1';


create table tblHistoricoTurma(IdHist_Turma int not null primary key auto_increment,
RaAluno int,
constraint );