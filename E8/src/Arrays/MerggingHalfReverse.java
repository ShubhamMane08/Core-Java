package Arrays;

import java.util.Arrays;

public class MerggingHalfReverse {
	
	public static void mergeHalfRev(int []arr1,int[]arr2)
	{
		
		int []ans = new int [arr1.length+arr2.length];
		
		for(int i =0,j=arr2.length-1;i<ans.length;i++)
		{
			if(i<arr1.length)
			{
				ans[i]=arr1[i];
			}
			else
			{
				ans[i]=arr2[j];
				j--;
			}
		}
		System.out.println(Arrays.toString(ans));
	}
	
	public static void main(String[] args) {
		
		int []arr1= {10,20,30,40};
		int []arr2= {50,60,70,80,90};
		mergeHalfRev(arr1, arr2);
	}

}
