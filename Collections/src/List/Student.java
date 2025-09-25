package List;

public class Student {
	
	private String name;
	private double cgpa;
	
	Student()
	{
		
	}
	
	public Student(String name,double cgpa)
	{
		this.name=name;
		this.cgpa=cgpa;
		
	}
	public String getName(String name)
	{
		return name;
	}
	public double getGpa(double cgpa)
	{
		return cgpa;
	}


}
