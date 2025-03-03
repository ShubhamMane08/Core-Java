//wrong op
import java.util.Scanner;
class RangeOfFactorial
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Range : ");
		int range=sc.nextInt();
		for(int start=1;start<=range;start++)
		{
			if(isFactorial(start))
			{
				System.out.print(start+" ");

			}

		}
		
	}
	public static boolean isFactorial(int num)
	{
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact*=i;
		}
		return num==fact;

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