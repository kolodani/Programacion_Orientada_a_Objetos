<?php
require_once 'Account.php';
    class Car {
        public $id;
        public $license;
        public $driver;
        public $passengers;
        
        public function __construct($license, Account $driver)
        {
            $this ->license = $license;
            $this ->driver = $driver;
        }
        
        public function PrintDataCar(){
            echo "la licencia es: ".$this-> license. 
            "el conductor es: " .$this->driver->name. 
            "y su documento es:" .$this->driver->document;
        }
    }
?>