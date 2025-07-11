package Arrays;

import java.util.Arrays;

public class MergingTwoArrays {


	public static void Merging(int []arr1,int []arr2)
	{
//		int mem=0;
		int []ans=new int[6];
		
//		for(int i =0;i<arr1.length;i++,mem++)
//		{
//			ans[mem]=arr1[i];
//		}
//		for(int i= 0;i<arr2.length;i++,mem++)
//		{
//			ans[mem]=arr2[i];
//		}
		
		for(int i=0;i<ans.length;i++)
		{
			if(i<arr1.length)
			{
				ans[i]=arr1[i];
			}
			else
			{
				ans[i]=arr2[i-arr1.length];
			}
		}
		
		System.out.println(Arrays.toString(ans));
	}
	
	public static void main(String[] args) {
		
		int []arr1= {10,20,30,40};
		int []arr2= {50,60};
		Merging(arr1, arr2);
	}
}