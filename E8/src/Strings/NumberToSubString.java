package Strings;

public class NumberToSubString {

	public static void main(String[] args) {
		String s = "ababab";
		String sub = "aba";
		System.out.println(countOfSubstring(s, sub));
	}
	public static int countOfSubstring(String s,String sub)
	{
		int count = 0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==sub.charAt(0))
			{
				int j = i;
				for(;j<s.length();j++)
				{
					if((j-i)==sub.length()||((j-i)<sub.length()&&s.charAt(j)!=sub.charAt(j-i)))
						break;
				}
				if(j-i==sub.length())
				{
					count++;
				}
			}
		}
		return count;
	}
}
