package Arrays;

public class ElementMissing {
	
	
	public static boolean checkElement(int []arr, int target)
	{
		for(int i =0;i<arr.length;i++)
		{
			if(arr[i]==target)
			{
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		
		int []arr= {10,20,30,50};
		int target =7;
		
		if(checkElement(arr, target))
		{
			System.out.println("Element "+target+" is Present");
		}
		else
		{
			System.out.println("Element "+target+" is Missing");
		}
	}
	
	

}
