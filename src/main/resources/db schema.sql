DROP TABLE IF EXISTS `simple`;
CREATE TABLE `simple` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `uuid` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1;

CREATE DEFINER = CURRENT_USER PROCEDURE `proc`(IN `id` bigint)
BEGIN
	#Routine body goes here...

END;