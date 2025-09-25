package Arrays;

import java.util.Arrays;

public class MakeEvenArray {
	public static void main(String[] args) {
		int[] ar = {-1,-2,3,5,1,-4};
		ConvertPositive.convertPositive(ar);
		makeEvenArr(ar);
		System.out.println(Arrays.toString(ar));
	}
	public static void makeEvenArr(int[] ar)
	{
		for(int i = 0;i<ar.length;i++)
			if(ar[i]%2==1)
				ar[i]=++ar[i];
	}

}
