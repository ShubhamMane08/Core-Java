package PrinciplesofObjectoriented;
public class Pen {
	private String brand;
	private String type;
	double price;
	Refill ref;
	
	Pen(String brand, String type,double price,String color,float size)
	{
		ref=new Refill(color,size);
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