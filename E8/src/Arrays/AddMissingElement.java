package Arrays;

import java.util.Arrays;

public class AddMissingElement {
	public static void main(String[] args) {
		int[] ar = {2,5};
		System.out.println(Arrays.toString(addMissing(ar)));
	}
	
	public static int[] addMissing(int[]ar)
	{
		int[] res = new int[ar[ar.length-1]-ar[0]+1];
		res[res.length-1]= ar[ar.length-1];
		for(int i = 0,j=0;i<ar.length-1;i++)
		{
			if(ar[i]==ar[i+1] || ar[i]+1==ar[i+1])
				res[j++]=ar[i];
				else {
					res[j++] = ar[i];
					for(int k =1;ar[i]+k<ar[i+1];k++)
					{
						res[j++] = ar[i]+k;
					}
				}
		}
		return res;
	}

}
