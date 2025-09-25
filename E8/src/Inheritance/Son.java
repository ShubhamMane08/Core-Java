package Inheritance;

public class Son extends Father {
	
	String name;
	String standard;

	
	public Son()
	{
		
	}

	public Son(String car, String home,String age,String name, String standard)
	{
		this.car=car;
		this.home=home;
		this.age=age;
		
		this.name=name;
		this.standard=standard;
		
	}
	public void displaySon()
	{
		displayFather();
		System.out.println("Name : "+name);
		System.out.println("Standard : "+standard);
	}
	
}
