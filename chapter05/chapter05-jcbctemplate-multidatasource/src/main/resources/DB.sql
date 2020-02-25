CREATE DATABASE `chapter05-1` DEFAULT CHARACTER SET utf8;

USE `chapter05-1`;

CREATE TABLE book (
	id INT (11) NOT NULL auto_increment,
	NAME VARCHAR (128) DEFAULT NULL,
	author VARCHAR (128) DEFAULT NULL,
	PRIMARY KEY (id)
) ENGINE = INNODB auto_increment = 2 DEFAULT charset = utf8;

INSERT INTO book (id, NAME, author)
VALUES
	(1, '水浒传', '施耐庵');


CREATE DATABASE `chapter05-2` DEFAULT CHARACTER SET utf8;

USE `chapter05-2`;

CREATE TABLE book (
	id INT (11) NOT NULL auto_increment,
	NAME VARCHAR (128) DEFAULT NULL,
	author VARCHAR (128) DEFAULT NULL,
	PRIMARY KEY (id)
) ENGINE = INNODB auto_increment = 3 DEFAULT charset = utf8;

INSERT INTO book (id, NAME, author)
VALUES
	(
		1,
		'三国演义',
		'罗贯中'
	);

