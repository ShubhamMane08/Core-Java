import java.util.Scanner;
class LowerCase
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Character :");
		char ch = sc.next().charAt(0);
		System.out.println( (ch>='a' && ch<='z')?(ch+" is a LowerCase Alphabet"):(ch+" is not a LowerCase Alphabet") );
	}
	
}