import java.util.Scanner;
class RangeOfPrime
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Range : ");
		//20
		int num = sc.nextInt();
		//     1    true 
		for(int start=1;start<=num;start++)
		{
			//
			if(isPrime(start))
			{
				System.out.print(start+" ");
			}
		}

		
	}
								//20
	public static boolean isPrime(int num)
	{
				// 2 true
		for(int den = 2; den<num;den++)
		{
			//20%2  true
			if(num%den==0)
			{
				return false;
			}
		}
		return true;
	}

	
}