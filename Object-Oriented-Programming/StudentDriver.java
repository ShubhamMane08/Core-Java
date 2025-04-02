class StudentDriver
{
	public static void main(String[] args) 
	{
		Student s1=new Student();

		s1.name="Shubham";
		s1.age=24;
		s1.coll="RIT";
		s1.roll=61253;
		s1.details();
		System.out.println(s1);

		Student s2 = new Student();
		s2.name="Meera";
		s2.age=24;
		s2.coll="RIT";
		s2.roll=61253;
		s2.details();
		System.out.println(s2);

		
	}
}