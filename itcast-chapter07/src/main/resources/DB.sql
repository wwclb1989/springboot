USE springbootdata;

# 创建表t_customer并插入相关数据
DROP TABLE
IF EXISTS t_customer;

CREATE TABLE t_customer (
	id INT (20) NOT NULL auto_increment,
	username VARCHAR (200) DEFAULT NULL,
	PASSWORD VARCHAR (200) DEFAULT NULL,
	valid TINYINT (1) NOT NULL DEFAULT '1',
	PRIMARY KEY (id)
) ENGINE = INNODB AUTO_INCREMENT = 4 DEFAULT CHARSET = utf8;

INSERT INTO t_customer
VALUES
	(
		1,
		'shitou',
		'$2a$10$Gyumgi8DqLJWTQWf/rleuOPdH2UZ.nNaKYj0J6Pk5UUcooWS4h8Om',
		'1'
	);

INSERT INTO t_customer
VALUES
	(
		2,
		'李四',
		'$2a$10$Gyumgi8DqLJWTQWf/rleuOPdH2UZ.nNaKYj0J6Pk5UUcooWS4h8Om',
		'1'
	);

# 创建t_authority并插入相关数据
DROP TABLE
IF EXISTS t_authority;

CREATE TABLE t_authority (
	id INT (20) NOT NULL auto_increment,
	authority VARCHAR (20) DEFAULT NULL,
	PRIMARY KEY (id)
) ENGINE = INNODB auto_increment = 3 DEFAULT charset = utf8;

INSERT INTO t_authority
VALUES
	('1', 'ROLE_common');

INSERT INTO t_authority
VALUES
	('2', 'ROLE_vip');

# 创建表t_customer_authority并插入相关数据
DROP TABLE
IF EXISTS t_customer_authority;

CREATE TABLE t_customer_authority (
	id INT (20) NOT NULL auto_increment,
	customer_id INT (20) DEFAULT NULL,
	authority_id INT (20) DEFAULT NULL,
	PRIMARY KEY (id)
) ENGINE = INNODB auto_increment = 5 DEFAULT charset = utf8;

INSERT INTO t_customer_authority
VALUES
	('1', '1', '1');

INSERT INTO t_customer_authority
VALUES
	('2', '2', '2');


CREATE TABLE persistent_logins (
	username VARCHAR (64) NOT NULL,
	series VARCHAR (64) PRIMARY KEY,
	token VARCHAR (64) NOT NULL,
	last_used TIMESTAMP NOT NULL
);