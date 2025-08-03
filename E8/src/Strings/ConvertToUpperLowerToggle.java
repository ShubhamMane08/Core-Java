package Strings;

public class ConvertToUpperLowerToggle {

	public static void main(String[] args) {
		
		String s = "Shubham";
		System.out.println(toUpper(s));
		System.out.println(toLower(s));
		System.out.println(toggle(s));
		
	}
	
	public static String toUpper(String s)
	{
		String ans="";
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(ch>='a' && ch<='z')
			{
				ans+=(char)(ch-32);
			}
			else
			{
				ans+=ch;
			}
		}
		return ans;
	}
	
	public static String toLower(String s)
	{
		String ans="";
		for(int i = 0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(ch>='A' && ch<='Z')
			{
				ans+=(char)(ch+32);
			}
			else
			{
				ans+=ch;
			}
		}
		return ans;
	}
	
	public static String toggle(String s)
	{
		String ans = "";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>='A' && ch<='Z')
			{
				ans+=(char)(ch+32);
			}
			else if(ch>='a'&& ch<='z')
			{
				ans+=(char)(ch-32);
			}
			else
			{
				ans+=ch;
			}
		}
		return ans;
	}
	
}
