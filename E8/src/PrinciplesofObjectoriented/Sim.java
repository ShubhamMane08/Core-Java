package PrinciplesofObjectoriented;

public class Sim {
	
	String serviceprovider;
	String networkType;
	String type;
	long simno;
	
	Sim()
	{
		
	}
	
	Sim(String sp, String nt, String type,long simno  )
	{
		serviceprovider=sp;
		networkType=nt;
		this.type=type;
		this.simno=simno;
	}
	
	public void displaySim()
	{
		System.out.println(serviceprovider);
		System.out.println(networkType);
		System.out.println(type);
		System.out.println(simno);
	}
}
