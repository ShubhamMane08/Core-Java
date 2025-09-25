package Algorithms;

import java.util.Arrays;
public class TwoArraysSort1 {
	public static void main(String[] args) {
		
		int []a= {1,2,3,4,5};
		int []b= {7,8,9,10};
		System.out.println(Arrays.toString(merge(a,b)));
		
		
	}
	public static int[] merge(int[]a,int[]b)
	{
		int []ans = new int [a.length+b.length];
		
		int i=0,j=0,k=0;
		
		while(i<a.length && j<b.length)
		{
			if(a[i]<=b[j])
			{
				ans[k++]=a[i++];
			}
			else if(a[i]>b[j])
			{
				ans[k++]=b[j++];
			}
		}
		while(i<a.length)
		{
			ans[k++]=a[i++];
		}
		while(j<b.length)
		{
			ans[k++]=b[j++];
		}
		return ans;
	}

}
