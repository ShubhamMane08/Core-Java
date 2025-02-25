import java.util.Scanner;
class Calculator
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Number : ");
		int a=sc.nextInt();
		System.out.print("Enter Second Number : ");
		int b=sc.nextInt();
		System.out.println();
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.println("5. Modulus");
		System.out.println();
		
		
		for(;;)
		{
			System.out.print("Select option : ");
			int opt=sc.nextInt();
			switch(opt)
			{
			case 1 : 
				{
					addition(a,b);
					break;
				}
			case 2: 
				{
					subtraction(a,b);
					break;
				}
			case 3:
				{
					multiplication(a,b);
					break;
				}
			case 4:
				{
					division(a,b);
					break;

				}
			case 5:
				{
					Mod(a,b);
					break;

				}
			default:
				{
					System.out.println("Please Enter Correct Option..!!");
					break;

				}
			}
		}

		
	

	}
	public static void addition(int a,int b)
	{
		System.out.println("    Addition   ");
		
		int answer=a+b;
		System.out.println(a+" + "+b+" = "+answer);
		System.out.println();
	}
	public static void subtraction(int a,int b)
	{
		System.out.println("   Subtraction   ");
		
		int answer=a-b;
		System.out.println(a+" - "+b+" = "+answer);
		System.out.println();
	}
	public static void division(int a,int b)
	{
		System.out.println("   Division  ");
		int answer= a/b;
		System.out.println(a+" / "+b+" = "+answer);
		System.out.println();
		
	}
	public static void multiplication(int a, int b)
	{
		System.out.println("   Multiplication  ");
		int answer= a*b;
		System.out.println(a+" * "+b+" = "+answer);
		System.out.println();

	}
	public static void Mod(int a,int b)
	{
		System.out.println("   Modulus   ");

		int answer= a%b;
		System.out.println(a+" % "+b+" = "+answer);
		System.out.println();
	}

	
}