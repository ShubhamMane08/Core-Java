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