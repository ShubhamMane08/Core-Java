package Arrays;

import java.util.Arrays;

public class RemovingElement {
	
	public static void removeele(int []arr,int ele)
	{
		int index=0;
		
		int []ans=new int [arr.length-1];
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==ele)
			{
				break;
			}
			for(int j=0;j<arr.length;j++)
			{
				if(j<i)
				{
					ans[j]=arr[i];
				}
				else if(j>i)
				{
					ans[j-1]=arr[j];
					System.out.println(Arrays.toString(ans));
				}
				else
				{
					System.out.println(Arrays.toString(arr));
					
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		int []arr = {56,7,8,9};
		removeele(arr, 7);
		
	}

}
