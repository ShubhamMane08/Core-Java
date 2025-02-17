import java.util.Scanner;
class PalindromeString
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String org,rev="";

		System.out.print("Enter a String : ");
		org=sc.nextLine().toLowerCase();
		int len=org.length();

		for(int i=len-1;i>=0;i--)
		{
			// System.out.println(org.charAt(i));
			rev=rev+org.charAt(i);
		}
		if(org.equals(rev))
		{
			System.out.println("Palindrome String..!!");
		}
		else 
		{
			System.out.println("Not a Palindrome String..!!");
		}

		
	}

}