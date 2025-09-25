package PrinciplesofObjectoriented;

public class HardDisk {
	
	String brand;
	String capacity;
	int speed;
	
	
	HardDisk()
	{
		
	}
	public HardDisk(String brand, String capacity, int speed) {
		super();
		this.brand = brand;
		this.capacity = capacity;
		this.speed = speed;
	}
	
	public void displayHardDisk()
	{
		System.out.println("Details of HardDisk");
		System.out.println("Brand : "+brand);
		System.out.println("Capacity : "+capacity+"GB");
		System.out.println("Read Write Speed : "+speed);
		System.out.println();
	}
	

}
