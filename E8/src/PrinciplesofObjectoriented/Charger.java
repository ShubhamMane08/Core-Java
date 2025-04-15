package PrinciplesofObjectoriented;

public class Charger {

	
	String brand;
	int voltage;
	double price;
	String type;
	
	
	public Charger()
	{
		
	}
	
	Charger(String brand,String type,double price,int voltage)
	{
		this.brand=brand;
		this.type=type;
		this.price=price;
		this.voltage=voltage;
	}
	
	public void displayCharger()
	{
		System.out.println("Brand : "+brand);
		System.out.println("Charger Type : "+type);
		System.out.println("Charger Price : "+price);
		System.out.println("Charger Voltage : "+voltage);
		
	}
}
