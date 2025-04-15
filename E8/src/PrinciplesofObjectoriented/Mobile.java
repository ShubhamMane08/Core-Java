package PrinciplesofObjectoriented;
public class Mobile {
	String brand;
	String name;
	String type;
	double price;
	Sim s;
	Charger c;
	Earbuds eb;
	
		
	public Mobile()
	{
		
	}
	Mobile(String brand, String name, String type , double price)
	{
		this.brand=brand;
		this.name=name;
		this.type=type;
		this.price=price;
	}
	public void insertSim(String sp,String networkType,String simType,long simno)
	{
		s= new Sim(sp, networkType, simType, simno);
		System.out.println("Sim inserted!");
	}
	public void displayMobile()
	{
		System.out.println(brand);
		System.out.println(name);
		System.out.println(type);
		System.out.println(price);
	}
	public void connectCharger(String brand,String type,int voltage,double price)
	{
		c= new Charger(brand, type, price, voltage);
		System.out.println("Charger Connected!");
	}
	
	public void connectEarbuds(String brand,int frequency,String type,double price )
	{
		eb=new Earbuds(brand, frequency, type, price);
		System.out.println("Earbuds Connected Succesfully");
	}
}

