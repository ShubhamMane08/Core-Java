class SumofFactorialofDigit
{
	public static void main(String[] args) 
	{
		int num=2451;
		int dup = num;
		int sum=0;

		while( num>0)
		{
			int fact=1;
			int rem=num%10;
			if(rem%2==0)
			{
				for(int j = rem;j>=1;j--)
				{
					fact*=j;
				}
				sum+=fact;
			}
			
			num/=10;
		}
		System.out.println(dup);
		System.out.println("Sum of factorial"+sum);
	}
}