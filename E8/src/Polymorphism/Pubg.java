package Polymorphism;

public class Pubg {
	
	int bullet=30;
	
	public void turnRight()
	{
		System.out.println("Turned Right");
	}
	public void turnLeft()
	{
		System.out.println("Turned Right");
	}
	
	public void fire()
	{
		if(bullet>0)
		{
			bullet--;
			System.out.println("Fired!");
			System.out.println(bullet+" left");
		}
		else
		{
			System.out.println("Reload!");
		}
	}

}
