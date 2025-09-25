package PrinciplesofObjectoriented;

public class books {
	String brand;
	String type;
	int size;
	double price;
	
	
	public books()
	{
		
	}
	books(String brand, String type,int size,double price)
	{
		this.brand=brand;
		this.type=type;
		this.size=size;
		this.price=price;
	}
	
	public void displayBook()
	{
		System.out.println("Brand of Book : "+brand);
		System.out.println("Type of Book : "+type);
		System.out.println("Size of Book : "+size);
		System.out.println("Price of Book : "+price);
	}
	
	

}
