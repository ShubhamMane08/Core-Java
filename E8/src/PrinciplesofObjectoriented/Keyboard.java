package PrinciplesofObjectoriented;

public class Keyboard {
	
	String brand;
	String type;
	double price;
	

	
	Keyboard()
	{
		
	}
	public Keyboard(String brand, String type,double price)
	{
		this.brand=brand;
		this.type=type;
		this.price=price;
	}
	public void displayKeyboard()
	{
		System.out.println("Brand : "+brand);
		System.out.println("Type of Keyboard : "+type);
		System.out.println("Price of Keyboard : "+price);
	}
}
