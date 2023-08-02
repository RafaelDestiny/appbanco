create table dadospessoais(

    id bigint not null auto_increment,
    nome varchar(100) ,
    cpf varchar(100)  ,
    email varchar(100)  ,
    telefone varchar(100) ,
    logradouro varchar(100) ,
    numero varchar(100) ,
    bairro varchar(100) ,
    cep varchar(100) ,
    complemento varchar(100) ,
    usuario varchar(100) ,
    autenticacao varchar(100) ,

    primary key(id)

);