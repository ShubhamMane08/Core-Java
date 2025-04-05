class Test
{
	int a=100;
	char ch = 'a';

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
		System.out.println(a);
	}
	{
		System.out.println("From non-static block 2");
		System.out.println(ch);
	}

}