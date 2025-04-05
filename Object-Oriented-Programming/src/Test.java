class Test
{
	static int a=100;
	static char ch = 'a';

	static 
	{
		System.out.println("From static block 1");
		System.out.println(a);

	}
	static 
	{
		System.out.println("From static block 2");
		System.out.println(ch);
	}
	{
		System.out.println("From non-static block 1");
		
	}
	{
		System.out.println("From non-static block 2");
		
	}

	public static void displayStatic()
	{

		System.out.println("From static block 3");
	}
	public static void main(String[] args) {
		
		displayStatic();
	}

}