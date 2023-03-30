<?php
    require_once ('Car.php');
    require_once ('Account.php');

    echo "<h1>"."Programacion Orientada a Objetos"."</h1>";
    
    $car = new Car("MDQ458", new Account("Daniel", "34424930"));
    $car ->PrintDataCar();

?>