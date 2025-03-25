class Overloading
{
	public static void main(String[] args) 
	{
		add(10,20);
		add(20.0,40.0);
		add("Shubham"," Mane");

		
	}
	public static void add(int a,int b)
	{
		System.out.println(a+b);
	}
	public static void add(double a,double b)
	{
		System.out.println(a+b);
	}
	public static void add(String a, String b)
	{
		System.out.println(a+b);
	}
}