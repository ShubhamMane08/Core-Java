package PrinciplesofObjectoriented;

public class Earbuds {
	String brand;
	int frequency;
	String type;
	double price;
	
	
	 Earbuds()
	{
		 
	}
	public Earbuds(String brand, int frequency, String type,double price)
	{
		this.brand=brand;
		this.frequency=frequency;
		this.type=type;
		this.price=price;
	}
	public void displayEarbuds()
	{
		System.out.println("Brand :"+brand);
		System.out.println("Frequency :"+frequency);
		System.out.println("Type :"+type);
		System.out.println("Price 	:"+price);
		
	}
	

}
