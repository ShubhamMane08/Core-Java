package Algorithms;
import java.util.Arrays;
public class TwoArraySort {
	 public static void main(String[] args) {
		int[] a = {1,2,3,10,25};//i=5
		int[] b= {10,20,30,40,50,60,70};//j=2,3,4,5,6,7
		System.out.println(Arrays.toString(combine(a,b)));
	}
	 public static int[] combine(int[]a,int[]b)
	 {
		 int i=0,j=0,k=0;
		 int[] res = new int[a.length+b.length]; 
		 while(i<a.length&&j<b.length)
		 {
			 if(a[i]<=b[j])
				 res[k++]=a[i++];//[1,2,3,10,10,20,25,30,40,50,60,70]
			 else if(a[i]>b[j])
				 res[k++]=b[j++];
		 }
		 while(i<a.length)
		 {
			 res[k++]=a[i++];
		 }
		 while(j<b.length)
			 res[k++]=b[j++];
		 return res;
	 }
	 
}
