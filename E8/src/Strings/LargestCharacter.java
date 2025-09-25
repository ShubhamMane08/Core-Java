package Strings;

public class LargestCharacter {
	
	public static void main(String[] args) {
		
		String s = "Shubham";
		
		char max=Character.MIN_VALUE;
		
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(ch>max)
			{
				max=ch;
			}
		}
		System.out.println(max);
		
	}

}
