create database if not exists spring_cloud_learn;

use spring_cloud_learn;

-- ----------------------------
-- table structure for db_book
-- ----------------------------
drop table if exists `db_book`;
create table `db_book`
(
    `bid`   int(11)      not null auto_increment,
    `title` varchar(255) not null,
    `desc`  varchar(255) not null,
    primary key (`bid`)
) engine = innodb
  auto_increment = 5
  default charset = utf8mb4;

-- ----------------------------
-- records of db_book
-- ----------------------------
begin;
insert into `db_book` (`bid`, `title`, `desc`)
values (1, '深入理解java虚拟机', '讲解jvm底层原理');
insert into `db_book` (`bid`, `title`, `desc`)
values (2, 'java并发编程的艺术', '讲解并发编程的各种技术');
insert into `db_book` (`bid`, `title`, `desc`)
values (3, 'java核心技术卷一', '讲解java的基础知识等');
insert into `db_book` (`bid`, `title`, `desc`)
values (4, '计算机网络', '讲解计算机的网络实现原理和知识');
commit;

-- ----------------------------
-- table structure for db_user
-- ----------------------------
drop table if exists `db_user`;
create table `db_user`
(
    `uid`  int(11)          not null auto_increment,
    `name` varchar(255)     not null,
    `age`  int(11)          not null,
    `sex`  enum ('男','女') not null,
    primary key (`uid`)
) engine = innodb
  auto_increment = 5
  default charset = utf8mb4;

-- ----------------------------
-- records of db_user
-- ----------------------------
begin;
insert into `db_user` (`uid`, `name`, `age`, `sex`)
values (1, '小明', 18, '男');
insert into `db_user` (`uid`, `name`, `age`, `sex`)
values (2, '小红', 17, '女');
insert into `db_user` (`uid`, `name`, `age`, `sex`)
values (3, '小芳', 18, '女');
insert into `db_user` (`uid`, `name`, `age`, `sex`)
values (4, '小刚', 17, '男');
commit;

-- ----------------------------
-- table structure for db_borrow
-- ----------------------------
drop table if exists `db_borrow`;
create table `db_borrow`
(
    `id`  int(11) not null auto_increment,
    `uid` int(11) not null,
    `bid` int(11) not null,
    primary key (`id`),
    unique key `unique_bid_uid` (`uid`, `bid`),
    key `f_bid` (`bid`),
    constraint `f_bid` foreign key (`bid`) references `db_book` (`bid`),
    constraint `f_uid` foreign key (`uid`) references `db_user` (`uid`)
) engine = innodb
  default charset = utf8mb4;

-- ----------------------------
-- records of db_borrow
-- ----------------------------
begin;
commit;

set foreign_key_checks = 1;
