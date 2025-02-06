import java.util.Scanner;

class MintoDays
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number in Minutes : ");
		long min = sc.nextLong();

		long minInYear=365*24*60;

		long years= min/minInYear;

		long remmin= min%minInYear;
		long days= remmin/(60*24);

		System.out.println(min+" minutes is approximately "+years+" years and "+days+" days");
	}
}