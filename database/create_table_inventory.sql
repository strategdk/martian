CREATE TABLE `inventory` (
  `base_id` int(11) DEFAULT NULL,
  `supply_id` int(11) DEFAULT NULL,
  `quantity` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='Supplies at each base';