/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 100411
 Source Host           : localhost:3306
 Source Schema         : restuarant

 Target Server Type    : MySQL
 Target Server Version : 100411
 File Encoding         : 65001

 Date: 20/08/2020 02:03:56
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for employee
-- ----------------------------
DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee`  (
  `EmpID` int(11) NOT NULL AUTO_INCREMENT COMMENT 'รหัสพนักงาน',
  `Prefix` tinytext CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT 'คำนำหน้า',
  `Name` text CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT 'ชื่อ',
  `LastName` text CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT 'นามสกุล',
  `Username` text CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT 'ชื่อผู้ใช้',
  `Password` text CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT 'รหัสผ่าน',
  `Birthday` datetime(0) NOT NULL COMMENT 'วันเกิด',
  `StartDay` datetime(0) NOT NULL COMMENT 'วันที่เริ่มงาน',
  `IDCard` text CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT 'รหัสบัตรประชาชน',
  `Phone` text CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT 'เบอร์โทรศัพท์',
  `Address` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT 'ที่อยู่',
  PRIMARY KEY (`EmpID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of employee
-- ----------------------------
INSERT INTO `employee` VALUES (1, 'admin', 'admin', 'admin', 'admin', 'admin', '2020-08-01 01:57:45', '2020-08-08 01:57:51', '9999-999-999-999', '089-989-9999', 'admin');

-- ----------------------------
-- Table structure for income_expense
-- ----------------------------
DROP TABLE IF EXISTS `income_expense`;
CREATE TABLE `income_expense`  (
  `TID` int(11) NOT NULL AUTO_INCREMENT COMMENT 'รหัสรายการ',
  `EmpID` int(11) NOT NULL COMMENT 'รหัสพนักงาน',
  `Detail` text CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT 'รายละเอียด',
  `Date` datetime(0) NOT NULL COMMENT 'วันที่ทำรายการ',
  `Type` int(255) NOT NULL COMMENT 'ประเภท',
  `Balance` decimal(10, 0) NOT NULL COMMENT 'ยอดเงินของรายการ',
  PRIMARY KEY (`TID`) USING BTREE,
  INDEX `EmpID`(`EmpID`) USING BTREE,
  CONSTRAINT `income_expense_ibfk_1` FOREIGN KEY (`EmpID`) REFERENCES `employee` (`EmpID`) ON DELETE RESTRICT ON UPDATE CASCADE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for material
-- ----------------------------
DROP TABLE IF EXISTS `material`;
CREATE TABLE `material`  (
  `MaterialID` int(5) NOT NULL AUTO_INCREMENT COMMENT 'รหัสวัตถุดิบ',
  `MaterialName` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT 'ชื่อวัตถุดิบ',
  `MaterialPrice` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT 'ราคา',
  `MaterialAmount` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '0' COMMENT 'จำนวน',
  `UnitOfMeasure` text CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT 'หน่วยนับ',
  `Detail` text CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT 'รายละเอียด',
  PRIMARY KEY (`MaterialID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for order
-- ----------------------------
DROP TABLE IF EXISTS `order`;
CREATE TABLE `order`  (
  `OrderID` int(11) NOT NULL AUTO_INCREMENT COMMENT 'รหัสสั่งวัตถุดิบ',
  `EmpID` int(11) NULL DEFAULT NULL COMMENT 'รหัสพนักงาน',
  `SupplierID` int(11) NULL DEFAULT NULL COMMENT 'รหัส supplier',
  `Date` datetime(0) NULL DEFAULT NULL COMMENT 'วันที่สั่ง',
  `Total` decimal(10, 0) NULL DEFAULT NULL COMMENT 'ยอดรวม',
  PRIMARY KEY (`OrderID`) USING BTREE,
  INDEX `EmpID`(`EmpID`) USING BTREE,
  INDEX `SupplierID`(`SupplierID`) USING BTREE,
  CONSTRAINT `order_ibfk_1` FOREIGN KEY (`EmpID`) REFERENCES `employee` (`EmpID`) ON DELETE RESTRICT ON UPDATE CASCADE,
  CONSTRAINT `order_ibfk_2` FOREIGN KEY (`SupplierID`) REFERENCES `supplier` (`SupplierID`) ON DELETE RESTRICT ON UPDATE CASCADE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for orderdetails
-- ----------------------------
DROP TABLE IF EXISTS `orderdetails`;
CREATE TABLE `orderdetails`  (
  `OrderID` int(11) NOT NULL COMMENT 'รหัสสั่งวัตถุดิบ',
  `MaterialID` int(11) NOT NULL COMMENT 'รหัสวัตถุดิบ',
  `Unit` smallint(255) NULL DEFAULT NULL COMMENT 'จำนวน',
  `Status` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT 'สถานะ',
  PRIMARY KEY (`OrderID`, `MaterialID`) USING BTREE,
  INDEX `MaterialID`(`MaterialID`) USING BTREE,
  CONSTRAINT `orderdetails_ibfk_1` FOREIGN KEY (`OrderID`) REFERENCES `order` (`OrderID`) ON DELETE RESTRICT ON UPDATE CASCADE,
  CONSTRAINT `orderdetails_ibfk_2` FOREIGN KEY (`MaterialID`) REFERENCES `material` (`MaterialID`) ON DELETE RESTRICT ON UPDATE CASCADE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for receivematerial
-- ----------------------------
DROP TABLE IF EXISTS `receivematerial`;
CREATE TABLE `receivematerial`  (
  `ReceiveID` int(11) NOT NULL AUTO_INCREMENT COMMENT 'รหัสการรับวัตถุดิบ',
  `OrderID` int(11) NOT NULL COMMENT 'รหัสการสั่ง',
  `DateReceive` datetime(0) NULL DEFAULT NULL COMMENT 'วันที่',
  `EmpID` int(11) NULL DEFAULT NULL COMMENT 'รหัสพนักงาน',
  PRIMARY KEY (`ReceiveID`) USING BTREE,
  INDEX `OrderID`(`OrderID`) USING BTREE,
  INDEX `EmpID`(`EmpID`) USING BTREE,
  CONSTRAINT `receivematerial_ibfk_1` FOREIGN KEY (`OrderID`) REFERENCES `order` (`OrderID`) ON DELETE RESTRICT ON UPDATE CASCADE,
  CONSTRAINT `receivematerial_ibfk_2` FOREIGN KEY (`EmpID`) REFERENCES `employee` (`EmpID`) ON DELETE RESTRICT ON UPDATE CASCADE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for receivematerialdetail
-- ----------------------------
DROP TABLE IF EXISTS `receivematerialdetail`;
CREATE TABLE `receivematerialdetail`  (
  `ReceiveID` int(11) NOT NULL COMMENT 'รหัสการรับวัตตุดิบ',
  `MaterialID` int(11) NOT NULL COMMENT 'รหัสวัตถุดิบ',
  `Unit` int(255) NULL DEFAULT NULL COMMENT 'จำนวนที่ได้รับ',
  PRIMARY KEY (`ReceiveID`, `MaterialID`) USING BTREE,
  INDEX `MaterialID`(`MaterialID`) USING BTREE,
  CONSTRAINT `receivematerialdetail_ibfk_1` FOREIGN KEY (`ReceiveID`) REFERENCES `receivematerial` (`ReceiveID`) ON DELETE RESTRICT ON UPDATE CASCADE,
  CONSTRAINT `receivematerialdetail_ibfk_2` FOREIGN KEY (`MaterialID`) REFERENCES `material` (`MaterialID`) ON DELETE RESTRICT ON UPDATE CASCADE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for supplier
-- ----------------------------
DROP TABLE IF EXISTS `supplier`;
CREATE TABLE `supplier`  (
  `SupplierID` int(11) NOT NULL AUTO_INCREMENT COMMENT 'รหัส supplier',
  `Company` text CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT 'ชื่อบริษัท',
  `ContactPersonName` text CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT 'ชื่อผู้ติดต่อ',
  `Address` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT 'ที่อยู่',
  `Tel` text CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT 'โทรศัพท์',
  PRIMARY KEY (`SupplierID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
