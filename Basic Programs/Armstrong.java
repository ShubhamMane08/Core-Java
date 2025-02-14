// 13 Feb 2025 ( Armstrong Number)

class ArmstrongNumber
{

	public static void main(String[] args)
	 {
		int num=135 , lent = 0, sum=0;
		int dup=num;
		for(int i=num;i>0;i/=10)
		{
			lent++;
		}

	while(num>0)

	{
		int rem = num%10;
		int pow =1;
		for(int i=1;i<=lent;i++)
			pow*=rem;
		sum+=pow;
		num/=10;

	}
	System.out.println(dup==sum?dup+ "  is Armstrong Number  " : 
                       dup+ "  is Not Armstrong Number ");
	}
}