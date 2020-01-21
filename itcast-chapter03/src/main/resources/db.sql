# 创建数据库
CREATE DATABASE springbootdata;

# 选择使用数据库
USE springbootdata;

# 创建表t_article并插入相关数据
DROP TABLE
IF EXISTS t_article;

CREATE TABLE t_article (
	id INT (20) NOT NULL auto_increment COMMENT '文章id',
	title VARCHAR (200) DEFAULT NULL COMMENT '文章标题',
	content LONGTEXT COMMENT '文章内容',
	PRIMARY KEY (id)
) ENGINE = INNODB AUTO_INCREMENT = 2 DEFAULT CHARSET = utf8;

INSERT INTO t_article
VALUES
	(
		1,
		'Spring Boot基础入门',
		'从入门到精通讲解...'
	);

INSERT INTO t_article
VALUES
	(
		2,
		'Spring Cloud基础入门',
		'从入门到精通讲解...'
	);

# 创建表t_comment并插入相关数据
DROP TABLE
IF EXISTS t_comment;

CREATE TABLE t_comment (
	id INT (20) NOT NULL auto_increment COMMENT '评论id',
	content LONGTEXT COMMENT '评论内容',
	author VARCHAR (200) DEFAULT NULL COMMENT '评论作者',
	a_id INT (20) DEFAULT NULL COMMENT '关联的文章id',
	PRIMARY KEY (id)
) ENGINE = INNODB AUTO_INCREMENT = 3 DEFAULT CHARSET = utf8;

INSERT INTO t_comment
VALUES
	(
		1,
		'很全、很详细',
		'狂奔的蜗牛',
		1
	);

INSERT INTO t_comment
VALUES
	(2, '赞一个', 'tom', 1);

INSERT INTO t_comment
VALUES
	(3, '很详细', 'kitty', 1);

INSERT INTO t_comment
VALUES
	(
		4,
		'很好，非常详细',
		'张三',
		1
	);

INSERT INTO t_comment
VALUES
	(5, '很不错', '张杨', 2);