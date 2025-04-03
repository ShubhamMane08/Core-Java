class Shoes
{
	String brand="Nike";
	String name;
	double price;
	String type;

	{

		System.out.println("Non-static Block Started");
		this.details();
		if(brand.charAt(0)=='N')
		{
			price=1000.0;
		}
		else 
		{
			price=500.0;
		}
		System.out.println("Non-static Block ends");

	}

	Shoes()
	{
		System.out.println("From no args Constructor");

	}
	Shoes(String name, double price, String type)
	{
		System.out.println("Constructor Block Starts");
		
		this.name=name;
		this.price=price;
		this.type=type;
		System.out.println("Constructor Block Ends");

	}
	public void details()
		{
			System.out.println("Methods Started ");
			System.out.println("Brand : "+brand);
			System.out.println("Name : "+name);
			System.out.println("Type : "+type);
			System.out.println("Price "+price);
		}
}
