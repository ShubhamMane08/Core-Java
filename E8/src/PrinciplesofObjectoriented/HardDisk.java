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
		capacity = capacity;
		this.speed = speed;
	}
	
	public void displayHardDisk()
	{
		System.out.println("Brand : "+brand);
		System.out.println("Capacity : "+capacity+"GB");
		System.out.println("Read Write Speed : "+speed);
	}
	

}
