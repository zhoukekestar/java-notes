创建数据库

```sql
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) DEFAULT NULL,
  `name` varchar(30) CHARACTER SET utf8 DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'zkk');
INSERT INTO `user` VALUES ('2', '张三');
INSERT INTO `user` VALUES ('3', '李四');

```