


--
-- Table structure for table `products`
--

DROP TABLE IF EXISTS `products`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `products`(
	`code` varchar(56) NOT NULL,
	`image` varchar(512),
	`name` varchar(256),
	`price` double precision NOT NULL,
	`created_date` datetime NOT NULL,
	PRIMARY KEY (`code`)
)ENGINE=InnoDB DEFAULT CHARSET= latin1;

/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `products`
--

LOCK TABLES `products` WRITE;
/*!40000 ALTER TABLE `products` DISABLE KEYS */;

INSERT INTO `products` VALUES('UP UP7560M', 'https://media.napaonline.com/is/image/GenuinePartsCompany/NWMTMB?$Product=GenuinePartsCompany/1333323', 'NAPA Ultra Premium Brake Parts', 100, CURRENT_TIMESTAMP);
INSERT INTO `products` VALUES('VCL 601457', 'https://media.napaonline.com/is/image/GenuinePartsCompany/NWMTMB?$Product=GenuinePartsCompany/2123594', 'Valvoline Chemicals', 105, CURRENT_TIMESTAMP);
INSERT INTO `products` VALUES('VCL 601458', 'https://media.napaonline.com/is/image/GenuinePartsCompany/NWMTMB?$Product=GenuinePartsCompany/2123597', 'Valvoline Chemicals', 107, CURRENT_TIMESTAMP);
INSERT INTO `products` VALUES('PAF AS401Y', 'https://media.napaonline.com/is/image/GenuinePartsCompany/NWMTMB?$Product=GenuinePartsCompany/1793334', 'Prestone', 110, CURRENT_TIMESTAMP);

/*!40000 ALTER TABLE `products` ENABLE KEYS */;
UNLOCK TABLES;


--
-- Table structure for table `carts`
--

DROP TABLE IF EXISTS `carts`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `carts`(
	`id` varchar(56) NOT NULL,
	`amount` double precision NOT NULL,
	`customer_address` varchar(256) NOT NULL,
	`customer_email` varchar(128) NOT NULL,
	`customer_name` varchar(256) NOT NULL,
	`customer_phone` bigint(20) NOT NULL,
	`order_date` datetime NOT NULL,
	`order_num` integer NOT NULL UNIQUE,
	PRIMARY KEY (`id`)
)ENGINE=InnoDB DEFAULT CHARSET= latin1;

/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `carts`
--

LOCK TABLES `carts` WRITE;
/*!40000 ALTER TABLE `carts` DISABLE KEYS */;

/*!40000 ALTER TABLE `carts` ENABLE KEYS */;
UNLOCK TABLES;


--
-- Table structure for table `cart_entries`
--

DROP TABLE IF EXISTS `cart_entries`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cart_entries`(
	`id` varchar(56) NOT NULL,
	`amount` double precision NOT NULL,
	`price` double precision NOT NULL,
	`quantity` integer NOT NULL,
	`cart_id` varchar(56) NOT NULL,
	`product_id` varchar(28) NOT NULL,
	PRIMARY KEY (`id`),
	CONSTRAINT `cart_ent_cart_fk` FOREIGN KEY (`cart_id`) references `carts` (`id`) ON DELETE CASCADE,
	CONSTRAINT `cart_ent_prod_fk` FOREIGN KEY (`product_id`) references `products` (`code`) ON DELETE CASCADE
)ENGINE=InnoDB DEFAULT CHARSET= latin1;

/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cart_entries`
--

LOCK TABLES `cart_entries` WRITE;
/*!40000 ALTER TABLE `cart_entries` DISABLE KEYS */;

/*!40000 ALTER TABLE `cart_entries` ENABLE KEYS */;
UNLOCK TABLES;
