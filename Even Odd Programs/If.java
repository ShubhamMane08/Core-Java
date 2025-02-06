import java.util.Scanner;
class If
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();

		System.out.print("Enter a Number : ");

		if(num%2==0)
		{
			System.out.println(num+" is an Even Number.");
		}
		else
		{
			System.out.println(num+" is an Odd Number.");
		}
		
	}
}