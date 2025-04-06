class Student
{
	String name;
	int age;
	String coll;
	String degree;
	int roll;


	Student()
	{
		System.out.println("From Constructor");
		System.out.println(this);
	}

	Student(String name, int age, String degree, String coll,int roll )
	{
		
		this.name=name;
		this.age=age;
		this.degree=degree;
		this.coll=coll;
		this.roll=roll;
	}

	public void details()
	{
		String degree="B.E";
		int age=21;
		String name="Onkar";
		String coll="WIT";
		int roll=4213;
		System.out.println("Student Name : "+name);
		System.out.println("Student age : "+age);
		System.out.println("College Name : "+coll);
		System.out.println("Degree : "+degree);
		System.out.println("Roll Number : "+roll);
		System.out.println("----Invoking Gloabal Datamembers-----");
		System.out.println("Student Name : "+this.name);
		System.out.println("Student age : "+this.age);
		System.out.println("College Name : "+this.coll);
		System.out.println("Degree : "+this.degree);
		System.out.println("Roll Number : "+this.roll);
	}

}