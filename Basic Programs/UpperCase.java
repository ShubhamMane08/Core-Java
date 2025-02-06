import java.util.Scanner;

class UpperCase
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Character :");

		char ch = sc.next().charAt(0);

		String cha=(ch>='A' && ch<='Z')?(" it is a upper case"):("it is not a upper case");
		System.out.println(cha);


	}
} 