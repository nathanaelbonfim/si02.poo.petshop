-- phpMyAdmin SQL Dump
-- version 4.9.5deb2
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Tempo de geração: 18/11/2021 às 03:07
-- Versão do servidor: 10.3.31-MariaDB-0ubuntu0.20.04.1
-- Versão do PHP: 7.4.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `petshopdb`
--

-- --------------------------------------------------------

--
-- Estrutura para tabela `CIDADE`
--

CREATE TABLE `CIDADE` (
  `ID` int(11) NOT NULL,
  `NOME` varchar(255) NOT NULL,
  `CEP` varchar(10) NOT NULL,
  `DATA_CADASTRO` date NOT NULL,
  `ESTADO_ID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Despejando dados para a tabela `CIDADE`
--

INSERT INTO `CIDADE` (`ID`, `NOME`, `CEP`, `DATA_CADASTRO`, `ESTADO_ID`) VALUES
(1, 'Umuarama', '87014000', '2021-11-17', 1),
(2, 'São Paulo', '11530000', '2021-11-17', 2),
(3, 'Brasiília', '55641715', '2021-11-17', 3),
(4, 'Florianópolis', '88200000', '2021-11-17', 4),
(5, 'Rio de Janeiro', '20000000', '2021-11-17', 5),
(6, 'Cuiabá', '58850000', '2021-11-17', 6),
(7, 'Campo Grande', '58860000', '2021-11-17', 7),
(8, 'Belo Horizonte', '39853000', '2021-11-17', 8),
(9, 'Natal', '59133383', '2021-11-17', 9),
(10, 'Porto Alegre', '96050500', '2021-11-17', 10);

-- --------------------------------------------------------

--
-- Estrutura para tabela `COMPRA`
--

CREATE TABLE `COMPRA` (
  `ID` int(11) NOT NULL,
  `VALOR` int(11) NOT NULL,
  `DESC_UNI` float DEFAULT NULL,
  `DESC_TOTAL` float DEFAULT NULL,
  `VALOR_BRUTO` float DEFAULT NULL,
  `VALOR_LIQ` float NOT NULL,
  `ID_PRODUTO` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura para tabela `ESTADO`
--

CREATE TABLE `ESTADO` (
  `ID` int(11) NOT NULL,
  `NOME` varchar(255) NOT NULL,
  `UF` char(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Despejando dados para a tabela `ESTADO`
--

INSERT INTO `ESTADO` (`ID`, `NOME`, `UF`) VALUES
(1, 'Paraná', 'PR'),
(2, 'São Paulo', 'SP'),
(3, 'Distrito Federal', 'DF'),
(4, 'Santa Catarina', 'SC'),
(5, 'Rio de Janeiro', 'RJ'),
(6, 'Mato Grosso', 'MT'),
(7, 'Mato Grosso do Sul', 'MS'),
(8, 'Minas Geraís', 'MG'),
(9, 'Rio Grande do Norte', 'RN'),
(10, 'Rio Grande do Sul', 'RS');

-- --------------------------------------------------------

--
-- Estrutura para tabela `FORNECEDOR`
--

CREATE TABLE `FORNECEDOR` (
  `ID` int(11) NOT NULL,
  `NOME` varchar(255) NOT NULL,
  `ID_ESTADO` int(11) NOT NULL,
  `ID_CIDADE` int(11) NOT NULL,
  `DATA_CADASTRO` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Despejando dados para a tabela `FORNECEDOR`
--

INSERT INTO `FORNECEDOR` (`ID`, `NOME`, `ID_ESTADO`, `ID_CIDADE`, `DATA_CADASTRO`) VALUES
(1, 'Nathanael', 1, 1, '2021-07-20'),
(2, 'Gabriel ', 1, 1, '2006-07-21'),
(3, 'Vitor', 1, 1, '2005-09-10'),
(4, 'Yohann', 1, 1, '2004-11-11'),
(5, 'Lucas', 1, 1, '1998-12-09'),
(6, 'Maria ', 4, 4, '1987-09-15'),
(7, 'Ana ', 7, 7, '2000-10-30'),
(8, 'Stefani', 5, 5, '1999-09-14'),
(9, 'João', 1, 1, '2002-12-03'),
(10, 'André', 2, 2, '2021-12-25');

-- --------------------------------------------------------

--
-- Estrutura para tabela `PRODUTO`
--

CREATE TABLE `PRODUTO` (
  `COD_BARRA` varchar(50) NOT NULL,
  `NOME` varchar(255) NOT NULL,
  `QUANT_ESTOQUE` int(11) NOT NULL,
  `VALOR` float NOT NULL,
  `ID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Despejando dados para a tabela `PRODUTO`
--

INSERT INTO `PRODUTO` (`COD_BARRA`, `NOME`, `QUANT_ESTOQUE`, `VALOR`, `ID`) VALUES
('000000000', 'Shampoo', 20, 14.99, 1),
('000000001', 'Ração', 10, 15, 2),
('000000002', 'Coleira', 15, 5.89, 3),
('000000003', 'Casinha de cachorro', 3, 39.9, 4),
('000000004', 'Cama de gato', 7, 29.9, 5),
('000000005', 'Bolinha', 12, 6, 6);

--
-- Índices de tabelas apagadas
--

--
-- Índices de tabela `CIDADE`
--
ALTER TABLE `CIDADE`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `ESTADO_ID` (`ESTADO_ID`);

--
-- Índices de tabela `COMPRA`
--
ALTER TABLE `COMPRA`
  ADD PRIMARY KEY (`ID`);

--
-- Índices de tabela `ESTADO`
--
ALTER TABLE `ESTADO`
  ADD PRIMARY KEY (`ID`);

--
-- Índices de tabela `FORNECEDOR`
--
ALTER TABLE `FORNECEDOR`
  ADD PRIMARY KEY (`ID`);

--
-- Índices de tabela `PRODUTO`
--
ALTER TABLE `PRODUTO`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT de tabelas apagadas
--

--
-- AUTO_INCREMENT de tabela `CIDADE`
--
ALTER TABLE `CIDADE`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de tabela `ESTADO`
--
ALTER TABLE `ESTADO`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de tabela `FORNECEDOR`
--
ALTER TABLE `FORNECEDOR`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- Restrições para dumps de tabelas
--

--
-- Restrições para tabelas `CIDADE`
--
ALTER TABLE `CIDADE`
  ADD CONSTRAINT `CIDADE_ibfk_1` FOREIGN KEY (`ESTADO_ID`) REFERENCES `ESTADO` (`ID`);

--
-- Restrições para tabelas `COMPRA`
--
ALTER TABLE `COMPRA`
  ADD CONSTRAINT `COMPRA_ibfk_1` FOREIGN KEY (`ID`) REFERENCES `PRODUTO` (`ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
