package PrinciplesofObjectoriented;

public class Bottle {
	
	String brand;
	double price;
	int ml;
	
	Bottle()
	{
		
	}
	Bottle(String brand,double price,int ml)
	{
		this.brand=brand;
		this.price=price;
		this.ml=ml;
	}
	
	void dispaly()
	{
		System.out.println("Brand is : "+brand);
		System.out.println("Price is : "+price);
		System.out.println("Capacity is : "+ml);
	}

}
