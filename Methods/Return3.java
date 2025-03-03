//Palindromic Prime
//error
import java.util.Scanner;
class Return3
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int ip =sc.nextInt();
		int rev=reverse(ip);
		// System.out.println(isPrime(ip));
		if(ip==rev && isPrime(ip))
		{
			System.out.println("It is a Palindromic Prime Number.");
		}
		else 
		{
			System.out.println("Not a Palindromic Prime Number.");
		}
	}
	public static int reverse(int num)
	{
		int rev=0;
		while(num!=0)
		{
			rev=rev*10+(num%10);
			num/=10;
		}
		return rev;
	}
	public static boolean isPrime(int num)
	{
		int den=2;
		for(;den<num;den++)
		{
			if(num%den==0)
				break;
			
		}
		return num==den;

	}

 
	
}