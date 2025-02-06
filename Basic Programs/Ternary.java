import java.util.Scanner;

class Ternary
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First input :");


		int a=sc.nextInt();
		System.out.print("Enter Second Input : ");
		int b=sc.nextInt();
		System.out.print("Enter Third Input : ");
		int c=sc.nextInt();

		int lar= (a>b)?((a>c)?(a):c):((b>c)?(b):(c));

		System.out.println(lar);
	}
}