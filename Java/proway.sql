-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 28-Maio-2019 às 16:49
-- Versão do servidor: 10.1.36-MariaDB
-- versão do PHP: 7.2.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `proway`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `alunos`
--

CREATE TABLE `alunos` (
  `idAluno` int(11) NOT NULL,
  `nomeAluno` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `cursos`
--

CREATE TABLE `cursos` (
  `idCurso` int(11) NOT NULL,
  `nomeCurso` varchar(30) NOT NULL,
  `valorCurso` double DEFAULT NULL,
  `segmentoCurso` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `cursos`
--

INSERT INTO `cursos` (`idCurso`, `nomeCurso`, `valorCurso`, `segmentoCurso`) VALUES
(1, 'Teste', 100, NULL),
(2, 'C# .NET', 2100, 'Programação'),
(3, 'Photoshop', 600, 'Design Gráfico'),
(4, 'PHP Básico', 700, 'Programação'),
(5, 'Corel Draw', 850, 'Design Gráfico'),
(6, 'Swift', 3500, 'Programação');

-- --------------------------------------------------------

--
-- Estrutura da tabela `segmentos`
--

CREATE TABLE `segmentos` (
  `idSegmento` int(11) NOT NULL,
  `nomeSegmento` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `segmentos`
--

INSERT INTO `segmentos` (`idSegmento`, `nomeSegmento`) VALUES
(1, 'Programação'),
(2, 'Banco de Dados'),
(3, 'Design Gráfico'),
(4, 'Marketing'),
(5, 'Administração'),
(6, 'Servidores'),
(7, 'Teste de Software');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `alunos`
--
ALTER TABLE `alunos`
  ADD PRIMARY KEY (`idAluno`);

--
-- Indexes for table `cursos`
--
ALTER TABLE `cursos`
  ADD PRIMARY KEY (`idCurso`);

--
-- Indexes for table `segmentos`
--
ALTER TABLE `segmentos`
  ADD PRIMARY KEY (`idSegmento`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `alunos`
--
ALTER TABLE `alunos`
  MODIFY `idAluno` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `cursos`
--
ALTER TABLE `cursos`
  MODIFY `idCurso` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `segmentos`
--
ALTER TABLE `segmentos`
  MODIFY `idSegmento` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
