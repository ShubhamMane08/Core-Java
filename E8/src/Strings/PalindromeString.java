package Strings;

public class PalindromeString {

	
	public static void main(String[] args) {
		
		String s = "aaa";
		
		int i;
		for(i=0;i<s.length()/2;i++)
		{
			if(s.charAt(i) != s.charAt(s.length() -1 -i))
			{
				break;
			}
		}
		if(i>=s.length()/2)
		{
			System.out.println("It is Palindrome");
		}
		else
		{
			System.out.println("It is not a Palindrome");
		}
	}
}
