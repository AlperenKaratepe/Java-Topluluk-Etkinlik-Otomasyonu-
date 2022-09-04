-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Anamakine: 127.0.0.1
-- Üretim Zamanı: 13 May 2019, 09:14:16
-- Sunucu sürümü: 10.1.36-MariaDB
-- PHP Sürümü: 7.2.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Veritabanı: `topluluk`
--

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `etkinlikler`
--

CREATE TABLE `etkinlikler` (
  `id` int(11) NOT NULL,
  `etkinlik_adi` varchar(100) COLLATE utf8_turkish_ci NOT NULL,
  `duzenleyen` varchar(50) COLLATE utf8_turkish_ci NOT NULL,
  `et_tarihi` varchar(50) COLLATE utf8_turkish_ci NOT NULL,
  `top_ad` varchar(50) COLLATE utf8_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `etkinlikler`
--

INSERT INTO `etkinlikler` (`id`, `etkinlik_adi`, `duzenleyen`, `et_tarihi`, `top_ad`) VALUES
(11, 'pop konseri', 'alperen karatepe', '01.05.2019', 'muzik'),
(12, 'türkülerden ezgiler', 'ali kara', '02.05.2019', 'muzik'),
(13, '90\'lar', 'ahmet karatepe', '03.05.2019', 'muzik'),
(16, 'ebru sanatlari', 'ayse kara', '01.05.2019', 'resim'),
(17, 'resim gunleri', 'fatma', '02.05.2019', 'resim'),
(18, 'dans gunleri', 'irem karatepe', '01.05.2019', 'dans'),
(19, 'doga yuruyusu', 'alperen kara', '01.05.2019', 'doga'),
(20, 'dogada kamp', 'ahmet karatepe', '01.05.2019', 'doga'),
(21, 'ormada bisiklet gezisi', 'alp kara', '01.05.2019', 'bisiklet'),
(22, 'bisiklet yarislari', 'eren karatepe', '03.05.2019', 'bisiklet'),
(23, 'kodlama', 'alperen', '04.05.2019', 'bilgisayar'),
(24, 'sanat müzi?i', 'veli', '05.05.2019', 'muzik'),
(25, 'konser', 'ayse', '04.05.2019', 'muzik');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `uye_kaydi`
--

CREATE TABLE `uye_kaydi` (
  `id` int(11) NOT NULL,
  `ad` varchar(50) COLLATE utf8_turkish_ci NOT NULL,
  `soyad` varchar(50) COLLATE utf8_turkish_ci NOT NULL,
  `telefon` varchar(50) COLLATE utf8_turkish_ci NOT NULL,
  `topluluk_adi` varchar(50) COLLATE utf8_turkish_ci NOT NULL,
  `kayit_tarihi` varchar(50) COLLATE utf8_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `uye_kaydi`
--

INSERT INTO `uye_kaydi` (`id`, `ad`, `soyad`, `telefon`, `topluluk_adi`, `kayit_tarihi`) VALUES
(1, 'ahmet', 'mehmet', '545465', 'bsdhjs', 'fgjhgh'),
(2, 'ahmet', 'mehmet', '545465', 'bsdhjs', 'fgjhgh'),
(3, 'alperen', 'karatepe', '05555555', 'müzik', '01.01.2019'),
(4, 'ahmet', 'zvzvv', 'vzbz', 'zcbzc', 'zcbzcb'),
(5, 'alperen', 'karatepe', '55555', 'muzik', '01.01.2019'),
(6, 'ahmet', 'kara', '05555', 'dans', '02.05.2019'),
(7, 'ayse', 'kara', '05545', 'doga', '07.05.2019'),
(8, 'mehmet', 'günes', '05535', 'bilgisayar', '03.05.2019'),
(9, 'fatma', 'ya?mur', '05789', 'bisiklet', '08.06.2019'),
(10, 'irem', 'karatepe', '05632', 'resim', '09.05.2019'),
(11, 'ibrahim', 'karatepe', '050555', 'muzik', '01.05.2019');

--
-- Dökümü yapılmış tablolar için indeksler
--

--
-- Tablo için indeksler `etkinlikler`
--
ALTER TABLE `etkinlikler`
  ADD PRIMARY KEY (`id`);

--
-- Tablo için indeksler `uye_kaydi`
--
ALTER TABLE `uye_kaydi`
  ADD PRIMARY KEY (`id`);

--
-- Dökümü yapılmış tablolar için AUTO_INCREMENT değeri
--

--
-- Tablo için AUTO_INCREMENT değeri `etkinlikler`
--
ALTER TABLE `etkinlikler`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=26;

--
-- Tablo için AUTO_INCREMENT değeri `uye_kaydi`
--
ALTER TABLE `uye_kaydi`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
