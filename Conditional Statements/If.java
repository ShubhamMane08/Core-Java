import java.util.Scanner;
class If 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Are you a pid student ? ");

		boolean b=sc.nextBoolean();

		if(b)
		{
			System.out.println("Pay the Fees");
		}
		System.out.println("Join the classes");
	}
}
