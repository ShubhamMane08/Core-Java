package Arrays;

public class SumofArrays {
	
	public static int sumOfArrays(int []ref)
	{
		int sum=0;
		for(int i = 0;i<ref.length;i++)
		{
			sum=sum+ref[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		int[]arr = {10,20,30,40};
		System.out.println(sumOfArrays(arr));
	}

}
