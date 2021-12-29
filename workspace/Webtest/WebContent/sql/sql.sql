CREATE TABLE `user` (
	`no` INT(10) NOT NULL AUTO_INCREMENT,
	`id` VARCHAR(50) NULL DEFAULT NULL COLLATE 'utf8mb4_0900_ai_ci',
	`password` VARCHAR(50) NULL DEFAULT NULL COLLATE 'utf8mb4_0900_ai_ci',
	`name` VARCHAR(50) NULL DEFAULT NULL COLLATE 'utf8mb4_0900_ai_ci',
	`ts` TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP,
	PRIMARY KEY (`no`) USING BTREE
)
COLLATE='utf8mb4_0900_ai_ci'
ENGINE=InnoDB
