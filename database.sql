/*
SQLyog Ultimate v12.08 (64 bit)
MySQL - 5.7.19 : Database - demo
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`demo` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `demo`;

/*Table structure for table `static_permission` */

DROP TABLE IF EXISTS `static_permission`;

CREATE TABLE `static_permission` (
  `permission_id` varchar(20) NOT NULL,
  `permission_name` varchar(50) DEFAULT NULL,
  `permission_uri` varchar(256) DEFAULT NULL,
  `permission_note` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`permission_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `static_permission` */

insert  into `static_permission`(`permission_id`,`permission_name`,`permission_uri`,`permission_note`) values ('2','product::show',NULL,'查看产品'),('3','product::edit',NULL,'修改产品'),('4','product::del',NULL,'删除产品'),('5','product::add',NULL,'增加产品');

/*Table structure for table `static_role` */

DROP TABLE IF EXISTS `static_role`;

CREATE TABLE `static_role` (
  `role_id` varchar(20) NOT NULL,
  `role_name` varchar(20) DEFAULT NULL,
  `role_note` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `static_role` */

insert  into `static_role`(`role_id`,`role_name`,`role_note`) values ('1','SUPER_MANAGER','超级管理员'),('2','MANAGER','管理员'),('3','PERSON_MANAGER','产品管理员');

/*Table structure for table `static_role_permission` */

DROP TABLE IF EXISTS `static_role_permission`;

CREATE TABLE `static_role_permission` (
  `role_permission_id` int(11) NOT NULL AUTO_INCREMENT,
  `role_id` varchar(20) DEFAULT NULL,
  `permission_id` varchar(20) DEFAULT NULL,
  `role_permission_note` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`role_permission_id`),
  KEY `role_id` (`role_id`),
  KEY `permission_id` (`permission_id`),
  CONSTRAINT `static_role_permission_ibfk_1` FOREIGN KEY (`role_id`) REFERENCES `static_role` (`role_id`),
  CONSTRAINT `static_role_permission_ibfk_2` FOREIGN KEY (`permission_id`) REFERENCES `static_permission` (`permission_id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

/*Data for the table `static_role_permission` */

insert  into `static_role_permission`(`role_permission_id`,`role_id`,`permission_id`,`role_permission_note`) values (7,'3','2',NULL),(8,'3','3',NULL),(12,'3','5',NULL),(13,'3','4',NULL);

/*Table structure for table `static_user` */

DROP TABLE IF EXISTS `static_user`;

CREATE TABLE `static_user` (
  `user_id` varchar(20) NOT NULL,
  `user_name` varchar(20) DEFAULT NULL,
  `user_password` varchar(20) DEFAULT NULL,
  `last_sign_time` datetime DEFAULT NULL,
  `signstate` int(11) DEFAULT NULL,
  `ticke_id` varchar(128) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `static_user` */

insert  into `static_user`(`user_id`,`user_name`,`user_password`,`last_sign_time`,`signstate`,`ticke_id`) values ('A0003','abc','123','2019-06-04 22:25:29',1,NULL),('A7','admin','admin','2019-06-06 17:00:49',NULL,NULL);

/*Table structure for table `static_user_role` */

DROP TABLE IF EXISTS `static_user_role`;

CREATE TABLE `static_user_role` (
  `user_role_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` varchar(20) DEFAULT NULL,
  `role_id` varchar(20) DEFAULT NULL,
  `user_role_note` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`user_role_id`),
  KEY `user_id` (`user_id`),
  KEY `role_id` (`role_id`),
  CONSTRAINT `static_user_role_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `static_user` (`user_id`),
  CONSTRAINT `static_user_role_ibfk_2` FOREIGN KEY (`role_id`) REFERENCES `static_role` (`role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

/*Data for the table `static_user_role` */

insert  into `static_user_role`(`user_role_id`,`user_id`,`role_id`,`user_role_note`) values (4,'A7','3',NULL);

/*Table structure for table `tb_product` */

DROP TABLE IF EXISTS `tb_product`;

CREATE TABLE `tb_product` (
  `Pid` varchar(50) NOT NULL,
  `Pname` varchar(200) DEFAULT NULL,
  `Pnum` varchar(200) DEFAULT NULL,
  `Price` decimal(10,2) DEFAULT NULL,
  `Ptime` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`Pid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tb_product` */

insert  into `tb_product`(`Pid`,`Pname`,`Pnum`,`Price`,`Ptime`) values ('7ae8b2ba-883e-11e9-b912-00ff941ae81f','测试ab','111111111111','100.00','2019-06-06'),('815733cd-883e-11e9-b912-00ff941ae81f','测试b','1111111111111','12.30','2019-06-06'),('9574d46a-883e-11e9-b912-00ff941ae81f','测试cab','12312312311','123.00','2019-06-06'),('d89e49f2-883e-11e9-b912-00ff941ae81f','测试abcd','11111111111','111.00','2019-06-06');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
