-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 06, 2022 at 02:21 PM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `schedule_java`
--

-- --------------------------------------------------------

--
-- Table structure for table `schedule`
--

CREATE TABLE `schedule` (
  `Id` int(11) NOT NULL,
  `SportName` varchar(100) NOT NULL,
  `TeamName` varchar(100) NOT NULL,
  `ScheduleDate` date NOT NULL,
  `TimeStart` varchar(20) NOT NULL,
  `TimeEnd` varchar(20) NOT NULL,
  `Status` varchar(30) NOT NULL COMMENT 'Approve/Disapprove'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `schedule`
--

INSERT INTO `schedule` (`Id`, `SportName`, `TeamName`, `ScheduleDate`, `TimeStart`, `TimeEnd`, `Status`) VALUES
(3, 'Basket Ball', 'kokoy Team', '2022-12-01', '1:00 pm', '5:00 pm', 'Disapprove'),
(4, 'badminton', 'Fairy Team', '2022-12-07', '1', '2', 'Disapprove'),
(5, 'badminton', 'Fairy Team', '2022-12-10', '1', '2', 'Approve');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `schedule`
--
ALTER TABLE `schedule`
  ADD PRIMARY KEY (`Id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `schedule`
--
ALTER TABLE `schedule`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
