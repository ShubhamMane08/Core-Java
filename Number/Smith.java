import java.util.Scanner;
class Smith 
{
	public static void main(String [] args)
	{
		for(int i = 4;i<=1000;i++)
		{
			if(isSmith(i))
				System.out.println(i);
		}
	}
	public static boolean isSmith(int num)
	{
		int next = 2;
		int sumOfFact = 0;
		int sumD = sumOfDigit(num,0);
			if(isPrime(num,2))
				return false;
			else
			{
				while(num!=1)
				{
					if(num%next==0)
					{		
						num/=next;
						if(next>9)
						{
							next=sumOfDigit(next,0);
						}
						sumOfFact+=next;
							next=2;
					}
					else 
						next = nextPrime(next);
				}
				return sumOfFact==sumD;
			}
	}
	public static int nextPrime(int num)
	{
			if(isPrime(num+1,2))
				return num+1;
			else
				return nextPrime(++num);
	}
	public static boolean isPrime(int num,int temp)
	{
			if(temp==num)
				return true;
			else if(num%temp==0||num<2)
				return false;
			else
				return isPrime(num,++temp);
	}
	public static int sumOfDigit(int num,int sum)
	{
			if(num==0)
				return sum;
			else
				return sumOfDigit(num/10,sum+=num%10);
	}
}