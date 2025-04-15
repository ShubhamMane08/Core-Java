package PrinciplesofObjectoriented;

public class Bike {
	
	private String brand="Royal Enfield";
	private String model="GT360";
	private double price;
	private int cc;
	private int milage;
	
	
	Bike(String brand,String model,int cc,int milage,double price)
	{
		this.brand=brand;
		this.model=model;
		this.cc=cc;
		this.milage=milage;
		this.price=price;
	}
	public String getBrand()
	{
		return brand;
	}
	public String getModel()
	{
		return model;
	}
	public int getCC()
	{
		return cc;
		
	}
	public int getMilage()
	{
		return milage;
	}
	
	public double getPrice()
	{
		return price;
	}
	public void setPrice(double price)
	{
		if(price>=50000.0)
		{
			this.price=price;
			System.out.println("Updated Price is : "+price);
			
		}
		else
		{
			System.out.println("Minimum Amount must be Rs 50,0000");
		}
		
	}

}
