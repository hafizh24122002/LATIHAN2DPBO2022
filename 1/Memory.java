class Memory extends Hardware
{
	private int frequency;
	private int memorySize;
	private boolean supportsCuda;

	// since java doesn't support optional parameter, overloading the 
	// constructor was done instead

	// construct also with constructors from every level above this class
	public Memory(int frequency, int memorySize, boolean supportsCuda, String brand, String model, int price, String idProduct)
	{
		super(brand, model, price, idProduct);
		this.setFrequency(frequency);
		this.setMemorySize(memorySize);
		this.setSupportsCuda(supportsCuda);
	}

	// construct also with current class parent's constructor
	public Memory(int frequency, int memorySize, boolean supportsCuda, String brand, String model)
	{
		super(brand, model);
		this.setFrequency(frequency);
		this.setMemorySize(memorySize);
		this.setSupportsCuda(supportsCuda);
	}

	// construct for this class only
	public Memory(int frequency, int memorySize, boolean supportsCuda)
	{
		this.setFrequency(frequency);
		this.setMemorySize(memorySize);
		this.setSupportsCuda(supportsCuda);
	}

	// default construct
	public Memory(){}

	public int getFrequency()
	{
		return frequency;
	}

	public void setFrequency(int frequency)
	{
		this.frequency = frequency;
	}

	public int getMemorySize()
	{
		return memorySize;
	}

	public void setMemorySize(int memorySize)
	{
		this.memorySize = memorySize;
	}

	public boolean isSupportsCuda()
	{
		return supportsCuda;
	}

	public void setSupportsCuda(boolean supportsCuda)
	{
		this.supportsCuda = supportsCuda;
	}

	public void printMemory()
	{
		System.out.println("Frekuensi : " + this.frequency);
		System.out.println("Besar Memori : " + this.memorySize);
		System.out.println("Dukungan CUDA : " + this.supportsCuda);
	}
}