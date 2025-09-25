package Strings;
import java.util.Arrays;
public class WordsToNumber {

	public static void main(String[] args) {
		String s = "twenty three crore forty two lakh twenty three thousand two hundred sixty seven";
		System.out.println(Arrays.toString(split(s,' ')));
		System.out.println(returnNumber(s));
	}
	public static int returnNumber(String s)
	{
		String[] ar = split(s,' ');
		boolean flag = false;
		int num = 0,temp = 0;
		for(int i=0;i<ar.length;i++)
		{
//			System.out.println(ar[i]+" ");
			if(ar[i].equals("hundred")||ar[i].equals("thousand")||ar[i].equals("lakh")||ar[i].equals("crore"))
			{
				temp*=finDeg(ar[i]);
//				System.out.println(finDeg(ar[i]));
				flag =true;
			}
			else if(!flag)
			{
//				System.out.println(findNum(ar[i]));
				temp+=findNum(ar[i]);
			}
			if(flag)
			{
				num+=temp;
				temp=0;
				flag = false;
			}
//			System.out.println("Num: "+ num+" temp: "+ temp);
		}
		if(temp>0)
		{
			num+=temp;
		}
		return num;
	}
	
	public static int findNum(String s)
	{
		switch(s)
		{
			case "one":
				return 1;
			case "two":
				return 2;
			case "three":
				return 3;
			case "four":
				return 4;
			case "five":
				return 5;
			case "six":
				return 6;
			case "seven":
				return 7;
			case "eight":
				return 8;
			case "nine":
				return 9;
			case "ten":
				return 10;
			case "eleven":
				return 11;
			case "twelve":
				return 12;
			case "thirteen":
				return 13;
			case "forteen":
				return 14;
			case "fifteen":
				return 15;
			case "sixteen":
				return 16;
			case "seventeen":
				return 17;
			case "eightenn":
				return 18;
			case "nineteen":
				return 19;
			case "twenty":
				return 20;
			case "thirty":
				return 30;
			case "forty":
				return 40;
			case "fifty":
				return 50;
			case "sixty":
				return 60;
			case "seventy":
				return 70;
			case "eighty":
				return 80;
			case "ninty":
				return 90;
		}
		return 0;
	}
	
	public static int finDeg(String s)
	{
		switch(s)
		{
			case "hundred":
				return 100;
			case "thousand":
				return 1000;
			case "lakh":
				return 100000;
			case "crore":
				return 10000000;
		}
		return 0;
	}
	
	public static String[] split(String s,char ch)
	{
		int cnt = 1,last = s.length()-1 ;
		boolean flag = false;
		while(s.charAt(last)==ch)
		{
			cnt--;
			last--;
		}
		for(int i=0;i<s.length();i++)
		{
			if(flag&&s.charAt(i)==ch)
			{
				cnt++;
			}
			else if(s.charAt(i)!=ch)
				flag = true;
		}
		String temp = "";
		String[] ar = new String[cnt];
		for(int i=0,j=0;i<=last;i++)
		{
			char c = s.charAt(i);
			if(c!=ch)
				temp+=c;
			else {
				if(temp.length()>0)
				{
					ar[j++] = temp;
					temp="";
				}
			}
		}
		if(temp.length()>0)
			ar[ar.length-1] = temp;
		return ar;
		
	}
}
