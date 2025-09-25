package Arrays;

import java.util.Arrays;

public class ReverseOfArray1 {

	public static void main(String[] args) {
		
		
		int []arr= {1,2,3,4};
		int []rev= new int[arr.length];
		
		for(int i =0,j=arr.length-1;i<arr.length;i++,j--)
		{
			rev[j]=arr[i];
		}
		
		System.out.println(Arrays.toString(rev));
	}
	
}
