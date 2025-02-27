class Binding
{
	public static void main(String[] args) 
	{
		System.out.println("Main starts");
		add('a',10);
		System.out.println("Main Ends");
		cal(7);
		string();
	}
	public static void add(int a,int b)
	{
		System.out.println("Add Starts");
		int res=a+b;
		System.out.println(res);
		System.out.println("Add Ends");
	}
	public static void cal(int a)
	{
		
		int x=(a*49/a)+(35/7);
		System.out.println(x);
	}
	public static void string()
	{
		String str="shubham";
		System.out.println(str);
		System.out.println(str.replace('s','v')+" "+ str.length());
		System.out.println(str.startsWith("sh"));
	}
}