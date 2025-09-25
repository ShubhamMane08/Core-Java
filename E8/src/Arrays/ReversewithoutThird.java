package Arrays;

import java.util.Arrays;

public class ReversewithoutThird {
	
	public static void reverse(int []arr)
	{
		int i=0,j=arr.length-1;
		while(i<j)
		{
			arr[i]=arr[i]+arr[j];
			arr[j]=arr[i]-arr[j];
			arr[i]=arr[i]-arr[j];
			i++;
			j--;
		}
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		
		int []arr= {1,2,3,4};
		reverse(arr);
	}

}
