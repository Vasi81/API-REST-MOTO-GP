CREATE DATABASE MOTO_GP;
USE MOTO_GP;

CREATE TABLE PILOTOS
(ID_PILOTO INT NOT NULL PRIMARY KEY,
NOMBRE VARCHAR(40) NOT NULL,
APELLIDO VARCHAR(40) NOT NULL,
NACIONALIDAD VARCHAR (40) NOT NULL,
EQUIPO VARCHAR(40) NOT NULL,
MOTO VARCHAR (40) NOT NULL,
PUNTOS INT
);
INSERT INTO `moto_gp`.`pilotos` (`ID_PILOTO`, `NOMBRE`, `APELLIDO`, `NACIONALIDAD`, `EQUIPO`, `MOTO`, `PUNTOS`) VALUES ('4', 'Andrea ', 'Dovizioso', 'Italia', 'WithU Yamaha RNG MotoGp Team', 'Yamaha', '0');
INSERT INTO `moto_gp`.`pilotos` (`ID_PILOTO`, `NOMBRE`, `APELLIDO`, `NACIONALIDAD`, `EQUIPO`, `MOTO`, `PUNTOS`) VALUES ('5', 'Johann ', 'Zarco', 'Francia', 'Prima Pramac Racing', 'Ducati', '0');
INSERT INTO `moto_gp`.`pilotos` (`ID_PILOTO`, `NOMBRE`, `APELLIDO`, `NACIONALIDAD`, `EQUIPO`, `MOTO`, `PUNTOS`) VALUES ('6', 'Stefan ', 'Bradl', 'Alemania', 'Repsol Honda Team', 'Honda', '0');
INSERT INTO `moto_gp`.`pilotos` (`ID_PILOTO`, `NOMBRE`, `APELLIDO`, `NACIONALIDAD`, `EQUIPO`, `MOTO`, `PUNTOS`) VALUES ('10', 'Luca ', 'Marini', 'Italia', 'Mooney VR46 Racing Team', 'Ducati', '0');
INSERT INTO `moto_gp`.`pilotos` (`ID_PILOTO`, `NOMBRE`, `APELLIDO`, `NACIONALIDAD`, `EQUIPO`, `MOTO`, `PUNTOS`) VALUES ('12', 'Maverick ', 'Viñales', 'España', 'Aprilia Racing ', 'Aprilia', '0');
INSERT INTO `moto_gp`.`pilotos` (`ID_PILOTO`, `NOMBRE`, `APELLIDO`, `NACIONALIDAD`, `EQUIPO`, `MOTO`, `PUNTOS`) VALUES ('41', 'Aleix ', 'Espargaro', 'España', 'Aprilia Racing ', 'Aprilia', '0');
INSERT INTO `moto_gp`.`pilotos` (`ID_PILOTO`, `NOMBRE`, `APELLIDO`, `NACIONALIDAD`, `EQUIPO`, `MOTO`, `PUNTOS`) VALUES ('20', 'Fabio ', 'Quartararo', 'Francia', 'Monster Energy Yamaha MotoGp', 'Yamaha', '0');
INSERT INTO `moto_gp`.`pilotos` (`ID_PILOTO`, `NOMBRE`, `APELLIDO`, `NACIONALIDAD`, `EQUIPO`, `MOTO`, `PUNTOS`) VALUES ('21', 'Franco ', 'Morbidelli', 'Italia', 'Monster Energy Yamaha MotoGP', 'Yamaha', '0');
INSERT INTO `moto_gp`.`pilotos` (`ID_PILOTO`, `NOMBRE`, `APELLIDO`, `NACIONALIDAD`, `EQUIPO`, `MOTO`, `PUNTOS`) VALUES ('51', 'Michele ', 'Pirro', 'Italia', 'Arruba.it Racing', 'Ducati', '0');
INSERT INTO `moto_gp`.`pilotos` (`ID_PILOTO`, `NOMBRE`, `APELLIDO`, `NACIONALIDAD`, `EQUIPO`, `MOTO`, `PUNTOS`) VALUES ('23', 'Enea ', 'Bastianini', 'Italia', 'Gresini Racing MotoGP', 'Ducati', '0');
INSERT INTO `moto_gp`.`pilotos` (`ID_PILOTO`, `NOMBRE`, `APELLIDO`, `NACIONALIDAD`, `EQUIPO`, `MOTO`, `PUNTOS`) VALUES ('25', 'Raul ', 'Fernandez', 'España', 'Tech3 KTM Factory Racing', 'KTM', '0');
INSERT INTO `moto_gp`.`pilotos` (`ID_PILOTO`, `NOMBRE`, `APELLIDO`, `NACIONALIDAD`, `EQUIPO`, `MOTO`, `PUNTOS`) VALUES ('30', 'Takaaki', 'Nakagami', 'Japon', 'LCR Honda', 'Honda', '0');
INSERT INTO `moto_gp`.`pilotos` (`ID_PILOTO`, `NOMBRE`, `APELLIDO`, `NACIONALIDAD`, `EQUIPO`, `MOTO`, `PUNTOS`) VALUES ('33', 'Brad', 'Binder', 'Sudafrica', 'Red Bull KTM Factory Racing', 'KTM', '0');
INSERT INTO `moto_gp`.`pilotos` (`ID_PILOTO`, `NOMBRE`, `APELLIDO`, `NACIONALIDAD`, `EQUIPO`, `MOTO`, `PUNTOS`) VALUES ('36', 'Joan ', 'Mir', 'España', 'Team Suzuki Ecstar', 'Suzuki', '0');
INSERT INTO `moto_gp`.`pilotos` (`ID_PILOTO`, `NOMBRE`, `APELLIDO`, `NACIONALIDAD`, `EQUIPO`, `MOTO`, `PUNTOS`) VALUES ('40', 'Darryn ', 'Binder', 'Sudafrica', 'WithU Yamaha RNG MotoGp Team', 'Yamaha', '0');
INSERT INTO `moto_gp`.`pilotos` (`ID_PILOTO`, `NOMBRE`, `APELLIDO`, `NACIONALIDAD`, `EQUIPO`, `MOTO`, `PUNTOS`) VALUES ('42', 'Alex', 'Rins', 'España', 'Team Suzuki Ecstar', 'Suzuki', '0');
INSERT INTO `moto_gp`.`pilotos` (`ID_PILOTO`, `NOMBRE`, `APELLIDO`, `NACIONALIDAD`, `EQUIPO`, `MOTO`, `PUNTOS`) VALUES ('43', 'Jack', 'Miller', 'Australia', 'Ducati Lenovo Team', 'Ducati', '0');
INSERT INTO `moto_gp`.`pilotos` (`ID_PILOTO`, `NOMBRE`, `APELLIDO`, `NACIONALIDAD`, `EQUIPO`, `MOTO`, `PUNTOS`) VALUES ('44', 'Pol', 'Espargaro', 'España', 'Repsol Honda Team', 'Honda', '0');
INSERT INTO `moto_gp`.`pilotos` (`ID_PILOTO`, `NOMBRE`, `APELLIDO`, `NACIONALIDAD`, `EQUIPO`, `MOTO`, `PUNTOS`) VALUES ('93', 'Marc', 'Marquez', 'España', 'Repsol Honda Team', 'Honda', '0');
INSERT INTO `moto_gp`.`pilotos` (`ID_PILOTO`, `NOMBRE`, `APELLIDO`, `NACIONALIDAD`, `EQUIPO`, `MOTO`, `PUNTOS`) VALUES ('49', 'Fabio', 'Di Giannantonio', 'Italia', 'Gresini Racing MotoGP', 'Ducati', '0');
INSERT INTO `moto_gp`.`pilotos` (`ID_PILOTO`, `NOMBRE`, `APELLIDO`, `NACIONALIDAD`, `EQUIPO`, `MOTO`, `PUNTOS`) VALUES ('63', 'Francesco ', 'Bagnaia', 'Italia', 'Ducati Lenovo Team', 'Ducati', '0');
INSERT INTO `moto_gp`.`pilotos` (`ID_PILOTO`, `NOMBRE`, `APELLIDO`, `NACIONALIDAD`, `EQUIPO`, `MOTO`, `PUNTOS`) VALUES ('72', 'Marco ', 'Bezzecchi', 'Italia', 'Mooney VR46 Racing Team', 'Ducati', '0');
INSERT INTO `moto_gp`.`pilotos` (`ID_PILOTO`, `NOMBRE`, `APELLIDO`, `NACIONALIDAD`, `EQUIPO`, `MOTO`, `PUNTOS`) VALUES ('73', 'Alex', 'Marquez', 'España', 'LCR Honda', 'Honda', '0');
INSERT INTO `moto_gp`.`pilotos` (`ID_PILOTO`, `NOMBRE`, `APELLIDO`, `NACIONALIDAD`, `EQUIPO`, `MOTO`, `PUNTOS`) VALUES ('87', 'Remy', 'Gardner', 'Australia', 'Tech3 KTM Factory Racing', 'KTM', '0');
INSERT INTO `moto_gp`.`pilotos` (`ID_PILOTO`, `NOMBRE`, `APELLIDO`, `NACIONALIDAD`, `EQUIPO`, `MOTO`, `PUNTOS`) VALUES ('88', 'Miguel', 'Oliveira', 'Portugal', 'Red Bull KTM Factory Racing', 'KTM', '0');
INSERT INTO `moto_gp`.`pilotos` (`ID_PILOTO`, `NOMBRE`, `APELLIDO`, `NACIONALIDAD`, `EQUIPO`, `MOTO`, `PUNTOS`) VALUES ('89', 'Jorge', 'Martin', 'España', 'Prima Pramac Racing', 'Ducati', '0');
CREATE TABLE EQUIPOS
(NOMBRE_EQUIPO VARCHAR (40) NOT NULL PRIMARY KEY,
NACIONALIDAD VARCHAR (40) NOT NULL
);
INSERT INTO `moto_gp`.`equipos` (`NOMBRE_EQUIPO`, `NACIONALIDAD`) VALUES ('Aprilia Racing', 'Italia');
INSERT INTO `moto_gp`.`equipos` (`NOMBRE_EQUIPO`, `NACIONALIDAD`) VALUES ('Arruba.it Racing', 'Italia');
INSERT INTO `moto_gp`.`equipos` (`NOMBRE_EQUIPO`, `NACIONALIDAD`) VALUES ('Gresini Racing MotoGp', 'Italia');
INSERT INTO `moto_gp`.`equipos` (`NOMBRE_EQUIPO`, `NACIONALIDAD`) VALUES ('Mooney VR46 Racing Team', 'Italia');
INSERT INTO `moto_gp`.`equipos` (`NOMBRE_EQUIPO`, `NACIONALIDAD`) VALUES ('LCR Honda', 'Japon');
INSERT INTO `moto_gp`.`equipos` (`NOMBRE_EQUIPO`, `NACIONALIDAD`) VALUES ('Prima Pramac Racing', 'Italia');
INSERT INTO `moto_gp`.`equipos` (`NOMBRE_EQUIPO`, `NACIONALIDAD`) VALUES ('Monster Energy Yamaha MotoGp', 'Japon');
INSERT INTO `moto_gp`.`equipos` (`NOMBRE_EQUIPO`, `NACIONALIDAD`) VALUES ('Red Bull KTM Factory Racing', 'Austria');
INSERT INTO `moto_gp`.`equipos` (`NOMBRE_EQUIPO`, `NACIONALIDAD`) VALUES ('Repsol Honda Team', 'Japon');
INSERT INTO `moto_gp`.`equipos` (`NOMBRE_EQUIPO`, `NACIONALIDAD`) VALUES ('Team Suzuki Ecstar', 'Japon');
INSERT INTO `moto_gp`.`equipos` (`NOMBRE_EQUIPO`, `NACIONALIDAD`) VALUES ('Tech3 KTM Factory Racing', 'Austria');
INSERT INTO `moto_gp`.`equipos` (`NOMBRE_EQUIPO`, `NACIONALIDAD`) VALUES ('Ducati Lenovo Team', 'Italia');

CREATE TABLE GRAN_PREMIO
(ID_GRAN_PREMIO INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
PAIS VARCHAR(40) NOT NULL,
CIUDAD VARCHAR(40) NOT NULL,
FECHA DATE NOT NULL,
LONGITUD_CIRCUITO INT
);

CREATE TABLE RESULTADOS
(ID INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
ID_PILOTO INT NOT NULL,
POSICION INT,
ID_GRAN_PREMIO INT NOT NULL,
FOREIGN KEY (ID_PILOTO) REFERENCES PILOTOS(ID_PILOTO),
FOREIGN KEY (ID_GRAN_PREMIO) REFERENCES GRAN_PREMIO(ID_GRAN_PREMIO)
);

CREATE TABLE ESTADISTICAS
(ID INT NOT NULL PRIMARY KEY,
ID_GRAN_PREMIO INT NOT NULL,
FOREIGN KEY (ID_GRAN_PREMIO) REFERENCES GRAN_PREMIO (ID_GRAN_PREMIO),
FOREIGN KEY (ID_PILOTO) REFERENCES PILOTOS (ID_PILOTO),
VELOCIDAD_PUNTA INT,
VELOCIDAD_MEDIA INT,
CAIDAS INT
);

CREATE USER 'moto_gp'IDENTIFIED BY 'moto_gp';
GRANT ALL PRIVILEGES ON moto_gp.* TO 'moto_gp';
FLUSH privileges;

FLUSH PRIVILEGES;



