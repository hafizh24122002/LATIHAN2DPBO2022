<?php

include "Memory.php";

$object = new Memory(997, 2, true, "NVIDIA", "MX110", 200, "A350");

$object->printProduct();
$object->printHardware();
$object->printMemory();

?>