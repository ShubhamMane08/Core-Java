package Arrays;

public class AverageOfArrays {
	
	public static float findingAvg(int []arr)
	{
		int count=0;
		float avg;
		float ans=0;
		for(int i =0; i<arr.length;i++)
		{
			ans+=arr[i];
			count++;
		}
		avg=ans/count;
		return avg;
	}
	
	public static void main(String[] args) {
		
		int []arr = {2, 55, 85, 656, 52, 554, 545, 5, 2};
		System.out.println(findingAvg(arr));
	}

}
