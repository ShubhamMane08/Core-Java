import java.util.Scanner;
class AllInOne
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num = sc.nextInt();
		checkPrime(num);
		
		
		
	}
	public static void checkPrime(int num)
	{
		int den=3;
		while(den<=num/2)
		{
			if(num%den==0)
			{
				break;
			}
			den++;
		}
		if(num/2>den)
		{
			System.out.println(" It is Prime Number");
		}
		else 
		{
			System.out.println(" It is Not Prime");
		}

	}
	
	
}