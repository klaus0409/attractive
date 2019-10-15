/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50721
 Source Host           : localhost:3306
 Source Schema         : attractive

 Target Server Type    : MySQL
 Target Server Version : 50721
 File Encoding         : 65001

 Date: 15/10/2019 10:45:24
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for link_role_menu
-- ----------------------------
DROP TABLE IF EXISTS `link_role_menu`;
CREATE TABLE `link_role_menu`  (
  `role_id` int(11) NOT NULL COMMENT '权限表ID',
  `menu_id` int(11) NOT NULL COMMENT '菜单表ID',
  PRIMARY KEY (`role_id`, `menu_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '权限表和菜单表中间关系表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of link_role_menu
-- ----------------------------
INSERT INTO `link_role_menu` VALUES (1, 1);
INSERT INTO `link_role_menu` VALUES (1, 2);
INSERT INTO `link_role_menu` VALUES (26, 11);
INSERT INTO `link_role_menu` VALUES (33, 1);
INSERT INTO `link_role_menu` VALUES (33, 2);
INSERT INTO `link_role_menu` VALUES (33, 3);
INSERT INTO `link_role_menu` VALUES (33, 4);
INSERT INTO `link_role_menu` VALUES (33, 5);
INSERT INTO `link_role_menu` VALUES (33, 6);
INSERT INTO `link_role_menu` VALUES (33, 7);
INSERT INTO `link_role_menu` VALUES (33, 8);
INSERT INTO `link_role_menu` VALUES (33, 9);
INSERT INTO `link_role_menu` VALUES (33, 10);
INSERT INTO `link_role_menu` VALUES (33, 11);
INSERT INTO `link_role_menu` VALUES (33, 12);
INSERT INTO `link_role_menu` VALUES (33, 13);
INSERT INTO `link_role_menu` VALUES (33, 14);
INSERT INTO `link_role_menu` VALUES (33, 201);
INSERT INTO `link_role_menu` VALUES (33, 202);

-- ----------------------------
-- Table structure for link_role_permission
-- ----------------------------
DROP TABLE IF EXISTS `link_role_permission`;
CREATE TABLE `link_role_permission`  (
  `role_id` int(11) NOT NULL COMMENT '角色ID',
  `permission_id` int(11) NOT NULL COMMENT '权限ID',
  PRIMARY KEY (`role_id`, `permission_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '角色权限中间表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of link_role_permission
-- ----------------------------
INSERT INTO `link_role_permission` VALUES (3, 4);
INSERT INTO `link_role_permission` VALUES (3, 5);
INSERT INTO `link_role_permission` VALUES (3, 6);
INSERT INTO `link_role_permission` VALUES (3, 7);
INSERT INTO `link_role_permission` VALUES (3, 8);
INSERT INTO `link_role_permission` VALUES (3, 9);
INSERT INTO `link_role_permission` VALUES (3, 10);
INSERT INTO `link_role_permission` VALUES (3, 11);
INSERT INTO `link_role_permission` VALUES (3, 17);
INSERT INTO `link_role_permission` VALUES (3, 18);
INSERT INTO `link_role_permission` VALUES (3, 19);
INSERT INTO `link_role_permission` VALUES (3, 32);
INSERT INTO `link_role_permission` VALUES (3, 33);
INSERT INTO `link_role_permission` VALUES (3, 34);
INSERT INTO `link_role_permission` VALUES (3, 35);
INSERT INTO `link_role_permission` VALUES (3, 36);
INSERT INTO `link_role_permission` VALUES (3, 37);
INSERT INTO `link_role_permission` VALUES (4, 1);
INSERT INTO `link_role_permission` VALUES (4, 2);
INSERT INTO `link_role_permission` VALUES (4, 3);
INSERT INTO `link_role_permission` VALUES (4, 4);
INSERT INTO `link_role_permission` VALUES (4, 5);
INSERT INTO `link_role_permission` VALUES (4, 6);
INSERT INTO `link_role_permission` VALUES (4, 7);
INSERT INTO `link_role_permission` VALUES (4, 8);
INSERT INTO `link_role_permission` VALUES (4, 9);
INSERT INTO `link_role_permission` VALUES (4, 17);
INSERT INTO `link_role_permission` VALUES (4, 18);
INSERT INTO `link_role_permission` VALUES (4, 19);
INSERT INTO `link_role_permission` VALUES (4, 25);
INSERT INTO `link_role_permission` VALUES (4, 26);
INSERT INTO `link_role_permission` VALUES (13, 1);
INSERT INTO `link_role_permission` VALUES (13, 2);
INSERT INTO `link_role_permission` VALUES (13, 3);
INSERT INTO `link_role_permission` VALUES (13, 4);
INSERT INTO `link_role_permission` VALUES (13, 5);
INSERT INTO `link_role_permission` VALUES (13, 6);
INSERT INTO `link_role_permission` VALUES (13, 7);
INSERT INTO `link_role_permission` VALUES (13, 8);
INSERT INTO `link_role_permission` VALUES (13, 9);
INSERT INTO `link_role_permission` VALUES (13, 10);
INSERT INTO `link_role_permission` VALUES (13, 11);
INSERT INTO `link_role_permission` VALUES (13, 17);
INSERT INTO `link_role_permission` VALUES (13, 18);
INSERT INTO `link_role_permission` VALUES (13, 19);
INSERT INTO `link_role_permission` VALUES (14, 20);
INSERT INTO `link_role_permission` VALUES (14, 21);
INSERT INTO `link_role_permission` VALUES (14, 22);
INSERT INTO `link_role_permission` VALUES (14, 23);
INSERT INTO `link_role_permission` VALUES (14, 24);
INSERT INTO `link_role_permission` VALUES (14, 25);
INSERT INTO `link_role_permission` VALUES (14, 26);
INSERT INTO `link_role_permission` VALUES (14, 30);
INSERT INTO `link_role_permission` VALUES (14, 31);
INSERT INTO `link_role_permission` VALUES (14, 32);
INSERT INTO `link_role_permission` VALUES (14, 33);
INSERT INTO `link_role_permission` VALUES (14, 34);
INSERT INTO `link_role_permission` VALUES (14, 35);
INSERT INTO `link_role_permission` VALUES (14, 36);
INSERT INTO `link_role_permission` VALUES (14, 37);
INSERT INTO `link_role_permission` VALUES (22, 1);
INSERT INTO `link_role_permission` VALUES (22, 2);
INSERT INTO `link_role_permission` VALUES (22, 3);
INSERT INTO `link_role_permission` VALUES (22, 35);
INSERT INTO `link_role_permission` VALUES (22, 36);
INSERT INTO `link_role_permission` VALUES (26, 1);
INSERT INTO `link_role_permission` VALUES (26, 2);
INSERT INTO `link_role_permission` VALUES (26, 3);
INSERT INTO `link_role_permission` VALUES (26, 4);
INSERT INTO `link_role_permission` VALUES (26, 5);
INSERT INTO `link_role_permission` VALUES (26, 6);
INSERT INTO `link_role_permission` VALUES (26, 7);
INSERT INTO `link_role_permission` VALUES (26, 8);
INSERT INTO `link_role_permission` VALUES (26, 9);
INSERT INTO `link_role_permission` VALUES (26, 10);
INSERT INTO `link_role_permission` VALUES (26, 11);
INSERT INTO `link_role_permission` VALUES (26, 17);
INSERT INTO `link_role_permission` VALUES (26, 18);
INSERT INTO `link_role_permission` VALUES (26, 19);
INSERT INTO `link_role_permission` VALUES (26, 20);
INSERT INTO `link_role_permission` VALUES (26, 21);
INSERT INTO `link_role_permission` VALUES (26, 22);
INSERT INTO `link_role_permission` VALUES (26, 23);
INSERT INTO `link_role_permission` VALUES (26, 24);
INSERT INTO `link_role_permission` VALUES (26, 25);
INSERT INTO `link_role_permission` VALUES (26, 26);
INSERT INTO `link_role_permission` VALUES (26, 27);
INSERT INTO `link_role_permission` VALUES (26, 28);
INSERT INTO `link_role_permission` VALUES (26, 29);
INSERT INTO `link_role_permission` VALUES (26, 30);
INSERT INTO `link_role_permission` VALUES (26, 31);
INSERT INTO `link_role_permission` VALUES (26, 32);
INSERT INTO `link_role_permission` VALUES (26, 33);
INSERT INTO `link_role_permission` VALUES (26, 34);
INSERT INTO `link_role_permission` VALUES (26, 35);
INSERT INTO `link_role_permission` VALUES (26, 36);
INSERT INTO `link_role_permission` VALUES (26, 37);
INSERT INTO `link_role_permission` VALUES (26, 39);
INSERT INTO `link_role_permission` VALUES (26, 40);
INSERT INTO `link_role_permission` VALUES (26, 41);
INSERT INTO `link_role_permission` VALUES (27, 36);
INSERT INTO `link_role_permission` VALUES (33, 1);
INSERT INTO `link_role_permission` VALUES (33, 2);
INSERT INTO `link_role_permission` VALUES (33, 3);
INSERT INTO `link_role_permission` VALUES (33, 4);
INSERT INTO `link_role_permission` VALUES (33, 5);
INSERT INTO `link_role_permission` VALUES (33, 6);
INSERT INTO `link_role_permission` VALUES (33, 7);
INSERT INTO `link_role_permission` VALUES (33, 8);
INSERT INTO `link_role_permission` VALUES (33, 9);
INSERT INTO `link_role_permission` VALUES (33, 10);
INSERT INTO `link_role_permission` VALUES (33, 11);
INSERT INTO `link_role_permission` VALUES (33, 12);
INSERT INTO `link_role_permission` VALUES (33, 13);
INSERT INTO `link_role_permission` VALUES (33, 14);
INSERT INTO `link_role_permission` VALUES (33, 15);
INSERT INTO `link_role_permission` VALUES (33, 16);
INSERT INTO `link_role_permission` VALUES (33, 17);
INSERT INTO `link_role_permission` VALUES (33, 18);
INSERT INTO `link_role_permission` VALUES (33, 19);
INSERT INTO `link_role_permission` VALUES (33, 20);
INSERT INTO `link_role_permission` VALUES (33, 21);
INSERT INTO `link_role_permission` VALUES (33, 22);
INSERT INTO `link_role_permission` VALUES (33, 23);
INSERT INTO `link_role_permission` VALUES (33, 24);
INSERT INTO `link_role_permission` VALUES (33, 25);
INSERT INTO `link_role_permission` VALUES (33, 26);
INSERT INTO `link_role_permission` VALUES (33, 27);
INSERT INTO `link_role_permission` VALUES (33, 28);
INSERT INTO `link_role_permission` VALUES (33, 29);
INSERT INTO `link_role_permission` VALUES (33, 30);
INSERT INTO `link_role_permission` VALUES (33, 31);
INSERT INTO `link_role_permission` VALUES (33, 32);
INSERT INTO `link_role_permission` VALUES (33, 33);
INSERT INTO `link_role_permission` VALUES (33, 34);
INSERT INTO `link_role_permission` VALUES (33, 35);
INSERT INTO `link_role_permission` VALUES (33, 36);
INSERT INTO `link_role_permission` VALUES (33, 37);
INSERT INTO `link_role_permission` VALUES (33, 38);
INSERT INTO `link_role_permission` VALUES (33, 39);
INSERT INTO `link_role_permission` VALUES (33, 40);
INSERT INTO `link_role_permission` VALUES (33, 41);

-- ----------------------------
-- Table structure for link_user_zone
-- ----------------------------
DROP TABLE IF EXISTS `link_user_zone`;
CREATE TABLE `link_user_zone`  (
  `user_id` int(11) NOT NULL COMMENT '对应user表ID',
  `zone_id` int(11) NOT NULL COMMENT '对应zone表ID',
  PRIMARY KEY (`user_id`, `zone_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户和区域中间表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of link_user_zone
-- ----------------------------
INSERT INTO `link_user_zone` VALUES (1, 1033);
INSERT INTO `link_user_zone` VALUES (2, 1);
INSERT INTO `link_user_zone` VALUES (2, 2);
INSERT INTO `link_user_zone` VALUES (2, 3);
INSERT INTO `link_user_zone` VALUES (2, 4);
INSERT INTO `link_user_zone` VALUES (2, 5);
INSERT INTO `link_user_zone` VALUES (2, 6);
INSERT INTO `link_user_zone` VALUES (2, 1010);
INSERT INTO `link_user_zone` VALUES (2, 1018);
INSERT INTO `link_user_zone` VALUES (2, 1023);
INSERT INTO `link_user_zone` VALUES (2, 1029);
INSERT INTO `link_user_zone` VALUES (2, 1032);
INSERT INTO `link_user_zone` VALUES (3, 1);
INSERT INTO `link_user_zone` VALUES (3, 2);
INSERT INTO `link_user_zone` VALUES (3, 3);
INSERT INTO `link_user_zone` VALUES (3, 4);
INSERT INTO `link_user_zone` VALUES (3, 5);
INSERT INTO `link_user_zone` VALUES (3, 6);
INSERT INTO `link_user_zone` VALUES (3, 1010);
INSERT INTO `link_user_zone` VALUES (3, 1018);
INSERT INTO `link_user_zone` VALUES (3, 1023);
INSERT INTO `link_user_zone` VALUES (3, 1029);
INSERT INTO `link_user_zone` VALUES (3, 1032);
INSERT INTO `link_user_zone` VALUES (4, 1);
INSERT INTO `link_user_zone` VALUES (4, 2);
INSERT INTO `link_user_zone` VALUES (4, 3);
INSERT INTO `link_user_zone` VALUES (4, 4);
INSERT INTO `link_user_zone` VALUES (4, 5);
INSERT INTO `link_user_zone` VALUES (4, 6);
INSERT INTO `link_user_zone` VALUES (4, 1010);
INSERT INTO `link_user_zone` VALUES (4, 1018);
INSERT INTO `link_user_zone` VALUES (4, 1023);
INSERT INTO `link_user_zone` VALUES (4, 1029);
INSERT INTO `link_user_zone` VALUES (4, 1032);
INSERT INTO `link_user_zone` VALUES (5, 1);
INSERT INTO `link_user_zone` VALUES (5, 2);
INSERT INTO `link_user_zone` VALUES (5, 3);
INSERT INTO `link_user_zone` VALUES (5, 4);
INSERT INTO `link_user_zone` VALUES (5, 5);
INSERT INTO `link_user_zone` VALUES (5, 6);
INSERT INTO `link_user_zone` VALUES (5, 1010);
INSERT INTO `link_user_zone` VALUES (5, 1018);
INSERT INTO `link_user_zone` VALUES (5, 1023);
INSERT INTO `link_user_zone` VALUES (5, 1029);
INSERT INTO `link_user_zone` VALUES (5, 1032);
INSERT INTO `link_user_zone` VALUES (6, 1);
INSERT INTO `link_user_zone` VALUES (6, 2);
INSERT INTO `link_user_zone` VALUES (6, 3);
INSERT INTO `link_user_zone` VALUES (6, 4);
INSERT INTO `link_user_zone` VALUES (6, 5);
INSERT INTO `link_user_zone` VALUES (6, 6);
INSERT INTO `link_user_zone` VALUES (6, 1010);
INSERT INTO `link_user_zone` VALUES (6, 1018);
INSERT INTO `link_user_zone` VALUES (6, 1023);
INSERT INTO `link_user_zone` VALUES (6, 1029);
INSERT INTO `link_user_zone` VALUES (6, 1032);
INSERT INTO `link_user_zone` VALUES (7, 1);
INSERT INTO `link_user_zone` VALUES (7, 2);
INSERT INTO `link_user_zone` VALUES (7, 3);
INSERT INTO `link_user_zone` VALUES (7, 4);
INSERT INTO `link_user_zone` VALUES (7, 5);
INSERT INTO `link_user_zone` VALUES (7, 6);
INSERT INTO `link_user_zone` VALUES (7, 1010);
INSERT INTO `link_user_zone` VALUES (7, 1018);
INSERT INTO `link_user_zone` VALUES (7, 1023);
INSERT INTO `link_user_zone` VALUES (7, 1029);
INSERT INTO `link_user_zone` VALUES (7, 1032);
INSERT INTO `link_user_zone` VALUES (8, 1);
INSERT INTO `link_user_zone` VALUES (8, 2);
INSERT INTO `link_user_zone` VALUES (8, 3);
INSERT INTO `link_user_zone` VALUES (8, 4);
INSERT INTO `link_user_zone` VALUES (8, 5);
INSERT INTO `link_user_zone` VALUES (8, 6);
INSERT INTO `link_user_zone` VALUES (8, 1010);
INSERT INTO `link_user_zone` VALUES (8, 1018);
INSERT INTO `link_user_zone` VALUES (8, 1023);
INSERT INTO `link_user_zone` VALUES (8, 1029);
INSERT INTO `link_user_zone` VALUES (8, 1032);

-- ----------------------------
-- Table structure for sys_log
-- ----------------------------
DROP TABLE IF EXISTS `sys_log`;
CREATE TABLE `sys_log`  (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建日期',
  `description` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '描述',
  `exception_detail` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '异常详细',
  `log_type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '日志类型',
  `method` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '方法名',
  `params` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '参数',
  `request_ip` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '请求ip',
  `time` bigint(20) NULL DEFAULT NULL COMMENT '请求耗时',
  `username` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '操作用户',
  `user_id` int(10) NULL DEFAULT NULL COMMENT '用户id',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for sys_menu
-- ----------------------------
DROP TABLE IF EXISTS `sys_menu`;
CREATE TABLE `sys_menu`  (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建日期',
  `i_frame` bit(1) NULL DEFAULT NULL COMMENT '是否外链',
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '菜单名称',
  `component` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '组件',
  `pid` int(10) NOT NULL COMMENT '上级菜单ID',
  `sort` int(10) NOT NULL COMMENT '排序',
  `icon` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '图标',
  `path` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '链接地址',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 203 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sys_menu
-- ----------------------------
INSERT INTO `sys_menu` VALUES (1, '2018-12-18 15:11:29', b'0', '图片浏览', NULL, 0, 0, 'image', 'image');
INSERT INTO `sys_menu` VALUES (2, '2018-12-18 15:11:29', b'0', '裂隙数据', NULL, 0, 1, 'fx', 'fissure');
INSERT INTO `sys_menu` VALUES (3, '2018-12-18 15:11:00', b'0', '轮廓变化', 'outline/data/index', 9, 1, 'lkx', 'data');
INSERT INTO `sys_menu` VALUES (4, '2018-12-18 15:11:29', b'0', '实时监测', 'image/realtime/index', 1, 1, 'realtime', 'realtime');
INSERT INTO `sys_menu` VALUES (5, '2018-12-18 15:11:29', b'0', '历史监测', 'image/history/index', 1, 2, 'history', 'history');
INSERT INTO `sys_menu` VALUES (6, '2019-08-01 13:46:32', b'0', '趋势图', 'fissure/trend/index', 2, 1, 'qs', 'trend');
INSERT INTO `sys_menu` VALUES (7, '2019-08-01 13:46:32', b'0', '位置变化图', 'fissure/position/index', 2, 2, 'wz', 'position');
INSERT INTO `sys_menu` VALUES (8, '2018-12-18 15:11:00', b'0', '轮廓比对', 'outline/compare/index', 9, 2, 'bd', 'compare');
INSERT INTO `sys_menu` VALUES (9, '2018-12-18 15:11:00', b'0', '轮廓数据', NULL, 0, 3, 'bd', 'outline');
INSERT INTO `sys_menu` VALUES (10, '2019-08-29 17:07:48', b'0', '裂隙比对', 'fissure/fissurecompare/index', 2, 3, 'bd', 'fissurecompare');
INSERT INTO `sys_menu` VALUES (11, '2019-08-29 18:16:04', b'0', '告警管理', 'alarm/alarm/index', 0, 5, 'alarm', 'alarm');
INSERT INTO `sys_menu` VALUES (12, '2018-12-18 15:11:29', b'0', '区域管理', 'system/dept/index', 0, 6, 'area', 'system');
INSERT INTO `sys_menu` VALUES (13, '2018-12-18 15:11:29', b'0', '设备管理', 'system/job/index', 0, 7, 'device', 'device');
INSERT INTO `sys_menu` VALUES (14, '2018-12-18 15:11:29', b'0', '日志管理', 'monitor/log/errorLog', 0, 203, 'log', 'logs');
INSERT INTO `sys_menu` VALUES (15, '2019-09-30 16:16:21', b'0', 'FTP管理', 'system/ftp/index', 0, 8, 'ftp', 'ftp');
INSERT INTO `sys_menu` VALUES (201, '2018-12-18 15:11:29', b'0', '用户管理', 'system/user/index', 0, 201, 'peoples', 'peoples');
INSERT INTO `sys_menu` VALUES (202, '2018-12-18 15:11:29', b'0', '角色管理', 'system/role/index', 0, 202, 'role', 'role');

-- ----------------------------
-- Table structure for sys_permission
-- ----------------------------
DROP TABLE IF EXISTS `sys_permission`;
CREATE TABLE `sys_permission`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `alias` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '别名',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建日期',
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '名称',
  `pid` int(11) NOT NULL COMMENT '上级权限',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 42 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '权限表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_permission
-- ----------------------------
INSERT INTO `sys_permission` VALUES (1, '菜单管理', '2018-12-28 17:34:31', '/api/menus', 0);
INSERT INTO `sys_permission` VALUES (2, '菜单初始构建', '2018-12-28 17:34:41', '/api/menus/build', 1);
INSERT INTO `sys_permission` VALUES (3, '菜单查询', '2018-12-28 17:34:41', '/menus/tree', 1);
INSERT INTO `sys_permission` VALUES (4, '区域管理', '2018-12-28 17:34:41', '/zone', 0);
INSERT INTO `sys_permission` VALUES (5, '区域查询', '2018-12-28 17:34:41', '/zone/treeDate', 4);
INSERT INTO `sys_permission` VALUES (6, '区域删除', '2018-12-28 17:34:41', '/zone/delete', 4);
INSERT INTO `sys_permission` VALUES (7, '区域增加修改', '2018-12-28 17:34:41', '/zone/add', 4);
INSERT INTO `sys_permission` VALUES (8, '角色管理', '2018-12-28 17:34:41', '/sys/role', 0);
INSERT INTO `sys_permission` VALUES (9, '角色查询', '2018-12-28 17:34:41', '/sys/role/list', 8);
INSERT INTO `sys_permission` VALUES (10, '角色菜单修改', '2018-12-28 17:34:41', '/sys/role/updateMenu', 8);
INSERT INTO `sys_permission` VALUES (11, '角色权限修改', '2018-12-28 17:34:41', '/sys/role/updatePermission', 8);
INSERT INTO `sys_permission` VALUES (12, '权限管理', '2018-12-28 17:34:41', '/sys/permission', 0);
INSERT INTO `sys_permission` VALUES (13, '权限查询', '2018-12-28 17:34:41', '/sys/permission/tree', 12);
INSERT INTO `sys_permission` VALUES (14, '日志管理', '2018-12-28 17:34:41', '/sys/log', 0);
INSERT INTO `sys_permission` VALUES (15, '日志列表', '2018-12-28 17:34:41', '/sys/log/list', 14);
INSERT INTO `sys_permission` VALUES (16, '日志详情', '2018-12-28 17:34:41', '/sys/log/info', 14);
INSERT INTO `sys_permission` VALUES (17, '角色添加', '2018-12-28 17:34:41', '/sys/role/add', 8);
INSERT INTO `sys_permission` VALUES (18, '角色更新', '2018-12-28 17:34:41', '/sys/role/update', 8);
INSERT INTO `sys_permission` VALUES (19, '角色删除', '2018-12-28 17:34:41', '/sys/role/delete', 8);
INSERT INTO `sys_permission` VALUES (20, '设备管理', '2018-12-28 17:34:41', '/hk/device', 0);
INSERT INTO `sys_permission` VALUES (21, '设备查询', '2018-12-28 17:34:41', '/hk/device/list', 20);
INSERT INTO `sys_permission` VALUES (22, '设备添加', '2018-12-28 17:34:41', '/hk/device/add', 20);
INSERT INTO `sys_permission` VALUES (23, '设备更新', '2018-12-28 17:34:41', '/hk/device/update', 20);
INSERT INTO `sys_permission` VALUES (24, '设备删除', '2018-12-28 17:34:41', '/hk/device/delete', 20);
INSERT INTO `sys_permission` VALUES (25, '用户管理', '2018-12-28 17:34:41', '/sys/user', 0);
INSERT INTO `sys_permission` VALUES (26, '用户查询', '2018-12-28 17:34:41', '/sys/user/list', 25);
INSERT INTO `sys_permission` VALUES (27, '用户区域修改', '2018-12-28 17:34:41', '/sys/user/updateZone', 25);
INSERT INTO `sys_permission` VALUES (28, '用户角色修改', '2018-12-28 17:34:41', '/sys/user/updateRole', 25);
INSERT INTO `sys_permission` VALUES (29, '用户添加', '2018-12-28 17:34:41', '/sys/user/add', 25);
INSERT INTO `sys_permission` VALUES (30, '用户更新', '2018-12-28 17:34:41', '/sys/user/update', 25);
INSERT INTO `sys_permission` VALUES (31, '用户删除', '2018-12-28 17:34:41', '/sys/user/delete', 25);
INSERT INTO `sys_permission` VALUES (32, '数据管理', '2018-12-28 17:34:41', '/api/hk', 0);
INSERT INTO `sys_permission` VALUES (33, '实时区域数据查询', '2018-12-28 17:34:41', '/api/hk/findAllRealTime', 32);
INSERT INTO `sys_permission` VALUES (34, '10分数据获取', '2018-12-28 17:34:41', '/api/hk/findOneSixthDate', 32);
INSERT INTO `sys_permission` VALUES (35, '历史数据查询', '2018-12-28 17:34:41', '/api/hk/findByZone', 32);
INSERT INTO `sys_permission` VALUES (36, '客流对比数据', '2018-12-28 17:34:41', '/api/hk/compareByZone', 32);
INSERT INTO `sys_permission` VALUES (37, '历史数据导出', '2018-12-28 17:34:41', '/api/hk/export', 32);
INSERT INTO `sys_permission` VALUES (38, '权限列表', '2018-12-28 17:34:41', '/sys/permission/list', 12);
INSERT INTO `sys_permission` VALUES (39, '告警管理', '2018-12-28 17:34:41', '/api/alarm', 0);
INSERT INTO `sys_permission` VALUES (40, '告警列表', '2018-12-28 17:34:41', '/api/alarm/list', 39);
INSERT INTO `sys_permission` VALUES (41, '告警处理', '2018-12-28 17:34:41', '/api/alarm/solveAlarm', 39);

-- ----------------------------
-- Table structure for sys_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '权限名称',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 34 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '权限表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_role
-- ----------------------------
INSERT INTO `sys_role` VALUES (3, 'hehe');
INSERT INTO `sys_role` VALUES (4, '测试1');
INSERT INTO `sys_role` VALUES (5, '测试2');
INSERT INTO `sys_role` VALUES (6, '测试3');
INSERT INTO `sys_role` VALUES (9, '测试5');
INSERT INTO `sys_role` VALUES (10, '测试6');
INSERT INTO `sys_role` VALUES (13, '测试9999');
INSERT INTO `sys_role` VALUES (14, '测试10');
INSERT INTO `sys_role` VALUES (15, '测试15');
INSERT INTO `sys_role` VALUES (22, '角色3');
INSERT INTO `sys_role` VALUES (26, '测试角色2');
INSERT INTO `sys_role` VALUES (27, '测试角色3');
INSERT INTO `sys_role` VALUES (33, 'role2');

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `user_name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '登录账号',
  `password` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '登录密码',
  `name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户名',
  `role_id` int(11) NULL DEFAULT NULL COMMENT '权限id',
  `last_login_ip` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '最后登录ip',
  `last_login_date` datetime(0) NULL DEFAULT NULL COMMENT '最后登录时间',
  `status` tinyint(1) NOT NULL DEFAULT 1 COMMENT '状态（1有效/0禁止登录）',
  `email` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '邮箱',
  `phone` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '电话',
  `is_alarm` tinyint(1) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 9 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES (1, 'admin', '123456', 'admin', 1, '192.168.0.179', '2019-10-09 11:10:22', 1, 'zhang.yafei@microwise-system.com', '18791841896', 1);
INSERT INTO `sys_user` VALUES (2, 'zhang.yafei', 'e10adc3949ba59abbe56e057f20f883e', 'zhang.yafei', 1, '192.168.0.179', '2019-09-26 13:02:27', 1, 'zhang.yafei@microwise-system.com', '18791841896', 1);
INSERT INTO `sys_user` VALUES (3, 'hj1', 'e10adc3949ba59abbe56e057f20f883e', '韩娟', NULL, NULL, NULL, 1, '860316037@qq.com', '17752625252', 1);
INSERT INTO `sys_user` VALUES (4, '韩娟2', 'e10adc3949ba59abbe56e057f20f883e', 'hj2', NULL, NULL, NULL, 1, 'han.juan@microwise-system.com', '17782697821', 1);
INSERT INTO `sys_user` VALUES (5, 'hj3', 'e10adc3949ba59abbe56e057f20f883e', '韩娟3', NULL, NULL, NULL, 1, '860316037@qq.com', '17782697821', 1);
INSERT INTO `sys_user` VALUES (6, '韩娟4', 'e10adc3949ba59abbe56e057f20f883e', 'hj4', NULL, NULL, NULL, 1, 'haha163775@163.com', '17782697821', 1);
INSERT INTO `sys_user` VALUES (7, 'hj5', 'e10adc3949ba59abbe56e057f20f883e', '韩娟5', NULL, NULL, NULL, 1, 'han.juan@microwise-system.com', '17782697821', 1);
INSERT INTO `sys_user` VALUES (8, 'hj6', 'e10adc3949ba59abbe56e057f20f883e', '韩娟6', NULL, NULL, NULL, 1, 'han.juan@microwise-system.com', '17782697821', 1);

-- ----------------------------
-- Table structure for sys_zone
-- ----------------------------
DROP TABLE IF EXISTS `sys_zone`;
CREATE TABLE `sys_zone`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '区域名称',
  `parent_id` int(11) NOT NULL DEFAULT 0 COMMENT '父级节点ID',
  `position` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '位置信息',
  `detail` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '详细信息',
  `max_number` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1030 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '监测区域表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sys_zone
-- ----------------------------
INSERT INTO `sys_zone` VALUES (1, '四楼办公室', 4, NULL, NULL, NULL);
INSERT INTO `sys_zone` VALUES (2, '五楼展厅', 5, '', '瞪羚谷E座5楼', NULL);
INSERT INTO `sys_zone` VALUES (3, 'E座', 0, '瞪羚谷', '瞪羚谷E座', NULL);
INSERT INTO `sys_zone` VALUES (4, '四楼', 3, '', '', NULL);
INSERT INTO `sys_zone` VALUES (5, '五楼', 3, '', '', NULL);
INSERT INTO `sys_zone` VALUES (6, '六楼', 3, NULL, NULL, NULL);
INSERT INTO `sys_zone` VALUES (1010, '三楼', 3, '', 'E座三楼', NULL);
INSERT INTO `sys_zone` VALUES (1018, '二楼', 3, 'E座', '11', NULL);
INSERT INTO `sys_zone` VALUES (1022, '西夏王陵测试', 0, '', '', NULL);
INSERT INTO `sys_zone` VALUES (1023, '车库', 3, '车库', '车库', NULL);
INSERT INTO `sys_zone` VALUES (1024, '西夏王陵', 1022, '', '', NULL);
INSERT INTO `sys_zone` VALUES (1029, '一楼', 4, '', '', NULL);

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(60) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '会员姓名',
  `sex` int(11) NOT NULL COMMENT '会员性别',
  `age` int(60) NULL DEFAULT NULL COMMENT '会员年龄',
  `birthday` datetime(0) NOT NULL COMMENT '会员生日',
  `telephone` varchar(60) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '会员电话',
  `job` varchar(60) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '会员职业',
  `address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '会员家庭住址',
  `account_time` datetime(0) NOT NULL COMMENT '会员开户时间',
  `account_id` int(11) NULL DEFAULT NULL COMMENT '会员登录账号ID',
  `body_id` int(11) NULL DEFAULT NULL COMMENT '会员身体状态ID',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 49 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 'YY', 0, 18, '1993-06-24 19:12:20', '1399999999', 'IT码农', '陕西省西安市高新区', '2019-10-13 19:12:54', NULL, NULL);
INSERT INTO `user` VALUES (2, '王JY', 0, 19, '1993-03-18 19:13:29', '13888888888', 'IT新贵', '陕西省西安市高新区', '2019-10-13 19:12:10', NULL, NULL);
INSERT INTO `user` VALUES (3, 'LL', 0, 22, '1990-10-13 19:14:24', '13777777777', '测试', '陕西省咸阳市', '2019-06-01 19:14:56', NULL, NULL);
INSERT INTO `user` VALUES (4, 'WW', 0, 25, '1991-02-13 19:15:29', '13666666666', '软件开发', '浙江省温州市', '2012-11-15 19:16:05', NULL, NULL);
INSERT INTO `user` VALUES (5, 'QQ', 0, 26, '2016-08-12 19:16:24', '13555555555', '销售', '浙江省杭州市', '2017-06-10 19:17:03', NULL, NULL);

-- ----------------------------
-- Procedure structure for init_shiro_demo
-- ----------------------------
DROP PROCEDURE IF EXISTS `init_shiro_demo`;
delimiter ;;
CREATE PROCEDURE `init_shiro_demo`()
BEGIN
/*
SQLyog 企业版 - MySQL GUI v7.14
MySQL - 5.6.16-log : Database -
*********************************************************************
*/
/*表结构插入*/
DROP TABLE IF EXISTS `u_permission`;
CREATE TABLE `u_permission` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `url` varchar(256) DEFAULT NULL COMMENT 'url地址',
  `name` varchar(64) DEFAULT NULL COMMENT 'url描述',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;
/*Table structure for table `u_role` */
DROP TABLE IF EXISTS `u_role`;
CREATE TABLE `u_role` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(32) DEFAULT NULL COMMENT '角色名称',
  `type` varchar(10) DEFAULT NULL COMMENT '角色类型',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*Table structure for table `u_role_permission` */
DROP TABLE IF EXISTS `u_role_permission`;
CREATE TABLE `u_role_permission` (
  `rid` bigint(20) DEFAULT NULL COMMENT '角色ID',
  `pid` bigint(20) DEFAULT NULL COMMENT '权限ID'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*Table structure for table `u_user` */
DROP TABLE IF EXISTS `u_user`;
CREATE TABLE `u_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `nickname` varchar(20) DEFAULT NULL COMMENT '用户昵称',
  `email` varchar(128) DEFAULT NULL COMMENT '邮箱|登录帐号',
  `pswd` varchar(32) DEFAULT NULL COMMENT '密码',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `last_login_time` datetime DEFAULT NULL COMMENT '最后登录时间',
  `status` bigint(1) DEFAULT '1' COMMENT '1:有效，0:禁止登录',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;
/*Table structure for table `u_user_role` */
DROP TABLE IF EXISTS `u_user_role`;
CREATE TABLE `u_user_role` (
  `uid` bigint(20) DEFAULT NULL COMMENT '用户ID',
  `rid` bigint(20) DEFAULT NULL COMMENT '角色ID'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*
SQLyog 企业版 - MySQL GUI v7.14
MySQL - 5.6.16-log : Database - i_wenyiba_com
*********************************************************************
*/
/*所有的表数据插入*/
/*Data for the table `u_permission` */
insert  into `u_permission`(`id`,`url`,`name`) values (4,'/permission/index.shtml','权限列表'),(6,'/permission/addPermission.shtml','权限添加'),(7,'/permission/deletePermissionById.shtml','权限删除'),(8,'/member/list.shtml','用户列表'),(9,'/member/online.shtml','在线用户'),(10,'/member/changeSessionStatus.shtml','用户Session踢出'),(11,'/member/forbidUserById.shtml','用户激活&禁止'),(12,'/member/deleteUserById.shtml','用户删除'),(13,'/permission/addPermission2Role.shtml','权限分配'),(14,'/role/clearRoleByUserIds.shtml','用户角色分配清空'),(15,'/role/addRole2User.shtml','角色分配保存'),(16,'/role/deleteRoleById.shtml','角色列表删除'),(17,'/role/addRole.shtml','角色列表添加'),(18,'/role/index.shtml','角色列表'),(19,'/permission/allocation.shtml','权限分配'),(20,'/role/allocation.shtml','角色分配');
/*Data for the table `u_role` */
insert  into `u_role`(`id`,`name`,`type`) values (1,'系统管理员','888888'),(3,'权限角色','100003'),(4,'用户中心','100002');
/*Data for the table `u_role_permission` */
insert  into `u_role_permission`(`rid`,`pid`) values (4,8),(4,9),(4,10),(4,11),(4,12),(3,4),(3,6),(3,7),(3,13),(3,14),(3,15),(3,16),(3,17),(3,18),(3,19),(3,20),(1,4),(1,6),(1,7),(1,8),(1,9),(1,10),(1,11),(1,12),(1,13),(1,14),(1,15),(1,16),(1,17),(1,18),(1,19),(1,20);
/*Data for the table `u_user` */
insert  into `u_user`(`id`,`nickname`,`email`,`pswd`,`create_time`,`last_login_time`,`status`) values (1,'管理员','admin','9c3250081c7b1f5c6cbb8096e3e1cd04','2016-06-16 11:15:33','2016-06-16 11:24:10',1),(11,'soso','8446666@qq.com','d57ffbe486910dd5b26d0167d034f9ad','2016-05-26 20:50:54','2016-06-16 11:24:35',1),(12,'8446666','8446666','4afdc875a67a55528c224ce088be2ab8','2016-05-27 22:34:19','2016-06-15 17:03:16',1);
/*Data for the table `u_user_role` */
insert  into `u_user_role`(`uid`,`rid`) values (12,4),(11,3),(11,4),(1,1);

    END
;;
delimiter ;

SET FOREIGN_KEY_CHECKS = 1;
