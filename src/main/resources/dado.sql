-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: dado
-- ------------------------------------------------------
-- Server version	5.7.14

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
-- Table structure for table `tirada`
--

DROP TABLE IF EXISTS `tirada`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tirada` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_usuario` int(11) NOT NULL,
  `fecha` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  KEY `usuario_tiene_tiradas` (`id_usuario`),
  CONSTRAINT `usuario_tiene_tiradas` FOREIGN KEY (`id_usuario`) REFERENCES `usuario` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=46 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tirada`
--

LOCK TABLES `tirada` WRITE;
/*!40000 ALTER TABLE `tirada` DISABLE KEYS */;
INSERT INTO `tirada` VALUES (4,1,'2017-03-03 07:40:56'),(5,1,'2017-03-02 07:41:13'),(6,2,'2017-03-01 07:41:27'),(8,2,'2017-03-03 08:18:33'),(9,2,'2017-03-03 08:21:29'),(10,2,'2017-03-03 08:21:38'),(11,1,'2017-03-03 08:24:11'),(12,2,'2017-03-03 08:24:11'),(13,2,'2017-03-03 08:24:12'),(14,1,'2017-03-03 08:24:13'),(15,2,'2017-03-03 08:24:14'),(16,1,'2017-03-03 08:24:15'),(17,2,'2017-03-03 08:26:49'),(18,2,'2017-03-03 08:46:35'),(19,1,'2017-03-03 08:48:17'),(20,2,'2017-03-03 08:48:19'),(21,2,'2017-03-03 09:03:37'),(22,1,'2017-03-03 09:04:43'),(23,1,'2017-03-03 09:05:21'),(24,1,'2017-03-03 09:20:49'),(25,1,'2017-03-03 09:39:46'),(26,2,'2017-03-03 09:39:47'),(27,2,'2017-03-03 09:39:48'),(28,2,'2017-03-03 09:39:49'),(29,2,'2017-03-03 09:39:49'),(30,2,'2017-03-03 09:39:51'),(31,1,'2017-03-03 09:39:52'),(32,1,'2017-03-03 09:39:53'),(33,2,'2017-03-03 09:42:18'),(34,2,'2017-03-03 09:53:12'),(35,2,'2017-03-03 10:46:14'),(36,1,'2017-03-03 11:04:35'),(37,2,'2017-03-03 11:05:04'),(38,1,'2017-03-03 11:05:06'),(39,1,'2017-03-03 11:05:06'),(40,2,'2017-03-03 11:05:07'),(41,1,'2017-03-03 11:05:09'),(42,2,'2017-03-03 11:05:09'),(43,2,'2017-03-03 11:05:11'),(44,1,'2017-03-03 11:05:12'),(45,2,'2017-03-03 11:05:25');
/*!40000 ALTER TABLE `tirada` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usuario` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(255) NOT NULL,
  `fecha_alta` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `fecha_modificacion` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `fecha_baja` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES (1,'eneko','2017-03-01 23:00:00','2017-03-01 23:00:00',NULL),(2,'aaron','2017-03-01 23:00:00',NULL,NULL);
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-03-03 12:10:06
