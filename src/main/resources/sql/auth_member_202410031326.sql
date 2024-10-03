CREATE DATABASE IF NOT EXISTS TIME_SHEET;


-- TIME_SHEET.auth_member definition

CREATE TABLE `auth_member` (
  `id` int NOT NULL AUTO_INCREMENT,
  `email` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `join_date` datetime NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`),
  UNIQUE KEY `email_UNIQUE` (`email`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


INSERT INTO TIME_SHEET.auth_member (email,password,join_date) VALUES
	 ('orjujeng@hotmail.com','1234567','2024-09-21 00:00:00'),
	 ('orjujeng@gmail.com','1234567','2024-09-22 23:12:50');
