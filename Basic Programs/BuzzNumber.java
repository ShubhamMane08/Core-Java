import java.util.Scanner;
class BuzzNumber
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num = sc.nextInt();

		if(num%7==0 || num%10==7)
		{
			System.out.println(num+" Buzz Number..!");
		}
		else
		{
			System.out.println(num+" not a Buzz Number..!!");
		}


		
	}
}