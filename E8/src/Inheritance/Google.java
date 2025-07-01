package Inheritance;

public class Google {
	
	
	String ceo;
	String hq;
	double turnover;
	
	
	String email;
	String pass;
	
	public Google()
	{
		
	}

	public Google(String ceo, String hq, double turnover,String email,String pass)
	{
		super();
		this.ceo=ceo;
		this.hq=hq;
		this.turnover=turnover;
		this.email=email;
		this.pass=pass;
	}
	
	public void login(String email,String pass)
	{
		if(this.email==email && this.pass==pass) 
		{
			System.out.println("Login Successfully.!");
			
		}
		else
		{
			System.out.println("Invalid Credentials");
		}
	}
	
	public void displayGoogle()
	{
		System.out.println("CEO : "+ceo);
		System.out.println("Headquaters : "+hq);
		System.out.println("Turnover : "+turnover);
		System.out.println("----------------------------------");
	}
}
