package Arrays;

public class PalindromeOfArray {
	
	public static boolean palindrome(int[]arr)
	{
		int i=0;
		int j=arr.length-1;
		while(i<j)
		{
			if(arr[i]==arr[j])
			{
				i++;
				j--;
			}
			else
			{
				break;
			}
		}
		return i>=j;
	}
	
	public static void main(String[] args) {
		
		int []arr= {1,2,3,4,3,2,1};
		System.out.println(palindrome(arr));
	}

}
