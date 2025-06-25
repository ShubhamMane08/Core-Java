package Inheritance;

public class Father {

	
	String car;
	String home;
	String age;
	
	public Father()
	{
		
	}
	
	public Father(String car, String home,String age )
	{
		this.car= car;
		this.home=home;
		this.age=age;
	}
	public void displayFather()
	{
		System.out.println("Car : "+car);
		System.out.println("Home : "+home);
		System.out.println("Age : "+age);
	}
}

