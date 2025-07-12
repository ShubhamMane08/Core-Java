package Arrays;

public class thirdMin {
	public static void thirdMinNumber(int []arr)
	{
		int min=Integer.MAX_VALUE;
		int secMin=Integer.MAX_VALUE;
		int thirdMin=Integer.MAX_VALUE;
		
		for(int i =0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				thirdMin=secMin;
				secMin=min;
				min=arr[i];
			}
			else if(arr[i]<thirdMin && arr[i]!=min)
			{
				thirdMin=arr[i];
			}
			else
			{
				secMin=arr[i];
			}
		}
		System.out.println("Min : "+min);
		System.out.println("Second Min : "+secMin);
		System.out.println("Third Min : "+thirdMin);
	}
	public static void main(String[] args) {
		int []arr= {21,20,12,5};
		thirdMinNumber(arr);
	}

}
