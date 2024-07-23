drop database SGBDVideojuegos2023478;

create database SGBDVideojuegos2023478;

use SGBDVideojuegos2023478;

create table Juegos(
	juegoId int not null auto_increment,
    nombreJuego varchar(60) not null,
    plataformaJuego varchar(60) not null,
    precio decimal(10,2),
    primary key PK_juegoId(juegoId)
);

insert into Juegos (nombreJuego, plataformaJuego, precio) values
	('Mario Bros', 'Nintendo', 59.99),
    ('Spider-man', 'Playstation', 29.50),
    ('Forza Horizon', 'Xbox y PC', 30.10),
    ('Truck Simulator', 'PC', 10.00);
    
select * from Juegos;