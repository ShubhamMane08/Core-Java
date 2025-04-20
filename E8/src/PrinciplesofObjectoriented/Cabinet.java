package PrinciplesofObjectoriented;

public class Cabinet {
	
	String startbutton;
	int ports;
	Motherboard mb;
	HardDisk hdd;
	Monitor mm;
//	Keyboard kb;
	
	
	Cabinet()
	{
		
	}


	public Cabinet(String startbutton, int ports,String brand, int register, String coolingfan, String processor, int diode, double price, String capacity, int speed  ,String brand1,double resolution,int size,double price1) {
		mb= new Motherboard(register, coolingfan, processor, diode, price);
		hdd=new HardDisk(brand, capacity, speed);
		mm=new Monitor(brand1,resolution,size,price1);
//		kb=new Keyboard()
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
