<?php declare(strict_types=1);

include "Hardware.php";

class Memory extends Hardware
{
	private int $frequency;
	private int $memorySize;
	private bool $supportsCuda;

	// construct with optional args
	public function __construct(int $frequency, int $memorySize, bool $supportsCuda, string $brand="NULL", string $model="NULL", int $price=0, string $idProduct="NULL")
	{
		parent::__construct($brand, $model, $price, $idProduct);
		$this->frequency = $frequency;
		$this->memorySize = $memorySize;
		$this->supportsCuda = $supportsCuda;
	}

	public function setFrequency(int $frequency)
	{
		$this->frequency = $frequency;
	}
	public function getFrequency()
	{
		return $this->frequency;
	}

	public function setMemorySize(int $memorySize)
	{
		$this->memorySize = $memorySize;
	}
	public function getMemorySize()
	{
		return $this->memorySize;
	}

	public function setSupportsCuda(bool $supportsCuda)
	{
		$this->supportsCuda = $supportsCuda;
	}

	public function getSupportsCuda()
	{
		return $this->supportsCuda;
	}

	public function printMemory()
	{
		echo "Frekuensi : " . $this->frequency . "<br>";
		echo "Besar Memori : " . $this->memorySize . "<br>";
		echo "Dukungan CUDA : " . $this->supportsCuda . "<br>";
	}
}

?>