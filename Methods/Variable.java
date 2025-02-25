class Variable
{
	public static void main(String[] args) 
	{
		int a=10;
		System.out.println(a);
		test();
		
	}
	public static void test()
	{
		int a=20;
		System.out.println(a);// Cannot access variable with same name in both methods
							// without initializing 
	}
	
}