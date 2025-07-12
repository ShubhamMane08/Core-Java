package Arrays;

public class MaxNumber {
	
	public static void maxNumber(int []arr)
	{
		int max = Integer.MIN_VALUE;
		int sum=0;//
		for(int i =0; i<arr.length;i++)
		{   
			//1
			sum+=arr[i];
			if(arr[i]>max)
			{
				
				max = arr[i];
			}
		}
		int sumOfNat = max*(max+1)/2;
		System.out.println("The Missing Element is : "+sumOfNat);
		System.out.println(max);
	}
	
	public static void main(String[] args) {
		
		int []arr= {1,2,4,5,6};
		maxNumber(arr);
	}

}
