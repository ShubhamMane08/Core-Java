class Init3
{
	String name="Shubh";
	static 
	{
		test();

	}
	public static void main(String[] args) 
	{

		System.out.println("From Main..!");
	}
	public static void test()
	{
		String name="Onkar";
		System.out.println(name);
		System.out.println("I am in Test Method.!!");
	}
}