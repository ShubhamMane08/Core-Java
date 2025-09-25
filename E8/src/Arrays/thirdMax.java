package Arrays;

public class thirdMax {
	
	public static void thirdMaxNumber(int []arr)
	{
		int max=Integer.MIN_VALUE;
		int secMax=Integer.MIN_VALUE;
		int thirdMax=Integer.MIN_VALUE;
		for(int i = 0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				thirdMax=secMax;
				secMax=max;
				max=arr[i];
			}
			else if(arr[i]>thirdMax && arr[i]!=secMax)
			{
				thirdMax=arr[i];
			}
			else
			{
				secMax=arr[i];
			}
		}
		System.out.println("Max : "+max);
		System.out.println("Second Max : "+secMax);
		System.out.println("Third Max : "+thirdMax);
	}
	
	public static void main(String[] args) {
		
		int []arr= {20,20,10,30,30,50};
		thirdMaxNumber(arr);
	}

}
