SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL';

CREATE SCHEMA IF NOT EXISTS `vicus` DEFAULT CHARACTER SET latin1 ;
USE `vicus` ;

-- -----------------------------------------------------
-- Table `vicus`.`Inventario`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `vicus`.`Inventario` (
  `idInventario` INT NOT NULL COMMENT 'Identificacion del ganado.' ,
  `tipo` VARCHAR(7) NOT NULL COMMENT 'Vaca, toro o ternero.' ,
  `sexo` VARCHAR(1) NULL COMMENT 'Macho o hembra.' ,
  `raza` VARCHAR(25) NULL COMMENT 'Raza del ganado.' ,
  `peso` FLOAT NULL COMMENT 'Peso del ganado.' ,
  `color` VARCHAR(15) NULL COMMENT 'Color de piel.' ,
  `fecha_nac` DATE NOT NULL COMMENT 'Nacimiento del ganado.' ,
  `madre` INT NULL COMMENT 'Ascendencia directa.' ,
  `descripcion` LONGTEXT NULL COMMENT 'Caracteristicas generales.' ,
  `medicamentos` MEDIUMTEXT NULL COMMENT 'Medicamentos preescritos.' ,
  `foto` TEXT NULL COMMENT 'Direccion de la fotografia.' ,
  PRIMARY KEY (`idInventario`) )
ENGINE = MariaDB
COMMENT = 'Tabla del inventario de ganado de la finca.';


-- -----------------------------------------------------
-- Table `vicus`.`Contactos`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `vicus`.`Contactos` (
  `idContactos` INT NOT NULL COMMENT 'Identificacion del contacto.' ,
  `nombres` VARCHAR(20) NOT NULL COMMENT 'Nombre del contacto.' ,
  `apellidos` VARCHAR(30) NOT NULL COMMENT 'Apellidos del contacto.' ,
  `direccion` MEDIUMTEXT NULL COMMENT 'Direccion residencial o de la oficina del contacto.' ,
  `telefono` VARCHAR(7) NULL COMMENT 'Telefono residencial o de oficina del contacto.' ,
  `celular` VARCHAR(8) NULL COMMENT 'Telefono movil del contacto.' ,
  `fax` VARCHAR(7) NULL COMMENT 'Fax de la oficina del contacto.' ,
  `apar_post` VARCHAR(50) NULL COMMENT 'Apartado postal del contacto.' ,
  `correo_elect` VARCHAR(25) NULL COMMENT 'E-mail del contacto.' ,
  `oficio` VARCHAR(45) NULL COMMENT 'Labor que desempeña en la empresa.' ,
  `descripcion` MEDIUMTEXT NULL COMMENT 'Informacion basica del contacto.' ,
  `empresa` VARCHAR(25) NULL ,
  PRIMARY KEY (`idContactos`) )
ENGINE = MariaDB
COMMENT = 'Tabla de los contactos de la finca.';


-- -----------------------------------------------------
-- Table `vicus`.`Evento`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `vicus`.`Evento` (
  `idEvento` INT NOT NULL ,
  `fecha` DATE NOT NULL ,
  `hora` TIME NULL ,
  `descripcion` MEDIUMTEXT NULL ,
  `nombre` VARCHAR(25) NOT NULL ,
  `lugar` VARCHAR(50) NULL ,
  PRIMARY KEY (`idEvento`) )
ENGINE = MariaDB;


-- -----------------------------------------------------
-- Table `vicus`.`Ingreso`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `vicus`.`Ingreso` (
  `idIngreso` INT NOT NULL ,
  `descripcion` MEDIUMTEXT NULL ,
  `fecha` DATE NULL ,
  `cantidad` DECIMAL(2) NOT NULL ,
  `lugar` VARCHAR(50) NULL ,
  `Evento_idEvento` INT NOT NULL ,
  PRIMARY KEY (`idIngreso`) ,
  INDEX `fk_Ingreso_Evento1` (`Evento_idEvento` ASC) ,
  CONSTRAINT `fk_Ingreso_Evento1`
    FOREIGN KEY (`Evento_idEvento` )
    REFERENCES `vicus`.`Evento` (`idEvento` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = MariaDB
COMMENT = 'Tabla para los eventos financieros positivos.';


-- -----------------------------------------------------
-- Table `vicus`.`Egreso`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `vicus`.`Egreso` (
  `idEgreso` INT NOT NULL ,
  `descripcion` MEDIUMTEXT NULL ,
  `fecha` DATE NULL ,
  `cantidad` DECIMAL(2) NOT NULL ,
  `lugar` VARCHAR(50) NULL ,
  `Evento_idEvento` INT NOT NULL ,
  PRIMARY KEY (`idEgreso`) ,
  INDEX `fk_Egreso_Evento` (`Evento_idEvento` ASC) ,
  CONSTRAINT `fk_Egreso_Evento`
    FOREIGN KEY (`Evento_idEvento` )
    REFERENCES `vicus`.`Evento` (`idEvento` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = MariaDB
COMMENT = 'Tabla para los eventos financieros positivos.';



SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
