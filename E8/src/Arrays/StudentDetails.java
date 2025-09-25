package Arrays;

public class StudentDetails {
	
	String name,coll;
	int roll,age;
	
	StudentDetails()
	{
		
	}
	public StudentDetails(String name, String coll, int roll,int age)
	{
		this.name=name;
		this.coll=coll;
		this.roll=roll;
		this.age=age;
		
	}
	public void displayStudent()
	{
		System.out.println("Name: "+name);
		System.out.println("Age : "+age);
		System.out.println("College : "+coll);
		System.out.println("Roll Number : "+roll);
	}
	
	public String toString()
	{
		return "Name : "+name+"\nCollege : "+coll+"\nRoll : "+roll+"\nAge :"+age+"\n\n";
	}

}
