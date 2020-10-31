CREATE TABLE Cliente (
id_cliente int not null,
nombreCliente VARCHAR(75) not NULL,
numTel int,
correo VARCHAR(75) not NULL,
empresa VARCHAR(75) not NULL,
direccion VARCHAR(75) not NULL,
PRIMARY KEY (id_cliente)
);

CREATE TABLE Desarrolladores (
id_desarrollador int not null,
nombreDesarrollador VARCHAR(75) not NULL,
puesto VARCHAR(75) not NULL,
numTel int,
correo VARCHAR(75) not NULL,
PRIMARY KEY (id_desarrollador)
);

CREATE TABLE Fases (
id_fase int not null,
nombreFase VARCHAR(75) not NULL,
PRIMARY KEY (id_fase)
);

CREATE TABLE Metodologia (
id_metodologia int not null,
nombreMetodologia VARCHAR(75) not NULL,
id_fase int not null,
PRIMARY KEY (id_metodologia),
FOREIGN KEY (id_fase) REFERENCES fases(id_fase)
);

CREATE TABLE Proyecto (
id_proyecto int not null,
nombreProyecto VARCHAR(75) not NULL,
tiempo VARCHAR(75) not NULL,
costo int not NULL,
requisitos VARCHAR(300) not NULL,
avance int not null,
PRIMARY KEY (id_proyecto)
);

select * from Proyecto;