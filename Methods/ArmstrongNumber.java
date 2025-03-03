//Range of Armstrong Number
import java.util.Scanner;
class ArmstrongNumber
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Range : ");
		int range=sc.nextInt();
		for(int start=1;start<=range;start++)
		{
			if(isArmstrong(start))
			{
				System.out.print(start+" ");
			}
		}
		
	}
	public static boolean isArmstrong(int num)
	{
		int ct =count(num);
		int sum=0;
		for(int i=num;i!=0;i/=10)
		{
			sum+=power(i%10,ct);

		}
		return num==sum;
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
		int pow = 1;
		for(int i=0;i<ct;i++)
		{
			pow*=digit;
		}
		return pow;
	}
}