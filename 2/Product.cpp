#include <iostream>
#include <string>

using namespace std;

class Product
{
	private:
		int price;
		string idProduct;

	public:
		// construct
		Product(int price, string idProduct)
		{
			this->price = price;
			this->idProduct = idProduct;
		}

		// default construct
		Product(){}

		void setPrice(int price)
		{
			this->price = price;
		}

		int getPrice()
		{
			return this->price;
		}

		void setIdProduct(string idProduct)
		{
			this->idProduct = idProduct;
		}

		string getIdProduct()
		{
			return this->idProduct;
		}

		// deconstruct
		~Product(){}

		void printProduct()
		{
			cout << "Harga : " << this->price << endl;
			cout << "ID Produk : " << this->idProduct << endl;
		}
};