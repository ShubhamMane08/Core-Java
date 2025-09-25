package Arrays;

import java.util.Arrays;

public class RemoveRange {
	
	public static void removeRange(int []arr, int start,int end)
	{
		if(start<end)
		{
			int []ans =new int [arr.length-(end-start)];
			
			for(int i=0;i<arr.length;)
			{
				if(i<start)
				{
					ans[i]=arr[i];
					i++;
				}
				else if(i==start)
				{
					i=i+(end-start);
				}
				else if(i>=end)
				{
					ans[i-(end-start)]=arr[i];
					i++;
					
				}
			}
			System.out.println(Arrays.toString(ans));
		}
	}
	
	public static void main(String[] args) {
		int []arr= {20,1,52,14,6,6,5,5};
		removeRange(arr, 3, 5);
	}

}
