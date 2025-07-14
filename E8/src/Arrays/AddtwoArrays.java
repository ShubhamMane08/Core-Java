package Arrays;

import java.util.Arrays;

public class AddtwoArrays {
	
	public static void main(String[] args) {
	 int []arr= {25,29,1,20};
	 int []arr1= {20,18};
	 mergeingArrays(arr, arr1);
	 
		
	}
	public static void mergeingArrays(int []arr,int []arr1)
	{
		int index=0,j=0;
		if(index>=0 && index<=arr.length)
		{
			int []ans=new int[arr.length+arr1.length];
			
			for(int i =0;i<ans.length;i++)
			{
				if(i<index)
				{
					ans[i]=arr[i];
				}
				else if(i<arr1.length+index)
				{
					ans[i]=arr1[j];
				}
				else
				{
					ans[i]=arr[i-arr1.length];
				}
			}
			System.out.println(Arrays.toString(ans));
		}
		
	}

}
