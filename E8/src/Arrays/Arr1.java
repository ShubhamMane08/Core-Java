package Arrays;

public class Arr1 {

	
	public static void main(String[] args) {
		
		
		int []arr= new int[5];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		
		System.out.println(arr.length);
		for(int index=0; index<arr.length;index++)
		{
			System.out.println(arr[index]);
		}
	}
}
