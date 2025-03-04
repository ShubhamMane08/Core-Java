class RotatingPrime
{
	public static void main(String[] args) 
	{
		System.out.println(isRotatingPrime(121));
	}
	public static boolean isRotatingPrime(int num)
	{
		if(isPrime(num))
		{
			int rot = rotate(num);
			while(rot!=num && isPrime(rot))
			{
				rot = rotate(rot);
			}
			return num== rot;
		}
		return false;
	}
	public static int rotate(int num)
	{
		int last=num%10;
		num/=10;
		int ct=count(num);

		return last*power(10,ct)+num;
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
	public static boolean isPrime(int num)
	{
		int den=2;
		for(;den<num;den++)
		{
			if(num%den==0)
			{
				return false;
			}

		}
		return true;
	}
	public static int power(int digit, int ct)
	{
		int pow=1;
		for(int i=0;i<ct;i++)
		{
			pow*=digit;
		}
		return pow;
	}
}