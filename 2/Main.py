from Memory import Memory

def main():
	object = Memory(997, 2, True, "NVIDIA", "MX110", 200, "A350")

	object.printProduct()
	object.printHardware()
	object.printMemory()

if __name__ == "__main__":
	main()