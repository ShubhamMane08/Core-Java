package Arrays;

public class CountOfDuplicateElement {

	
	public static void countofDuplicate(int[]arr)
	{
		int count;
		boolean []visited = new boolean[arr.length];
		
		for(int i=0;i<arr.length;i++)
		{
			if(visited[i])
				continue;
			count=1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					visited[j]=true;
					count++;
				}
			}
			
			if(count>1)
			{
				System.out.println(arr[i]+" is Repeated "+count+" times");
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		
		int []arr= {1,2,2,3,5,3};
		countofDuplicate(arr);
	}
}
