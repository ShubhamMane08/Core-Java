package Strings;

import java.util.Arrays;
public class S2 {
	public static void main(String[] args) {
		
		String s= "I Love India";
		System.out.println(Arrays.toString(convertToCharArray(s)));
		System.out.println(Arrays.toString(convertToByteArray(s)));
		
		
	}
	
	public static char[] convertToCharArray(String s)
	{
		char []ar = new char[s.length()];
		for(int i=0; i<s.length();i++)
		{
			ar[i]=s.charAt(i);
		}
		return ar;
	}
	public static byte[] convertToByteArray(String s)
	{
		byte []ar=new byte[s.length()];
		for(int i=0; i<s.length();i++)
		{
			ar[i]=(byte)s.charAt(i);
		}
		return ar;
	}

}
