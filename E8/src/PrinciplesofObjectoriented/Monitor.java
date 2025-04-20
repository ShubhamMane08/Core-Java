package PrinciplesofObjectoriented;

public class Monitor {
	String brand;
	double resolution;
	int size;
	double price;
	
	
	
	Monitor()
	{
		
	}
	public Monitor(String brand, double resolution, int size,double price)
	{
		this.brand=brand;
		this.resolution=resolution;
		this.size=size;
		this.price=price;
	}

	public void displayMonitor()
	{
		System.out.println("Brand of Monitor : "+brand);
		System.out.println("Pixel Resolution : "+resolution);
		System.out.println("Size of the Screen : "+size);
		System.out.println("Price of Monitor :"+price);
	}
}
