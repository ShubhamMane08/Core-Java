package Arrays;

public class EvenOddCount {
	
	public static void checkEvenOdd(int[]arr)
	{
		int evenCount=0;
		int oddCount=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				evenCount++;
			}
			else
			{
				oddCount++;
			}
		}
		System.out.println("Even Count is : "+evenCount);
		System.out.println("Odd count is : "+oddCount);
	}
	
	public static void main(String[] args) {
		
		
		int []arr= {1,2,3,4,5,8,7};
		checkEvenOdd(arr);
	}

}
