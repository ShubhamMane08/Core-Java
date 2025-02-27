class Binding
{
	public static void main(String[] args) 
	{
		System.out.println("Main starts");
		add('a',10);
		System.out.println("Main Ends");
	}
	public static void add(int a,int b)
	{
		System.out.println("Add Starts");
		int res=a+b;
		System.out.println(res);
		System.out.println("Add Ends");
	}
}