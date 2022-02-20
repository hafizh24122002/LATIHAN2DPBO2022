<?php declare(strict_types=1);

class Product
{
	private int $price;
	private string $idProduct;

	// construct
	public function __construct(int $price, string $idProduct)
	{
		$this->price = $price;
		$this->idProduct = $idProduct;
	}

	public function setPrice(int $price)
	{
		$this->price = $price;
	}

	public function getPrice()
	{
		return $this->$price;
	}

	public function setIdProduct(string $idProduct)
	{
		$this->idProduct = $idProduct;
	}

	public function getIdProduct()
	{
		return $this->idProduct;
	}

	public function printProduct()
	{
		echo "Harga : " . $this->price . "<br>";
		echo "ID Produk : " . $this->idProduct . "<br>";
	}
}

?>