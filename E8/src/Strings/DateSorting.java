package Strings;
import java.util.Arrays;

public class DateSorting {

	public static void main(String[] args) {
		String[] dates = {"03/jan/1984","08/jun/1985","23/apr/1985","18/apr/1985","12/apr/1981","13/jul/1980","12/apr/1981","11/apr/1981"};
		System.out.println(Arrays.toString(dates));
		sortYear(dates);
		System.out.println(Arrays.toString(dates));
	}
	
	public static void sortYear(String[] ar)
	{
		int[] year = new int[ar.length];
		for(int i=0;i<ar.length;i++)
		{
			year[i] = Integer.parseInt(ar[i].split("/")[2]);
		}
//		System.out.println(Arrays.toString(year));
		bubbleSort(year,ar,0,year.length-1);
		
		for(int i =0;i<year.length-1;i++)
		{
			if(year[i]==year[i+1])
			{
				int count = 1;
				for(int j=i+1;j<year.length-1;j++)
				{
					if(year[j]==year[j+1])
						count++;
					else
						break;
				}
				sortMonth(ar,i,i+count);
			}
		}
	}
	
	public static void sortMonth(String[] ar,int start, int end)
	{
		int[] month = new int[(end-start)+1];

		for(int i=start;i<=end;i++)
		{
//			System.out.println(i);
			month[i-start] = parseMonth(ar[i].split("/")[1]);
		}

		bubbleSort(month,ar,start,end);
//		System.out.println(Arrays.toString(ar));
		for(int i =0;i<month.length-1;i++)
		{
			if(month[i]==month[i+1])
			{
				int count = 1;
				for(int j=i+1;j<month.length-1;j++)
				{
					if(month[j]==month[j+1])
						count++;
					else
						break;
				}
				sortDays(ar,(start+i),(start+i+count));
			}
		}
	}
	
	
	public static void sortDays(String[] ar,int start, int end)
	{
		int[] days = new int[(end-start)+1];

		for(int i=start;i<=end;i++)
		{
//			System.out.println(i);
			days[i-start] = Integer.parseInt(ar[i].split("/")[0]);
		}

		bubbleSort(days,ar,start,end);
//		System.out.println(Arrays.toString(ar));
		
	}
	
	public static int parseMonth(String s)
	{
		switch(s)
		{
			case "jan":
				return 1;
			case "feb":
				return 2;
			case "mar":
				return 3;
			case "apr":
				return 4;
			case "may":
				return 5;
			case "jun":
				return 6;
			case "jul":
				return 7;
			case "aug":
				return 8;
			case "sep":
				return 9;
			case "oct":
				return 10;
			case "nov":
				return 11;
			case "dec":
				return 12;
		}
		return 0;
		
	}
	
	public static void bubbleSort(int[] ar,String[] s,int start,int last)
	{
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar.length-i-1;j++)
			{
				if(ar[j]>ar[j+1])
				{
					int temp = ar[j];
					ar[j] = ar[j+1];
					ar[j+1] = temp;
					swap(s,j+start,j+1+start);
				}
			}
		}
//		System.out.println(Arrays.toString(ar));
	}
	
	public static void swap(String[] ar,int i,int j)
	{
		String temp = ar[i];
		ar[i] = ar[j];
		ar[j]=temp;
	}
}
