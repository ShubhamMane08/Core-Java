package PrinciplesofObjectoriented;

public class Cabinet {
	
	String startbutton;
	int ports;
	Motherboard mb;
	HardDisk hdd;
	Monitor mm;
	
	
	Cabinet()
	{
		
	}


	public Cabinet(String startbutton, int ports,String brand, int register, String coolingfan, String processor, int diode, double price, String capacity, int speed  ) {
		mb= new Motherboard(register, coolingfan, processor, diode, price);
		hdd=new HardDisk(brand, capacity, speed);
		this.startbutton = startbutton;
		this.ports = ports;
		
	}
	public void DisplayCPU()
	{
		System.out.println("-------------------Specifications-------------------");
		mb.displayMotherboard();
		hdd.displayHardDisk();
		
		System.out.println("Details Cabinet ");
		System.out.println("Power Button :"+startbutton);
		System.out.println("Number of Ports Present in Cabinet : "+ports);
	}
	
	

}
