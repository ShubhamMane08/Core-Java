class Init6
{
	static double d;
	static 
	{
		d=test(100);
		System.out.println(d);
		d=test(d)+demo((int)d);

		double d= demo((int)test(Init6.d));
		System.out.println(d);
	}
	public static void main(String[] args) 
	{
		
	}
	public static double test(double num)
	{
		return num*num;
	}
	public static char demo(int num)
	{
		return (char)num;
	}
}