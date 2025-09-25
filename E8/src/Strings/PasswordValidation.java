package Strings;

import java.util.Arrays;

public class PasswordValidation {
	public static void main(String[] args) {
		String[] passwords = {"iliketoCoDE0!","teaMAKEsmehappy0","abracaDabra!@1","pasSword","blackcoffeeISthebest"};
		String[] dic = {"Coffee","Coding","happy"};
		System.out.println(Arrays.toString(passwords));
		System.out.println("Are the passwords Valid: ");
		System.out.println(Arrays.toString(returnValidation(passwords,dic)));
		
		
	}
	public static boolean[] returnValidation(String[] a,String[] b)
	{
		boolean[] ans = new boolean[a.length];
		Arrays.fill(ans, true);
		outer:
		for(int i=0,k=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(isSubString(a[i], b[j]))
				{
					ans[k++] = false;
					continue outer;
				}		
			}
			boolean capFlag = false,specialFlag = false,numberFlag = false;
			for(int j=0;j<a[i].length();j++)
			{
				char ch = a[i].charAt(j);
				if(ch>='A'&&ch<='Z')
					capFlag = true;
				else if(ch>=48&&ch<=57)
					numberFlag = true;
				else if(ch=='!'||ch=='@'||ch=='#'||ch=='$'||ch=='%'||ch=='^'||ch=='&'||ch=='*'||ch=='('||ch==')'||ch=='{'||ch=='}'||ch=='['||ch==']')
					specialFlag = true;
			}
			ans[k++] = (capFlag&&numberFlag&&specialFlag);	
		}
		return ans;
	}
	
	public static boolean isSubString(String s, String sub)
	{
		s = s.toLowerCase();
		sub = sub.toLowerCase();
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==sub.charAt(0))
			{
				int j=i;
				for(;j<s.length();j++)
				{
					if(((j-i)<sub.length()&&s.charAt(j)!=sub.charAt(j-i))||(j-i)==sub.length())
						break;
				}
//				System.out.println(j+" j "+i+" "+((j-i)==sub.length()));
				if((j-i)==sub.length())
					return true;
			}
		}
		return false;
	}
}
