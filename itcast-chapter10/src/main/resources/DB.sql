CREATE DATABASE blog_system;

USE blog_system;

DROP TABLE
IF EXISTS t_article;

CREATE TABLE t_article (
	id INT (11) PRIMARY KEY auto_increment COMMENT '文章id',
	title VARCHAR (50) NOT NULL COMMENT '文章标题',
	content LONGTEXT COMMENT '文章内容',
	created date COMMENT '创建时间',
	modified date COMMENT '修改时间',
	categories VARCHAR (200) COMMENT '文章分类',
	tags VARCHAR (200) COMMENT '文章标签',
	allow_comment TINYINT (1) DEFAULT 1 COMMENT '是否允许评论（默认1）',
	thumbnail VARCHAR (200) COMMENT '文章略缩图'
) DEFAULT charset = utf8 COMMENT '文章详情表';

DROP TABLE
IF EXISTS t_comment;

CREATE TABLE t_comment (
	id INT (11) PRIMARY KEY auto_increment COMMENT '评论id',
	article_id INT (11) NOT NULL COMMENT '评论关联的文章id',
	created date COMMENT '创建时间',
	ip VARCHAR (200) COMMENT '评论用户所在ip',
	content text COMMENT '评论内容',
	STATUS VARCHAR (200) DEFAULT 'approved' COMMENT '评论状态（默认approved）',
	author VARCHAR (200) COMMENT '评论作者名'
) DEFAULT charset = utf8 COMMENT '文章评论表';

DROP TABLE
IF EXISTS t_statistic;

CREATE TABLE t_statistic (
	id INT (11) PRIMARY KEY auto_increment COMMENT '文章统计id',
	article_id INT (11) NOT NULL COMMENT '文章id',
	hits INT (11) COMMENT '文章点击量',
	comments_num INT (11) COMMENT '文章评论量'
) DEFAULT charset = utf8 COMMENT '文章统计表';

DROP TABLE
IF EXISTS t_user;

CREATE TABLE t_user (
	id INT (11) PRIMARY KEY auto_increment COMMENT '用户id',
	username VARCHAR (200) COMMENT '用户名',
	PASSWORD VARCHAR (200) COMMENT '用户密码（加密后的密码）',
	email VARCHAR (200) COMMENT '用户邮箱',
	created date COMMENT '创建时间',
	valid TINYINT (1) DEFAULT 1 COMMENT '是否为有效用户'
) DEFAULT charset = utf8 COMMENT '用户信息表';

DROP TABLE
IF EXISTS t_authority;

CREATE TABLE t_authority (
	id INT (11) PRIMARY KEY auto_increment COMMENT '权限id',
	authority VARCHAR (200) NOT NULL COMMENT '权限以ROLE_开头'
) DEFAULT charset = utf8 COMMENT '用户权限表';

DROP TABLE
IF EXISTS t_user_authority;

CREATE TABLE t_user_authority (
	id INT (11) PRIMARY KEY auto_increment COMMENT '关联表主键id',
	article_id INT (11) COMMENT '文章id',
	authority_id INT (11) COMMENT '权限id'
) DEFAULT charset = utf8 COMMENT '用户权限关联表';