

create database projetoferiado

go

use projetoferiado 

go

create table projferiado(
	id_feriado			bigint primary key identity		not null,
	tipo_feriado		varchar(30)						not null,
	descricao_feriado	varchar(60)						not null,
	data_feriado		date							not null);
go
