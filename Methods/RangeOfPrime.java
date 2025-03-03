import java.util.Scanner;
class RangeOfPrime
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Range : ");
		int num = sc.nextInt();

		for(int start=1;start<=num;start++)
		{
			if(isPrime(start))
			{
				System.out.print(start+" ");
			}
		}

		
	}
	public static boolean isPrime(int num)
	{
		
		for(int den = 2; den<num;den++)
		{
			if(num%den==0)
			{
				return false;
			}
		}
		return true;
	}

	
}