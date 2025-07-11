package Arrays;

import java.util.Arrays;

public class HalfReverse1 {
	
	public static void halfReverse(int []arr)
	{
		int []ans=new int[arr.length];
		
		for(int i=0,j=arr.length-1;i<arr.length;i++)
		{
			if(i<arr.length/2)
			{
				 ans[i]= arr[i];
			}
			else
			{
				ans[i]=arr[j];
				j--;
			}
			
		}
		System.out.println(Arrays.toString(ans));
	}
	
	public static void main(String[] args) {
		
		int []arr= {10,20,30,40,50,60};
		halfReverse(arr);
	}

}
