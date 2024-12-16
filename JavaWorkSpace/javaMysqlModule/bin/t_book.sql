/*
 Navicat Premium Data Transfer

 Source Server         : 本机
 Source Server Type    : MySQL
 Source Server Version : 50728
 Source Host           : localhost:3306
 Source Schema         : book-store

 Target Server Type    : MySQL
 Target Server Version : 50728
 File Encoding         : 65001

 Date: 16/12/2024 11:11:55
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_book
-- ----------------------------
DROP TABLE IF EXISTS `t_book`;
CREATE TABLE `t_book` (
  `bNo` int(255) DEFAULT NULL,
  `bName` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `bAuthor` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of t_book
-- ----------------------------
BEGIN;
INSERT INTO `t_book` VALUES (1, '1', '1');
INSERT INTO `t_book` VALUES (2, '2', '2');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
