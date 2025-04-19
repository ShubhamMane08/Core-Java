package PrinciplesofObjectoriented;

public class Motherboard {
	

	int register;
	String coolingfan;
	String processor;
	int diode;
	double price;
	
	Motherboard()
	{
		
	}
	public Motherboard( int register, String coolingfan, String processor, int diode, double price) {
		
		this.register = register;
		this.coolingfan = coolingfan;
		this.processor = processor;
		this.diode = diode;
		this.price = price;
	}
	public void displayMotherboard()
	{
		System.out.println("Registers : "+register);
		System.out.println("Cooling Fans"+coolingfan);
		System.out.println("Diode : "+diode);
		System.out.println("Processor : "+ processor);
		System.out.println("Price : "+price);
	}
	

	

}
