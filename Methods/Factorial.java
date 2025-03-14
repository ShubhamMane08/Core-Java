class Factorial
{
	public static void main(String[] args)
	{
		System.out.println("Factorial => "+isFactorial(5));
		System.out.println("Count => "+count(1234));
	}
	public static int isFactorial(int num)
	{
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact*=i;
		}
		return fact;

	}
	public static int count(int num)
	{
		int ct=0;
		while(num!=0)
		{
			num/=10;
			ct++;
		}
		return ct;
	}
	
}