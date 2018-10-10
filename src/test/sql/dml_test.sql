-- Delete
DROP DATABASE TEST;
CREATE DATABASE TEST;
use TEST;
CREATE TABLE employees ( id int NOT NULL, name varchar(255) );
DELETE from employees;
DELETE from employees where id = 10;

-- Truncate
TRUNCATE TABLE employees;
TRUNCATE employees;

-- Replace
CREATE TABLE test (
  id INT UNSIGNED NOT NULL AUTO_INCREMENT,
  data VARCHAR(64) DEFAULT NULL,
  ts TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (id)
);

REPLACE INTO test VALUES (1, 'Old', '2014-08-20 18:47:00');
REPLACE INTO test VALUES (1, 'New', '2014-08-20 18:47:42');

-- Insert
CREATE TABLE `categories` (`category_id` int(11) AUTO_INCREMENT,    	  `category_name` varchar(150) DEFAULT NULL,    	  `remarks` varchar(500) DEFAULT NULL, PRIMARY KEY (`category_id`));
CREATE TABLE `categories_archive` (`category_id` int(11) AUTO_INCREMENT,    	  `category_name` varchar(150) DEFAULT NULL,    	  `remarks` varchar(500) DEFAULT NULL, PRIMARY KEY (`category_id`));
INSERT INTO `categories_archive`(category_id,category_name,remarks)  SELECT category_id,category_name,remarks FROM `categories`;

CREATE TABLE employees1 (
  id         INT PRIMARY KEY NOT NULL,
  name       VARCHAR(100) NOT NULL,
  manager_id INT NULL,
  INDEX (manager_id),
  FOREIGN KEY (manager_id) REFERENCES employees1 (id)
);
INSERT INTO employees1 VALUES
                             (333, "Yasmina", NULL),
                             (198, "John", 333),
                             (692, "Tarek", 333),
                             (29, "Pedro", 198),
                             (4610, "Sarah", 29),
                             (72, "Pierre", 29),
                             (123, "Adil", 692);

-- Update
CREATE TABLE t1 (col1 INT, col2 INT, col3 INT);
UPDATE t1 SET col1 = col1 + 1;
UPDATE t1 SET col1 = col1 + 1, col2 = col1;
UPDATE t1 SET col1 = col1 + 1 where col2= 10 ORDER BY col1 DESC;

-- Upsert
CREATE TABLE `table_name` (
  `userid` char(4) NOT NULL,
  `day` char(3) NOT NULL,
  `open` char(5) NOT NULL,
  `close` char(5) NOT NULL,
  UNIQUE KEY `seven_day` (`userid`,`day`)
);

INSERT INTO table_name (userid,day,open,close)
VALUES ('val1', 'va','val3','val4')
ON DUPLICATE KEY UPDATE open='val3', close='val4';

DROP DATABASE TEST;





