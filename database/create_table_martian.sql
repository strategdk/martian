CREATE TABLE `martian` (
  `martian_id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(32) DEFAULT NULL,
  `last_name` varchar(32) DEFAULT NULL,
  `base_id` int(11) DEFAULT NULL,
  `super_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`martian_id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4 COMMENT='All people living on Mars'