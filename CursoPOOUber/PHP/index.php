<?php
require_once "Car.php";
require_once "UberX.php";
require_once "UberPool.php";
require_once "Account.php";

$uberx = new UberX("ZXC987", new Account("Andres Herrera", "9.336.852"), "Chevrolet", "Spark");
$uberx ->PrintDataCar(); 

$uberPool = new UberPool("HGF268", new Account("Ana Ferran", "39.694.669"), "Dodge", "Attitude");
$uberPool ->PrintDataCar();

?>