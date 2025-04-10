package PrinciplesofObjectoriented;

public class Pen {
	private String brand;
	private String type;
	double price;
	Refill ref = new Refill("Red",5);
	
	Pen(String brand, String type,double price)
	{
		this.brand=brand;
		this.type=type;
		this.price=price;
		
	}
	
	public String getBrand()
	{
		return brand;
		
	}
	public String getType()
	{
		return type;
	}
	public double getPrice()
	{
		return price;
	}
}
