package Arrays;

import java.util.Arrays;

public class MerggingHalfRev1 {
	
	public static void halfRev1(int []arr1,int []arr2)
	{
		int []ans=new int [6];
		for(int i=0,j=arr1.length-1;i<ans.length;i++)
		{
			if(i<arr2.length)
			{
				ans[i]=arr2[i];
			}
			else
			{
				ans[i]=arr1[j];
				j--;
			}
		}
		System.out.println(Arrays.toString(ans));
	}
	public static void main(String[] args) {
		
		int[]arr1= {10,20,30,40};
		int[]arr2= {50,60};
		halfRev1(arr1, arr2);
	}

}
