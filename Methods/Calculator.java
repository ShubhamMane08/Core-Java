import java.util.Scanner;
class Calculator
{
	public static void main(String[] args) 
	{
		addition();
		subtraction();

	}
	public static void addition()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Number : ");
		int a=sc.nextInt();
		System.out.print("Enter Second Number : ");
		int b=sc.nextInt();
		int answer=a+b;
		System.out.println("Addition is "+answer);
	}
	public static void subtraction()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Number : ");
		int a=sc.nextInt();
		System.out.print("Enter Second Number : ");
		int b=sc.nextInt();
		int answer=a-b;
		System.out.println(a+" - "+b+" = "+answer);
	}

	
}