-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 13-Abr-2021 às 16:19
-- Versão do servidor: 10.1.38-MariaDB
-- versão do PHP: 7.3.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `consultoria`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbanuncio`
--

CREATE TABLE `tbanuncio` (
  `idanuncio` int(11) NOT NULL,
  `data_publicacao` date DEFAULT NULL,
  `tipo_anuncio` varchar(8) DEFAULT NULL,
  `id_imovel` int(11) DEFAULT NULL,
  `id_usuario` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `tbanuncio`
--

INSERT INTO `tbanuncio` (`idanuncio`, `data_publicacao`, `tipo_anuncio`, `id_imovel`, `id_usuario`) VALUES
(2, '2021-04-04', 'Venda', 32, 4);

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbimovel`
--

CREATE TABLE `tbimovel` (
  `idimovel` int(11) NOT NULL,
  `bairro` varchar(50) DEFAULT NULL,
  `tipo_imovel` varchar(11) DEFAULT NULL,
  `nr_casa` int(4) DEFAULT NULL,
  `quarteirao` int(2) DEFAULT NULL,
  `dimensao` varchar(10) DEFAULT NULL,
  `andar` int(2) DEFAULT NULL,
  `descricao` varchar(200) DEFAULT NULL,
  `preco` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `tbimovel`
--

INSERT INTO `tbimovel` (`idimovel`, `bairro`, `tipo_imovel`, `nr_casa`, `quarteirao`, `dimensao`, `andar`, `descricao`, `preco`) VALUES
(32, 'mahotas', 'Casa', 12, 12, '12x12', 0, 'dasdadadas', 1222);

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbusuario`
--

CREATE TABLE `tbusuario` (
  `idusuario` int(11) NOT NULL,
  `nome` varchar(50) DEFAULT NULL,
  `nomeUsuario` varchar(15) DEFAULT NULL,
  `senha` varchar(8) DEFAULT NULL,
  `telefone` int(9) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `tbusuario`
--

INSERT INTO `tbusuario` (`idusuario`, `nome`, `nomeUsuario`, `senha`, `telefone`) VALUES
(4, 'Ezequiel Manjate', 'Ezequiel', 'manjate', 826454212);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbanuncio`
--
ALTER TABLE `tbanuncio`
  ADD PRIMARY KEY (`idanuncio`),
  ADD KEY `id_imovel` (`id_imovel`),
  ADD KEY `id_usuario` (`id_usuario`);

--
-- Indexes for table `tbimovel`
--
ALTER TABLE `tbimovel`
  ADD PRIMARY KEY (`idimovel`);

--
-- Indexes for table `tbusuario`
--
ALTER TABLE `tbusuario`
  ADD PRIMARY KEY (`idusuario`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbanuncio`
--
ALTER TABLE `tbanuncio`
  MODIFY `idanuncio` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `tbimovel`
--
ALTER TABLE `tbimovel`
  MODIFY `idimovel` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=33;

--
-- AUTO_INCREMENT for table `tbusuario`
--
ALTER TABLE `tbusuario`
  MODIFY `idusuario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- Constraints for dumped tables
--

--
-- Limitadores para a tabela `tbanuncio`
--
ALTER TABLE `tbanuncio`
  ADD CONSTRAINT `tbanuncio_ibfk_1` FOREIGN KEY (`id_imovel`) REFERENCES `tbimovel` (`idimovel`),
  ADD CONSTRAINT `tbanuncio_ibfk_2` FOREIGN KEY (`id_usuario`) REFERENCES `tbusuario` (`idusuario`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
