package PrinciplesofObjectoriented;

public class Bag {
	String brand;
	int section ;
	String bottle;
	String type;
	double price;
	books b;
	
	
	public Bag()
	{
		
	}
	Bag(String brand, int section, String bottle, String type,double price)
	{
		this.brand=brand;
		this.section=section;
		this.bottle=bottle;
		this.type=type;
		this.price=price;
	}
	
	public void displayDetails()
	{
		System.out.println("Brand : "+brand);
		System.out.println("Section : "+section);
		System.out.println("Bottle : "+bottle);
		System.out.println("Type : "+type);
		System.out.println("Price : "+price);
	}
	public void insertBook(String brand,String type,int size,double price)
	{
		b=new books(brand, type,size, price);
		
		System.out.println("Brand : "+brand);
		System.out.println("Type of Book : "+type);
		System.out.println("Size of Book : "+size);
		System.out.println("Price of Book : "+price);
		System.out.println("Books is Carried in Bag");
	}

}
