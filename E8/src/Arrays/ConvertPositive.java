package Arrays;

import java.util.Arrays;

public class ConvertPositive {

	public static void main(String[] args) {
		int[] ar = {-1,-2,3,5,1,-4};
		convertPositiveArr(ar);
		System.out.println(Arrays.toString(ar));
	}
	public static void convertPositive(int[] ar)
	{
		for(int i = 0;i<ar.length;i++)
			if(ar[i]<0)
				ar[i]=Math.abs(ar[i]);
	}
	public static void convertPositiveArr(int[] ar)
	{
		int f=0;
		int l = ar.length-1;
		while(f<l)
		{
			ar[f]=Math.abs(ar[f]);
			ar[l]=Math.abs(ar[l]);
			f++;
			l--;
		}
		ar[f] = Math.abs(ar[f]);
	}
}
