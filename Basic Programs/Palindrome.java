import java.util.Scanner;
class Palindrome
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int den=sc.nextInt();
		int num=0;
		

		while(den<=num)
		{
			if(den%num==0)
			{
				break;
			}
			den++;
		}
		if(num>den)
			{
				System.out.println("It is a Prime Number..!!");
			}
			else 
			{
				System.out.println("It is not a Palindrome");
			}
		
	}
}