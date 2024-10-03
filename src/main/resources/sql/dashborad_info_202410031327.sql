CREATE DATABASE IF NOT EXISTS TIME_SHEET;

use TIME_SHEET;
-- TIME_SHEET.dashborad_info definition

CREATE TABLE `dashborad_info` (
  `id` int NOT NULL AUTO_INCREMENT,
  `month` date NOT NULL,
  `new_member` int NOT NULL,
  `support_member` int NOT NULL,
  `support_projects` int NOT NULL,
  `timesheet_collection` int NOT NULL,
  `uncomplate` int NOT NULL,
  `login_member` int NOT NULL,
  `login_times` int NOT NULL,
  `t1_member` int NOT NULL,
  `t2_member` int NOT NULL,
  `t3_member` int NOT NULL,
  `t4_member` int NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`),
  UNIQUE KEY `month_UNIQUE` (`month`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO TIME_SHEET.dashborad_info (`month`,new_member,support_member,support_projects,timesheet_collection,uncomplate,login_member,login_times,t1_member,t2_member,t3_member,t4_member) VALUES
	 ('2023-09-01',1,30,4,30,0,30,70,8,7,10,5),
	 ('2023-10-01',0,30,4,30,0,30,90,8,7,10,5),
	 ('2023-11-01',2,32,4,32,0,32,46,8,8,11,5),
	 ('2023-12-01',10,42,4,42,1,41,190,11,12,13,6),
	 ('2024-01-01',0,42,4,42,0,42,122,11,12,13,6),
	 ('2024-02-01',1,43,4,42,1,43,123,11,13,13,6),
	 ('2024-03-01',1,44,4,44,0,44,155,12,13,13,6),
	 ('2024-04-01',0,44,4,44,0,44,127,12,13,13,6),
	 ('2024-05-01',1,45,4,45,0,45,200,12,14,13,6),
	 ('2024-06-01',0,45,4,45,0,45,166,12,14,13,6);
INSERT INTO TIME_SHEET.dashborad_info (`month`,new_member,support_member,support_projects,timesheet_collection,uncomplate,login_member,login_times,t1_member,t2_member,t3_member,t4_member) VALUES
	 ('2024-07-01',1,46,4,46,0,46,189,12,14,14,6),
	 ('2024-08-01',4,50,4,50,0,50,232,12,14,14,10),
	 ('2024-09-01',0,50,4,50,0,50,101,12,14,14,10);
