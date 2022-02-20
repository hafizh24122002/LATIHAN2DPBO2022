class Product
{
	private int price;
	private String idProduct;
	
	public Product(int price, String idProduct)
	{
		this.setPrice(price);
		this.setIdProduct(idProduct);
	}

	public Product(){}

	public String getIdProduct()
	{
		return idProduct;
	}

	public void setIdProduct(String idProduct)
	{
		this.idProduct = idProduct;
	}

	public int getPrice()
	{
		return price;
	}

	public void setPrice(int price)
	{
		this.price = price;
	}

	public void printProduct()
	{
		System.out.println("Harga : " + this.price);
		System.out.println("ID Produk : " + this.idProduct);
	}
}