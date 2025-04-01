class Shoes
{
	String brand="Nike";
	String name;
	double price;
	String type;

	{
		if(brand.charAt(0)=='N')
		{
			price=1000.0;
		}
		else 
		{
			price=500.0;
		}
	}
	public void details()
		{
			System.out.println("Brand : "+brand);
			System.out.println("Name : "+name);
			System.out.println("Type : "+type);
			System.out.println("Price "+price);
		}
}
