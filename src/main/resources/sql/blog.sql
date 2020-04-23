/*
 Navicat Premium Data Transfer

 Source Server         : 本地
 Source Server Type    : MySQL
 Source Server Version : 50723
 Source Host           : localhost:3306
 Source Schema         : blog

 Target Server Type    : MySQL
 Target Server Version : 50723
 File Encoding         : 65001

 Date: 23/04/2020 14:03:41
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for bl_menu
-- ----------------------------
DROP TABLE IF EXISTS `bl_menu`;
CREATE TABLE `bl_menu`  (
  `ID` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '菜单ID',
  `MENU_PARENT` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '父菜单ID',
  `MENU_NAME` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '菜单名称',
  `MENU_SORT` int(10) NULL DEFAULT NULL COMMENT '菜单排序',
  `MENU_URL` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '菜单访问地址',
  `MENU_LEVEL` int(1) NULL DEFAULT NULL COMMENT '菜单级别',
  `MENU_STATUS` int(1) NULL DEFAULT NULL COMMENT '是否包含下级菜单 0 未包含  1包含',
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of bl_menu
-- ----------------------------
INSERT INTO `bl_menu` VALUES ('1', '0', '博客首页', 1, '/index', 1, 0);
INSERT INTO `bl_menu` VALUES ('2', '0', '我的博文', 2, '/', 1, 1);
INSERT INTO `bl_menu` VALUES ('3', '0', '关于我', 3, 'author', 1, 0);
INSERT INTO `bl_menu` VALUES ('4', '2', 'Java 笔记', 1, '/java', 2, 0);
INSERT INTO `bl_menu` VALUES ('5', '2', 'Python 笔记', 2, '/python', 2, 0);
INSERT INTO `bl_menu` VALUES ('6', '2', 'Vue 笔记', 3, '/vue', 2, 0);

SET FOREIGN_KEY_CHECKS = 1;
