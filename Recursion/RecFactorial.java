import java.util.Scanner;
class RecFactorial
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		long num=sc.nextLong();
		System.out.println(Factorial(num));
		
	}
	public static Long Factorial(Long num)
	{
		if(num==0)
		{
			return 1l;  
		}
		return num*Factorial(num-1);
	}
}