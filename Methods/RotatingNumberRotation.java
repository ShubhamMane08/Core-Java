class RotatingNumberRotation
{
	public static void main(String[] args) 
	{
		int ip=1234;
		int rot=rotate(ip);
		while(rot!=ip)
		{
			System.out.println(rot);
			rot=rotate(rot);
		}
		System.out.println(rot);
	}
	public static int rotate(int num)
	{
		// int last=num%10;
		// num/=10;
		return (num%10)*power(10,(count(num)-1))+(num/10);

	}
	public static int count(int num)
	{
		int ct=0;
		while (num!=0)
		{
			num/=10;
			ct++;
		}
		return ct;
	}
	public static int power(int digit,int ct)
	{
		int pow=1;
		for(int i=0;i<ct;i++)
		{
			pow*=digit;
		}
		return pow;
	}
}