package PrinciplesofObjectoriented;

public class Motherboard {
	
	String brand;
	int register;
	String coolingfan;
	String processor;
	int diode;
	double price;
	
	Motherboard()
	{
		
	}
	public Motherboard(String brand, int register, String coolingfan, String processor, int diode, double price) {
		super();
		this.brand = brand;
		this.register = register;
		this.coolingfan = coolingfan;
		this.processor = processor;
		this.diode = diode;
		this.price = price;
	}
	public void displayMotherboard()
	{
		System.out.println("Brand : "+brand);
		System.out.println("Registers : "+register);
		System.out.println("Cooling Fans"+coolingfan);
		System.out.println("Diode : "+diode);
		System.out.println("Processor : "+ processor);
		System.out.println("Price : "+price);
	}
	

	

}
