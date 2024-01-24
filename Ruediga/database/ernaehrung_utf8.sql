CREATE DATABASE  IF NOT EXISTS `ernaehrung` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `ernaehrung`;
-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: ernaehrung
-- ------------------------------------------------------
-- Server version	5.5.5-10.1.26-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `lebensmittel`
--

DROP TABLE IF EXISTS `lebensmittel`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `lebensmittel` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `kategorie` varchar(45) CHARACTER SET latin1 NOT NULL,
  `bezeichnung` varchar(80) CHARACTER SET latin1 DEFAULT NULL,
  `kcal100` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=66 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `lebensmittel`
--

LOCK TABLES `lebensmittel` WRITE;
/*!40000 ALTER TABLE `lebensmittel` DISABLE KEYS */;
INSERT INTO `lebensmittel` VALUES (1,'Fast Food','Döner',750),(2,'Fast Food','Cheeseburger',343),(3,'Fast Food','Big Mac',497),(4,'Fast Food','Pommes Frites',350),(5,'Obst','Apfel',56),(6,'Obst','Banane',94),(7,'Obst','Kiwi',60),(8,'Obst','Birne',51),(9,'Brot','Toastbrot',70),(10,'Brot','Roggenbrot',240),(11,'Brot','Baguette',220),(12,'Brot','Crossaint',350),(13,'Gemüse','Erbsen',82),(14,'Gemüse','Gurke',12),(15,'Gemüse','Kartoffel',69),(16,'Gemüse','Karotte',26),(17,'Milchprodukte','Milch',69),(18,'Milchprodukte','Buttermilch',42),(19,'Milchprodukte','Butter',776),(20,'Milchprodukte','Gouda',350),(21,'Milchprodukte','Parmesan',350),(22,'Milchprodukte','Schlagobers',288),(23,'Teigwaren','Nudeln',160),(24,'Teigwaren','Lasagne',230),(25,'Süßes','Schokopudding',148),(26,'Süßes','Griespudding',138),(27,'Süßes','Schokolade',490),(28,'Süßes','Marzipan',430),(29,'Süßes','Gummibärchen',320),(30,'Fleisch','Rinderfilet',115),(31,'Fleisch','Schweinefilet',170),(32,'Fleisch','Schweinsschnitzel',110),(33,'Fleisch','Bratwurst',370),(34,'Fleisch','Putenbrust',107),(35,'Fleisch','Salami',500),(36,'Fisch','Fischstäbchen',200),(37,'Fisch','Thunfisch',300),(38,'Fisch','Forelle',50),(39,'Fisch','Scholle',40),(40,'Fisch','Lachs',130),(41,'Chips & Co','Chips',500),(42,'Chips & Co','Erdnussflips',600),(43,'Chips & Co','Salzstangen',350),(44,'Chips & Co','Popcorn',380),(45,'Chips & Co','Erdnüsse',600),(46,'Chips & Co','Nachos mit Käse',306),(47,'Süßes','Kinderschokolade',245),(48,'Süßes','Kinderschokolade',245),(49,'Süßes','Kinderpudding',245),(62,'Obst','Omo',100),(63,'Obst','Mumu',100),(64,'Obst','Muli',400),(65,'Bier','Starko',100);
/*!40000 ALTER TABLE `lebensmittel` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-03-04 17:05:42
