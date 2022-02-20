#include "Hardware.cpp"

class Memory:public Hardware
{
	private:
		int frequency;
		int memorySize;
		bool supportsCuda;

	public:
		// construct with optional args
		Memory(int frequency, int memorySize, bool supportsCuda, string _brand="NULL", string _model="NULL", int _price=0, string _idProduct="NULL")
		: Hardware(_brand, _model, _price, _idProduct)
		{
			this->frequency = frequency;
			this->memorySize = memorySize;
			this->supportsCuda = supportsCuda;
		}

		// default construct
		Memory(){}

		void setFrequency(int frequency)
		{
			this->frequency = frequency;
		}

		int getFrequency()
		{
			return this->frequency;
		}

		void setMemorySize(int memorySize)
		{
			this->memorySize = memorySize;
		}

		int getMemorySize()
		{
			return this->memorySize;
		}

		void setSupportsCuda(bool supportsCuda)
		{
			this->supportsCuda = supportsCuda;
		}

		bool getSupportsCuda()
		{
			return this->supportsCuda;
		}

		// deconstruct
		~Memory(){}

		void printMemory()
		{
			cout << "Frekuensi : " << this->frequency << endl;
			cout << "Besar Memori : " << this->memorySize << endl;
			cout << "Dukungan CUDA : " << this->supportsCuda << endl;
		}
};