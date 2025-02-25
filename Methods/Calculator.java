import java.util.Scanner;
class Calculator
{

	public static void main(String[] args) 
	{
		addition();
		subtraction();
		division();
		multiplication();
		Mod();

	}
	public static void addition()
	{
		System.out.println("    Addition   ");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Number : ");
		int a=sc.nextInt();
		System.out.print("Enter Second Number : ");
		int b=sc.nextInt();
		int answer=a+b;
		System.out.println("Addition is "+answer);
		System.out.println();
	}
	public static void subtraction()
	{
		System.out.println("   Subtraction   ");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Number : ");
		int a=sc.nextInt();
		System.out.print("Enter Second Number : ");
		int b=sc.nextInt();
		int answer=a-b;
		System.out.println(a+" - "+b+" = "+answer);
		System.out.println();
	}
	public static void division()
	{
		System.out.println("   Division  ");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Number : ");
		int a=sc.nextInt();
		System.out.print("Enter Second Number : ");
		int b=sc.nextInt();

		int answer= a/b;
		System.out.println(a+" / "+b+" = "+answer);
		System.out.println();
		
	}
	public static void multiplication()
	{
		System.out.println("   Multiplication  ");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Number : ");
		int a=sc.nextInt();
		System.out.print("Enter Second Number : ");
		int b=sc.nextInt();

		int answer= a*b;
		System.out.println(a+" * "+b+" = "+answer);
		System.out.println();

	}
	public static void Mod()
	{
		System.out.println("   Modulus   ");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Number : ");
		int a=sc.nextInt();
		System.out.print("Enter Second Number : ");
		int b=sc.nextInt();

		int answer= a%b;
		System.out.println(a+" % "+b+" = "+answer);
		System.out.println();
	}

	
}