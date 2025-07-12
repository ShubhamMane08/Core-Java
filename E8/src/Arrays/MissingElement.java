package Arrays;    
import java.util.Arrays;
public class MissingElement {
	public static void main(String[] args) {
		int[] ar = {2,4,5,10};
		System.out.println("The Current Array: "+Arrays.toString(ar));
		System.out.println("The first missing value: "+findMissing(ar));
		System.out.println("All the missing values: "+Arrays.toString(missingArrElements(ar)));
		System.out.println("Combining Whole values we get: "+Arrays.toString(wholeArray(ar)));
	}
	
	
	public static int findMissing(int[]ar) //Method1 for returning first missing value
	{
		for(int i = 0;i<ar.length-1;i++)
		{
			if(ar[i]==ar[i+1] || ar[i]+1==ar[i+1])
				continue;
			else
				return ar[i]+1;
		}
		return Integer.MIN_VALUE;
	}
	
	
	
	public static int[] missingArrElements(int[] ar) //Method2 for returning the array of missing values.
	{
		int[] res;
		int cnt=0;
		for(int i = 0;i<ar.length-1;i++) //Loop1 for finding the count of missing values.
		{
			if(ar[i]==ar[i+1] || ar[i]+1==ar[i+1])
				continue;
			else
			 cnt+=(ar[i+1]-ar[i]-1);
		}
		res = new int[cnt];
		for(int i = 0,k=0;i<ar.length-1;i++) //Loop2 for putting the missing values in new Array
		{
			if(ar[i]==ar[i+1] || ar[i]+1==ar[i+1])
				continue;
			else
			{
				for(int j = 1;j<(ar[i+1]-ar[i]);j++)
					if((ar[i]+j)==ar[i+1])
						break;
					else
						res[k++]=(ar[i]+j);
			}
		}
		return res;
	}
	
	public static int[] wholeArray(int[]ar)//Method3 for adding all the values into a new array
	{
		int[] res = new int[ar[ar.length-1]-ar[0]+1];
		int[] temp = missingArrElements(ar);
		res[res.length-1] = ar[ar.length-1];
		for(int i = 0,k=0,j=0; k < ar.length-1;i++) //To complex Shit....not gonna lie...
		{
			if(ar[k]==ar[k+1] || (ar[k]+1)==ar[k+1])
				res[i] = ar[k++];	
			else
			{
				res[i++] = ar[k++];
				while(temp[j]+1!=ar[k])
					res[i++] = temp[j++];
				res[i]=temp[j++];
			}		
		}
		return res;
				
	}

}



