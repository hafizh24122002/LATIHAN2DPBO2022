public class Main
{
	public static void main(String[] args)
	{
		Memory memory_obj = new Memory(997, 2, true, "NVIDIA", "MX110", 200, "A350");

		memory_obj.printProduct();
		memory_obj.printHardware();
		memory_obj.printMemory();
	}
}