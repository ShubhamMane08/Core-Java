package Arrays;

public class MinNumber {
	public static void minNumber(int []arr)
	{
		int min = Integer.MAX_VALUE;
		
		for(int i =0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println(min);
	}
	
	public static void main(String[] args) {
	
		int []arr = {47,21,12,19,2};
		minNumber(arr);
	}

}
