package Arrays;

public class SecondMin {
	public static void secondMinNumber(int[]arr)
	{
		int min=Integer.MAX_VALUE;
		int secMin=Integer.MAX_VALUE;
		
		for(int i =0; i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				secMin=min;
				min=arr[i];
			}
			else if(arr[i]<secMin && arr[i]!=min)
			{
				secMin=arr[i];
			}
		}
		System.out.println("Min : "+min);
		System.out.println("Second Min : "+secMin);
	}
	
	public static void main(String[] args) {
		
		int []arr= {50,30,45,60};
		secondMinNumber(arr);
	}

}
