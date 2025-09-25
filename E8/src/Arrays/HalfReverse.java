package Arrays;

import java.util.Arrays;

public class HalfReverse {

	
	public static void halfReverse(int[]arr)
	{
		int n= arr.length;
		int mid= n/2;
		for(int i=0;i<mid/2;i++)
		{
			int rev=arr[i];
			arr[i]=arr[mid-1-i];
			arr[mid-1-i]=rev;
		}
		System.out.println("After Reversing First Half : "+Arrays.toString(arr));
	}
	
	public static void main(String[] args) {
		
		int []arr= {1,2,3,4,5,6,5};
		halfReverse(arr);
	}
}
