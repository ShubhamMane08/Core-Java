package Arrays;

public class SecondMax {
	
	public static void secondMax(int []arr)
	{
		int max = Integer.MIN_VALUE;
		int secMax=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				secMax=max;
				max=arr[i];
			}
			else if(arr[i]>secMax && arr[i]!=max)
			{
				secMax=arr[i];
			}
		}
		System.out.println("Max : "+max);
		System.out.println("Second Max : "+secMax);
	}
	public static void main(String[] args) {
		
		int []arr = {28,38,50,76};
		secondMax(arr);
	}

}
