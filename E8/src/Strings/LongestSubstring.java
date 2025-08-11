package Strings;

public class LongestSubstring {
	
	public static void main(String[] args) {
		
		System.out.println(highestSubString("Hello_World","The_world"));
	}
	
	public static String highestSubString(String s,String t)
	{
		int match=0;
		
		String maxValue="";
		
		if(s.equals(t))
		{
			return s;
		}
		for(int i=0;i<s.length();i++)
		{
			String temp="";
			for(int j=0;j<t.length();j++)
			{
				if(s.charAt(i+match)==t.charAt(j))
				{
					temp+=s.charAt(i+match);
					match++;
				}
				else
				{
					if(maxValue.length()<temp.length() && match>0)
					{
						j-=match;
						maxValue=temp;
						match=0;
						temp="";
					}
					
				}
			}
			if(maxValue.length()<temp.length())
			{
				maxValue=temp;
				temp="";
			}
			
		}
		return maxValue;
		
	}

}
