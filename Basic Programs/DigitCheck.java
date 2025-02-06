import java.util.Scanner;
class DigitCheck
{
	
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Character :");
		char dig = sc.next().charAt(0);

		System.out.println( (dig>='0' && dig<='9')?(dig+" is a Digit"):(dig+" is not a Digit") );

	}
}