package Arrays;

public class CountOfPrimeNumbers { 
	
	public static boolean isPrime(int num)
	{
		if(num<=1)
		{
			return false;
		}
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				return false;
			}
			
		}
		return true;
	}
	
	public static void countOfPrime(int[]arr)
	{
		int count=0;
		for(int i=0; i<arr.length;i++)
		{
			if(isPrime(arr[i]))
			{
				count++;
			}
		}
		System.out.println("Total Prime Numbers in Array are : "+count);
	}
	public static void main(String[] args) {
		
		
		int []arr= {1,2,3,5,6,7};
		countOfPrime(arr);
		
	}

}
