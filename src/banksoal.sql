SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
CREATE TABLE IF NOT EXISTS `soalbank` (
  `matakuliah` varchar(255) NOT NULL,
  `pokokbahasan` varchar(255) DEFAULT NULL,
  `soal` varchar(500) DEFAULT NULL,
  `jawabanA` varchar(255) DEFAULT NULL,
  `jawabanB` varchar(255) DEFAULT NULL,
  `jawabanC` varchar(255) DEFAULT NULL,
  `jawabanD` varchar(255) DEFAULT NULL,
  `jawabanBenar` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`matakuliah`)
) 
ENGINE=MyISAM DEFAULT CHARSET=latin1;

INSERT INTO `soalbank` (`matakuliah`, `pokokbahasan`, `soal`, `jawabanA`, `jawabanB`, `jawabanC`, `jawabanD`, `jawabanBenar`) VALUES
('PBD', 'SQL', 'Apa itu basis data?', 'Data yang berbasis*', 'Data yang tidak berbasis#', 'Data yang sinkron#', 'Data yang tidak sinkron#', 'A');

INSERT INTO `soalbank` (`matakuliah`, `pokokbahasan`, `soal`, `jawabanA`, `jawabanB`, `jawabanC`, `jawabanD`, `jawabanBenar`) VALUES
('PBO', 'JDBC', 'Apa kegunaan JDBC?', 'Connect Internet#', 'Connect database*', 'Sambung database*', 'Connect netbeans', 'BC');

INSERT INTO `soalbank` (`matakuliah`, `pokokbahasan`, `soal`, `jawabanA`, `jawabanB`, `jawabanC`, `jawabanD`, `jawabanBenar`) VALUES
('DMJK', 'IP', 'Berapa IP umum yang biasa di gunakan?', '255#', '10#', '192*', '126*', 'CD');