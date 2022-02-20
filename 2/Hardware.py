from Product import Product

class Hardware(Product):
	__brand: str
	__model: str

	# construct with optional args
	def __init__(self, brand: str, model: str, price=None, idProduct=None):
		super().__init__(price, idProduct)

		self.__brand = brand
		self.__model = model
	
	def setBrand(self, brand):
		self.__brand = brand

	def getBrand(self):
		return self.__brand

	def setModel(self, model):
		self.__model = model

	def getModel(self):
		return self.__model

	def printHardware(self):
		print("Brand : ", self.__brand)
		print("Model : ", self.__model)