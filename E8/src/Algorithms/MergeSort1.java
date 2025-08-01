package Algorithms;
import java.util.Arrays;
public class MergeSort1 {
	public static void main(String[] args) {
		int[]a = {1,3,5,7,2,4,6,8};
		System.out.println(Arrays.toString(combine(a,0,a.length-1)));//start = 0 and end = 7
	}
	
	 public static int[] combine(int[]a,int start,int end)
	 {
		 int i=0,j=((start+end)/2)+1,k=0;//k = 0,1,2,3,4,5,6,7,8
		 int[] res = new int[a.length]; 
		 while(i<=((start+end)/2)&&j<=end)
		 {
			 if(a[i]<=a[j])//i = 0,1,2,3,4           j=4,5,6,7,8
				 res[k++]=a[i++];//[1,2,3,4,5,6,7,8]
			 else if(a[i]>a[j])
				 res[k++]=a[j++];
		 }
		 
		 while(i<=(start+end)/2)
		 {
			 res[k++]=a[i++];
		 }
		 while(j<=end)
			 res[k++]=a[j++];
		 return res;
	 }
}
