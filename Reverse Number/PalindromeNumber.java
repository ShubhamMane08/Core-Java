import java.util.Scanner;
class PalindromeNumber
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num = sc.nextInt();
		int dup = num;
		int rev = 0;
		for (int i = num ; i>=1 ; i/=10)
		{
			int rem = i%10;
			rev = rev*10+rem;
		}
		if(rev==dup)
		{
			System.out.println("Palindrome");
		}
		else 
		{
			System.out.println("Not a Palindrome");
		}
		System.out.println(rev);

		
	}
}