import java.util.Scanner;
class MagicNumber
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num = sc.nextInt();
		//1234
		System.out.println(isMagic(num,sumOfDigit(num,0)));
		
	}
	public static boolean isMagic(int num,int sum)
	{
		//

		if(sum==1)
		{
			return true;
		}//false
		else if(sum==num)
			return false;
		else
		{
			return isMagic(num,sumOfDigit(sum,0));
		}
	}
	
	public static int sumOfDigit(int num,int sum)
	{
		if(num==0)
			return sum;
		else 
			return sumOfDigit(num/10,sum+=num%10);
	}
}