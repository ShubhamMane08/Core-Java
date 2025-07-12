package Arrays;

import java.util.Arrays;

public class SidePositive {

	public static void main(String[] args) {
		int[] ar= {1,-2,3,-5,4,-2,-1,-4};
		sidePosi(ar);
		System.out.println(Arrays.toString(ar));
	}
	public static void sidePosi(int[]ar)
	{
		int f = 0;
		int l = ar.length-1;
		while(f<l)
		{
			if(ar[l]>=0)
				l--;
			else if(ar[f]<0)
				f++;
			else {
				swap(ar,f++,l--);
			}
		}
	}
	public static void swap(int[] ar,int a,int b)
	{
		int temp = ar[a];
		ar[a] = ar[b];
		ar[b]=temp;
	}
}
