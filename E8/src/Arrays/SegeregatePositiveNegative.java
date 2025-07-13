package Arrays;

import java.util.Arrays;

public class SegeregatePositiveNegative {
	
	public static int[] seperate(int []arr)
	{
		int i=0,j=arr.length-1;
		while(i<j)
		{
			while(arr[i]<0)
			{
				i++;
			}
			while(arr[j]>=0)
			{
				j--;
			}
			if(i<j)
			{
				arr[i]=arr[i]+arr[j];
				arr[j]=arr[i]-arr[j];
				arr[i]=arr[i]-arr[j];
			}
		}
		return arr;
	}
	 public static void main(String[] args) {
		
		 int []arr = {-9,2,4,-6,8,0,-6,-6,8};
		 System.out.println(Arrays.toString(seperate(arr)));
	}

}
