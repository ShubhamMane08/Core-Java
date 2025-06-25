package Exception;

import java.util.Scanner;
public class ArithmaticException {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Number : ");
		int num = sc.nextInt();
		
		System.out.println("Enter Second Number : ");
		int den = sc.nextInt();
		
		try
		{
			int ans = num/den;
			System.out.println(ans);
	
		}
		catch(ArithmeticException ref)
		{
			System.out.println("You cannot divide with zero..!");
		}
		
			
	}
}
