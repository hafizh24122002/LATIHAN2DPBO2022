from Hardware import Hardware

class Memory(Hardware):
	__frequency: int
	__memorySize: int
	__supportsCuda: bool

	# costruct with optional args
	def __init__(self, frequency: int, memorySize: int, supportsCuda: bool, brand=None, model=None, price=None, idProduct=None):
		super().__init__(brand, model, price, idProduct)
		self.__frequency = frequency
		self.__memorySize = memorySize
		self.__supportsCuda = supportsCuda

	def setFrequency(self, frequency: int):
		self.__frequency = frequency

	def getFrequency(self):
		return self.__frequency

	def setMemorySize(self, memorySize: int):
		self.__memorySize = memorySize

	def getMemorySize(self):
		return self.__memorySize

	def setSupportsCuda(self, supportsCuda: bool):
		self.__supportsCuda = supportsCuda

	def getSupportsCuda(self):
		return self.__supportsCuda

	def printMemory(self):
		print("Frekuensi : ", self.__frequency)
		print("Besar Memori : ", self.__memorySize)
		print("Dukungan CUDA : ", self.__supportsCuda)