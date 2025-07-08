package Arrays;

public class Shoe {
	
	static String brand="Nike";
	String color;
	double price;
	int size;
	
	
	Shoe()
	{
		
	}
	
	Shoe(String color,double price, int size)
	{
		
		this.color=color;
		this.price=price;
		this.size=size;
	}
	
	public String toString()
	{
		return "\n Brand : "+brand+"\n Color : "+color+"\n Price : "+price+"\n Size : "+size;
	
	}

}
