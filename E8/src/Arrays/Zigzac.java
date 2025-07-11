package Arrays;

import java.util.Arrays;

public class Zigzac {
	
	public static int[] zigZac(int[]arr1,int []arr2)
	{
		
		int []ans=new int[arr1.length+arr2.length];
		int i=0,j=0,mem=0;
		
		while (i<arr1.length && j<arr2.length)
		{
			ans[mem++]=arr1[i++];
			ans[mem++]=arr2[j++];
		}
		while(i<arr1.length)
		{
			ans[mem++]=arr1[i++];
		}
		while(j<arr2.length)
		{
			ans[mem++]=arr2[j++];
		}
		return ans;
	}
	
	public static void main(String[] args) {
		int[]arr1= {10,20,30,40};
		int []arr2= {60,50,70};
		System.out.println(Arrays.toString(zigZac(arr1, arr2)));
	}

}
