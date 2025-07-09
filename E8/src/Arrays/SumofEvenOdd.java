package Arrays;

public class SumofEvenOdd {
	
	public static void sumOfEven(int[]arr)
	{
		
		int evenSum=0 ;
		int oddSum=0;
		for(int i =0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				evenSum+=arr[i];
			}
			else
			{
				oddSum+=arr[i];
			}		
		}
		System.out.println("The Even Sum is : "+evenSum);
		System.out.println("The Odd Sum is : "+oddSum);
		
		if(evenSum==oddSum)
		{
			System.out.println("Both the Sum are Equal..!");
		}
		else
		{
			System.out.println("Both the Sum are Different..!");
		}
		
	}
	
	public static void main(String[] args) {
		
		int[]arr= {1,2,3,4,5};
		sumOfEven(arr);
		
		
	}

}
