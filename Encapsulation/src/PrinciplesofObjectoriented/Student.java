package PrinciplesofObjectoriented;

public class Student {
	
	private String inst="Qspiders";
	private String name;
	private String branch;
	private long phno;
	private double fees;
	private String Course;
	
	Student(String name,String Course, String branch, long phno, double fees)
	{
		this.name=name;
		this.Course=Course;
		this.branch=branch;
		this.phno=phno;
		this.fees=fees;	
	}
	
	public String getInstituteName()
	{
		return inst;
	}
	public String getName()
	{
		return name;
	}
	public String getBranch()
	{
		return branch;
	}
	
	public void setBranch(boolean permission,String branch)
	{
		if(permission)
		{
			this.branch=branch;
			System.out.println(branch+" is Updated Branch");
			
		}
		else
		{
			System.out.println("Please Take Permission");
		}
	}
	public long getPhoneNumber()
	{
		return phno;
	}
	
	
	public void setPhoneNumber(boolean id, long phno)
	{
		if(id)
		{
			this.phno=phno;
			System.out.println(phno+" is Updated Phone Number");
		}
		else 
		{
			System.out.println("Please submit Valid Documents.");
		}
	}
	public double getFees()
	{
		return fees;
	}
	public String getCourse()
	{
		return Course;
	}
	

}
