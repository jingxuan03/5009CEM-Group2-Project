-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 30, 2023 at 10:36 AM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `aps`
--

-- --------------------------------------------------------

--
-- Table structure for table `forum_comment`
--

CREATE TABLE `forum_comment` (
  `user_name` varchar(25) NOT NULL,
  `date` date NOT NULL DEFAULT current_timestamp(),
  `comment` varchar(256) NOT NULL,
  `forum_id` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `forum_comment`
--

INSERT INTO `forum_comment` (`user_name`, `date`, `comment`, `forum_id`) VALUES
('KaiJain_Forum', '2023-06-29', 'test is this', '4'),
('Kai Jian', '2023-06-30', 'yes', '1');

-- --------------------------------------------------------

--
-- Table structure for table `management_forum`
--

CREATE TABLE `management_forum` (
  `user_name` varchar(256) NOT NULL,
  `title` varchar(55) NOT NULL,
  `date` date NOT NULL DEFAULT current_timestamp(),
  `content` varchar(256) NOT NULL,
  `forum_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `management_forum`
--

INSERT INTO `management_forum` (`user_name`, `title`, `date`, `content`, `forum_id`) VALUES
('Tan Zhi Hong', 'How to do so', '0000-00-00', 'try', 1);

-- --------------------------------------------------------

--
-- Table structure for table `resident`
--

CREATE TABLE `resident` (
  `id` int(11) NOT NULL,
  `password` varchar(256) NOT NULL,
  `name` varchar(256) DEFAULT NULL,
  `email` varchar(256) DEFAULT NULL,
  `vehicleNum` int(20) DEFAULT NULL,
  `phoneNum` int(20) DEFAULT NULL,
  `unitNo` int(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Dumping data for table `resident`
--

INSERT INTO `resident` (`id`, `password`, `name`, `email`, `vehicleNum`, `phoneNum`, `unitNo`) VALUES
(1, '202cb962ac59075b964b07152d234b70', 'Kai Jian', NULL, NULL, NULL, 100);

-- --------------------------------------------------------

--
-- Table structure for table `resident_bills`
--

CREATE TABLE `resident_bills` (
  `user_id` int(5) NOT NULL,
  `user_name` varchar(256) NOT NULL,
  `January` tinyint(1) NOT NULL DEFAULT 0,
  `February` tinyint(1) NOT NULL DEFAULT 0,
  `March` tinyint(1) NOT NULL DEFAULT 0,
  `April` tinyint(1) NOT NULL DEFAULT 0,
  `May` tinyint(1) NOT NULL DEFAULT 0,
  `June` tinyint(1) NOT NULL DEFAULT 0,
  `July` tinyint(1) NOT NULL DEFAULT 0,
  `August` tinyint(1) NOT NULL DEFAULT 0,
  `September` tinyint(1) NOT NULL DEFAULT 0,
  `October` tinyint(1) NOT NULL DEFAULT 0,
  `November` tinyint(1) NOT NULL DEFAULT 0,
  `December` tinyint(1) NOT NULL DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `resident_bills`
--

INSERT INTO `resident_bills` (`user_id`, `user_name`, `January`, `February`, `March`, `April`, `May`, `June`, `July`, `August`, `September`, `October`, `November`, `December`) VALUES
(1, 'Tan Zhi', 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0);

-- --------------------------------------------------------

--
-- Table structure for table `resident_forum`
--

CREATE TABLE `resident_forum` (
  `user_id` int(5) NOT NULL,
  `user_name` varchar(256) NOT NULL,
  `title` varchar(256) NOT NULL,
  `date` datetime NOT NULL DEFAULT current_timestamp(),
  `content` text NOT NULL,
  `forum_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `resident_forum`
--

INSERT INTO `resident_forum` (`user_id`, `user_name`, `title`, `date`, `content`, `forum_id`) VALUES
(1, 'KaiJain_Forum', 'How to keep our Community clean? idk', '2023-06-22 00:00:00', '1,040,836 views  Premiered May 28, 2022\r\n💃 Takanashi Kiara - Fever Night 💃\r\nMV:   \r\n\r\n • Fever Night - Tak...  \r\nStreaming: https://cover.lnk.to/FeverNight\r\n\r\nMusic　@Astrophysicsynth \r\nLyrics　@NataliaNatchannel  \r\nIllustration　mamaloni (https://twitter.com/CRUNCHY_MMLONI)\r\nMix　五条下位 (https://twitter.com/gojyokai)\r\nLogo　Spiritsnare (https://twitter.com/Spiritsnare)\r\nMV　@ehre5033 \r\nVocals　@TakanashiKiara \r\n\r\n\r\n✨ Takanashi Kiara - SPARKS ✨\r\nMV:   \r\n\r\n • SPARKS - Takanash...  \r\nStreaming: https://kiara.streamlink.to/SPARKS\r\n\r\n\r\n💖 Takanashi Kiara - Heart Challenger 💖\r\nMV:   \r\n\r\n • Heart Challenger ...  \r\nStreaming: https://kiara.streamlink.to/HeartChal...\r\n\r\n\r\n🔥 Takanashi Kiara\'s First Original Song, \"HINOTORI\" 🔥\r\nMV:   \r\n\r\n • HINOTORI - Takana...  \r\nStreaming: https://kiara.streamlink.to/hinotori', 1),
(2, 'Tan', 'Check', '2023-06-22 16:25:22', 'CheckCheck', 2),
(4, 'test', 'test', '2023-06-27 17:43:07', 'test', 4),
(1, 'Kai Jian', '123', '2023-06-30 08:58:35', 'asd', 5),
(1, 'Kai Jian', 'new title', '2023-06-30 10:30:19', '123', 6);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `bool` tinyint(1) NOT NULL DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `bool`) VALUES
(1, 0),
(2, 0);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `management_forum`
--
ALTER TABLE `management_forum`
  ADD PRIMARY KEY (`forum_id`);

--
-- Indexes for table `resident`
--
ALTER TABLE `resident`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `resident_bills`
--
ALTER TABLE `resident_bills`
  ADD PRIMARY KEY (`user_id`);

--
-- Indexes for table `resident_forum`
--
ALTER TABLE `resident_forum`
  ADD PRIMARY KEY (`forum_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `management_forum`
--
ALTER TABLE `management_forum`
  MODIFY `forum_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `resident`
--
ALTER TABLE `resident`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- AUTO_INCREMENT for table `resident_forum`
--
ALTER TABLE `resident_forum`
  MODIFY `forum_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
