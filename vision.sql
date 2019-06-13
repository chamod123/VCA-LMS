-- phpMyAdmin SQL Dump
-- version 3.3.9
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Jun 16, 2017 at 07:20 PM
-- Server version: 5.5.8
-- PHP Version: 5.3.5

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `vision`
--

-- --------------------------------------------------------

--
-- Table structure for table `batch`
--

CREATE TABLE IF NOT EXISTS `batch` (
  `b_no` int(10) NOT NULL,
  `b_dis` varchar(255) NOT NULL,
  PRIMARY KEY (`b_no`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `batch`
--

INSERT INTO `batch` (`b_no`, `b_dis`) VALUES
(100, 'dcsd'),
(101, 'dsn'),
(103, 'dcsd'),
(104, 'dcn'),
(105, 'ccs');

-- --------------------------------------------------------

--
-- Table structure for table `certificate`
--

CREATE TABLE IF NOT EXISTS `certificate` (
  `co_no` int(10) NOT NULL,
  `c_name` varchar(255) NOT NULL,
  `c_result` float NOT NULL,
  PRIMARY KEY (`co_no`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `certificate`
--

INSERT INTO `certificate` (`co_no`, `c_name`, `c_result`) VALUES
(1, 'dcsd', 0),
(2, 'dcn', 0);

-- --------------------------------------------------------

--
-- Table structure for table `gpa`
--

CREATE TABLE IF NOT EXISTS `gpa` (
  `gpa_no` int(10) NOT NULL,
  `final_gpa` float NOT NULL,
  `co_no` int(10) NOT NULL,
  PRIMARY KEY (`gpa_no`),
  KEY `co_no` (`co_no`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `gpa`
--

INSERT INTO `gpa` (`gpa_no`, `final_gpa`, `co_no`) VALUES
(1, 3.6, 2),
(2, 3.3, 1);

-- --------------------------------------------------------

--
-- Table structure for table `grade`
--

CREATE TABLE IF NOT EXISTS `grade` (
  `gr_no` int(10) NOT NULL,
  `tot` int(5) NOT NULL,
  `grades` varchar(2) NOT NULL,
  `gpoint` float NOT NULL,
  `p_amark` int(5) NOT NULL,
  `p_bmark` int(5) NOT NULL,
  `st_id` int(10) NOT NULL,
  `sub_code` int(10) NOT NULL,
  PRIMARY KEY (`gr_no`),
  KEY `sub_code` (`sub_code`),
  KEY `st_id` (`st_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `grade`
--

INSERT INTO `grade` (`gr_no`, `tot`, `grades`, `gpoint`, `p_amark`, `p_bmark`, `st_id`, `sub_code`) VALUES
(1, 75, 'A', 4, 35, 40, 200, 1001),
(2, 80, 'A', 4, 40, 40, 201, 1001),
(3, 50, 'B-', 2.7, 20, 30, 205, 1001),
(4, 55, 'B', 3, 25, 30, 200, 1002),
(5, 40, 'C', 2, 10, 30, 201, 1002),
(6, 42, 'C', 2, 30, 12, 205, 1002),
(7, 22, 'E', 0, 10, 12, 203, 1001),
(8, 78, 'A', 4, 35, 43, 206, 1001),
(9, 55, 'B', 3, 25, 30, 208, 1001),
(10, 82, 'A', 4, 42, 40, 203, 1002),
(11, 81, 'A', 4, 39, 42, 206, 1002),
(12, 43, 'C', 2, 29, 14, 208, 1002);

-- --------------------------------------------------------

--
-- Table structure for table `lecturerdetail`
--

CREATE TABLE IF NOT EXISTS `lecturerdetail` (
  `lno` int(10) NOT NULL,
  `lec_id` int(10) NOT NULL,
  `sub_code` int(10) NOT NULL,
  PRIMARY KEY (`lno`),
  KEY `lec_id` (`lec_id`),
  KEY `sub_code` (`sub_code`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `lecturerdetail`
--

INSERT INTO `lecturerdetail` (`lno`, `lec_id`, `sub_code`) VALUES
(1, 5, 1001),
(2, 6, 1002);

-- --------------------------------------------------------

--
-- Table structure for table `lecturermaster`
--

CREATE TABLE IF NOT EXISTS `lecturermaster` (
  `lec_id` int(10) NOT NULL,
  `lec_name` varchar(20) NOT NULL,
  `address` varchar(25) NOT NULL,
  `age` int(5) NOT NULL,
  `tp` int(10) NOT NULL,
  `lec_pass` varchar(5) NOT NULL,
  PRIMARY KEY (`lec_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `lecturermaster`
--

INSERT INTO `lecturermaster` (`lec_id`, `lec_name`, `address`, `age`, `tp`, `lec_pass`) VALUES
(5, 'nisal', 'kurunagala', 41, 126985478, 'abcd'),
(6, 'sunil', 'galle', 38, 713569842, '1234');

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE IF NOT EXISTS `student` (
  `st_id` int(10) NOT NULL,
  `s_fname` varchar(10) NOT NULL,
  `s_mname` varchar(101) NOT NULL,
  `s_lname` varchar(10) NOT NULL,
  `age` int(2) NOT NULL,
  `sex` varchar(5) NOT NULL,
  `add1` varchar(25) NOT NULL,
  `add2` varchar(25) DEFAULT NULL,
  `tp1` int(10) DEFAULT NULL,
  `tp2` int(10) DEFAULT NULL,
  `email` varchar(25) NOT NULL,
  `b_no` int(10) NOT NULL,
  PRIMARY KEY (`st_id`),
  KEY `b_no` (`b_no`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`st_id`, `s_fname`, `s_mname`, `s_lname`, `age`, `sex`, `add1`, `add2`, `tp1`, `tp2`, `email`, `b_no`) VALUES
(200, 'maduka', 'chamod', 'wijesena', 20, 'male', 'pinwatha', 'panadura', 123654789, 771234568, 'chamod@gmail.com', 100),
(201, 'nimantha', 'pathum', 'silva', 19, 'male', 'flower road', 'kaluthara', 164569874, 713569842, 'pathum@gmail.com', 100),
(203, 'kusal', 'abecone', 'wijevira', 17, 'male', 'nittabuwa', 'Srilanka', 77654814, 215487542, 'kusal@gmail.com', 101),
(204, 'kamal', 'pranandu', 'silva', 18, 'male', 'hikkaduwa', 'galle', 548784456, 1484846641, 'kamal@gmail.com', 103),
(205, 'nayana', 'udani ', 'silva', 17, 'femal', 'rathnapura', 'hibutana', 147787854, 326515874, 'nayana@gmail.com', 100),
(206, 'akila', 'tharuka', 'dilshan', 20, 'male', 'hikkaduwa', 'ahangama', 745845698, 765468564, 'akila@gmail.com', 101),
(207, 'sunil', 'jayantha', 'abecone', 21, 'male', 'kirubathgoda', 'nugegoda', 798451265, 774588812, 'sunil11@gmail.com', 103),
(208, 'sanath', 'jayantha', 'perera', 19, 'male', 'kakirawa', 'srilanka', 178954445, 112374155, 'sanath@gmail.com', 101),
(209, 'shashen', 'mihiranga', 'prasanna', 19, 'male', 'walana', 'panadura', 14483647, 754844862, 'shashenmi@gmail.com', 103),
(210, 'sajith', 'udara', 'perera', 19, 'male', 'udawatha', 'galle', 157896558, 175246582, 'sajith@gmail.com', 104),
(211, 'nimal', 'kumara', 'silva', 20, 'male', 'dehiwada', 'mt.', 117751420, 147483647, 'nimal@gmail.com', 105),
(212, 'ajith', 'kumara', 'kabral', 17, 'male', 'nalluruwa', 'panadura', 776548210, 765421354, 'ajith@gmail.com', 104),
(213, 'ishara', 'prasanna', 'abesinha', 22, 'male', 'pitipana', 'homagama', 765485452, 714114786, 'ishara@gmil.com', 105),
(214, 'prasanna', 'kumara', 'thotagama', 17, 'male', 'moratuwa', 'agulana', 779853864, 779471348, 'prasanna@gmail.com', 105),
(215, 'isuru', 'devinda', 'silva', 21, 'male', 'kalaniya', 'mathugama', 754845412, 721544210, 'isuru@gmail.com', 104);

-- --------------------------------------------------------

--
-- Table structure for table `subjectdetail`
--

CREATE TABLE IF NOT EXISTS `subjectdetail` (
  `no` int(10) NOT NULL,
  `n_chapter` int(5) NOT NULL,
  `sy_code` int(10) NOT NULL,
  `sub_code` int(10) NOT NULL,
  PRIMARY KEY (`no`),
  KEY `sy_code` (`sy_code`),
  KEY `sub_code` (`sub_code`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `subjectdetail`
--

INSERT INTO `subjectdetail` (`no`, `n_chapter`, `sy_code`, `sub_code`) VALUES
(1, 2, 2, 1002),
(2, 5, 2, 1001);

-- --------------------------------------------------------

--
-- Table structure for table `subjectheader`
--

CREATE TABLE IF NOT EXISTS `subjectheader` (
  `sub_code` int(10) NOT NULL AUTO_INCREMENT,
  `sub_name` varchar(25) NOT NULL,
  `credits` int(10) NOT NULL,
  PRIMARY KEY (`sub_code`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=1011 ;

--
-- Dumping data for table `subjectheader`
--

INSERT INTO `subjectheader` (`sub_code`, `sub_name`, `credits`) VALUES
(1001, 'MP', 4),
(1002, 'EAD', 3),
(1003, 'C_Programming', 3),
(1004, 'CT', 4),
(1005, 'DBMS', 3),
(1006, 'System', 5),
(1007, 'C++', 3),
(1008, 'CA', 4),
(1009, 'internet', 5),
(1010, 'VB', 3);

-- --------------------------------------------------------

--
-- Table structure for table `syllabus`
--

CREATE TABLE IF NOT EXISTS `syllabus` (
  `sy_code` int(10) NOT NULL,
  `duration` varchar(15) NOT NULL,
  PRIMARY KEY (`sy_code`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `syllabus`
--

INSERT INTO `syllabus` (`sy_code`, `duration`) VALUES
(1, '6 month'),
(2, '4 month'),
(3, '12 month'),
(4, '24 month'),
(5, '28 month');

--
-- Constraints for dumped tables
--

--
-- Constraints for table `gpa`
--
ALTER TABLE `gpa`
  ADD CONSTRAINT `gpa_ibfk_1` FOREIGN KEY (`co_no`) REFERENCES `certificate` (`co_no`);

--
-- Constraints for table `grade`
--
ALTER TABLE `grade`
  ADD CONSTRAINT `grade_ibfk_1` FOREIGN KEY (`st_id`) REFERENCES `student` (`st_id`),
  ADD CONSTRAINT `grade_ibfk_2` FOREIGN KEY (`sub_code`) REFERENCES `subjectheader` (`sub_code`);

--
-- Constraints for table `lecturerdetail`
--
ALTER TABLE `lecturerdetail`
  ADD CONSTRAINT `lecturerdetail_ibfk_1` FOREIGN KEY (`lec_id`) REFERENCES `lecturermaster` (`lec_id`),
  ADD CONSTRAINT `lecturerdetail_ibfk_2` FOREIGN KEY (`sub_code`) REFERENCES `subjectheader` (`sub_code`);

--
-- Constraints for table `student`
--
ALTER TABLE `student`
  ADD CONSTRAINT `student_ibfk_1` FOREIGN KEY (`b_no`) REFERENCES `batch` (`b_no`);

--
-- Constraints for table `subjectdetail`
--
ALTER TABLE `subjectdetail`
  ADD CONSTRAINT `subjectdetail_ibfk_1` FOREIGN KEY (`sy_code`) REFERENCES `syllabus` (`sy_code`),
  ADD CONSTRAINT `subjectdetail_ibfk_2` FOREIGN KEY (`sub_code`) REFERENCES `subjectheader` (`sub_code`);
