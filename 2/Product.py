class Product():
	__price: int
	__idProduct: str

	
	def __init__(self, price: int, idProduct: str):
		self.__price = price
		self.__idProduct = idProduct

	def setPrice(self, price):
		self.__price = price

	def getPrice(self):
		return self.__price

	def setIdProduct(self, idProduct):
		self.__idProduct = idProduct

	def getIdProduct(self):
		return self.__idProduct

	def printProduct(self):
		print("Harga : ", self.__price)
		print("ID Produk : ", self.__idProduct)