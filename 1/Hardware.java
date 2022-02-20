class Hardware extends Product
{
	private String brand;
	private String model;

	// since java doesn't support optional parameter, overloading the 
	// constructor was done instead

	// construct also with current class parent's constructor
	public Hardware(String brand, String model, int price, String idProduct)
	{
		super(price, idProduct);
		this.setBrand(brand);
		this.setModel(model);
	}

	// construct for this class only
	public Hardware(String brand, String model)
	{
		this.setBrand(brand);
		this.setModel(model);
	}

	// default construct
	public Hardware(){}

	public String getBrand()
	{
		return brand;
	}

	public void setBrand(String brand)
	{
		this.brand = brand;
	}

	public String getModel()
	{
		return model;
	}

	public void setModel(String model)
	{
		this.model = model;
	}

	public void printHardware()
	{
		System.out.println("Brand : " + this.brand);
		System.out.println("Model : " + this.model);
	}
}