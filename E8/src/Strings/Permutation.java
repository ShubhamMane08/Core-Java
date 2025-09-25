package Strings;

import java.util.Arrays;
public class Permutation {
	public static void main(String[] args) {
		String s="ABC";
		char []ar=s.toCharArray();
		permutation(ar, 0);
	}
	
	public static void permutation(char []ar,int ref)
	{
		if(ref==ar.length-1)
		{
			System.out.println(Arrays.toString(ar));
			return;
		}
		
		for(int i=ref;i<ar.length;i++)
		{
			swap(ar,i,ref);
			permutation(ar,ref+1);
			swap(ar,ref,i);
		}
	}
	public static void swap(char[]ar,int f,int l)
	{
		char temp=ar[f];
		ar[f]=ar[l];
		ar[l]=temp;
	}
	
	

}
