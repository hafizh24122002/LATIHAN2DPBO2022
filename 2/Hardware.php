<?php declare(strict_types=1);

include "Product.php";

class Hardware extends Product
{
	private string $brand;
	private string $model;

	// construct with optional args
	public function __construct(string $brand, string $model, int $price=0, string $idProduct="NULL")
	{
		parent::__construct($price, $idProduct);
		$this->brand = $brand;
		$this->model = $model;
	}

	public function setBrand(string $brand)
	{
		$this->brand = $brand;
	}

	public function getBrand()
	{
		return $this->brand;
	}

	public function setModel(string $model)
	{
		$this->model = $model;
	}

	public function getModel()
	{
		$this->model = $model;
	}

	public function printHardware()
	{
		echo "Brand : " . $this->brand . "<br>";
		echo "Model : " . $this->model . "<br>";
	}
}

?>