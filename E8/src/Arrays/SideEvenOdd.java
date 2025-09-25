package Arrays;

import java.util.Arrays;

public class SideEvenOdd {
	public static void main(String[] args) {
		int[] ar= {1,0,2,7,3,0,2,4};
		sidePosi(ar);
		System.out.println(Arrays.toString(ar));
	}
	public static void sidePosi(int[]ar)
	{
		int f = 0;
		int l = ar.length-1;
		while(f<l)
		{
			if(ar[f]%2==1)
				f++;
			else if(ar[l]%2==0)
				l--;
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
