package ObjectClass;

public class Student {
	
	String name;
	String college;
	int roll;
	String degree;
	String stream;
	
	
	public Student()
	{
		
	}


	public Student(String name, String college, int roll, String degree, String stream) {
		super();
		this.name = name;
		this.college = college;
		this.roll = roll;
		this.degree = degree;
		this.stream = stream;
	}
	public String toString()
	{
		return "Name: "+name+", College: "+college+", Roll :"+roll+", Degree: "+degree+", Stream: "+stream;
	}
	
	//Error
	public boolean equals(Object o)
	{
		
		Student s =  (Student)o;
		if(this.name==s.name && this.college==s.college  && this.roll==s.roll && this.degree==s.degree&& this.stream==s.stream)
		{
			return true;
		}
		return false;
	}
	public int hashCode()
	{
		return name.hashCode()+college.hashCode()+roll+degree.hashCode()+stream.hashCode();
	}

}
