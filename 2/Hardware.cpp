#include "Product.cpp"

class Hardware:public Product
{
	private:
		string brand;
		string model;

	public:
		// construct with optional args
		Hardware(string brand, string model, int _price=0, string _idProduct="NULL")
		: Product(_price, _idProduct)
		{
			this->brand = brand;
			this->model = model;
		}

		// default construct
		Hardware(){}

		void setBrand(string brand)
		{
			this->brand = brand;
		}

		string getBrand()
		{
			return this->brand;
		}

		void setModel(string model)
		{
			this->model = model;
		}

		string getModel()
		{
			return this->model;
		}

		// deconstruct
		~Hardware(){}

		void printHardware()
		{
			cout << "Brand : " << this->brand << endl;
			cout << "Model : " << this->model << endl;
		}
};