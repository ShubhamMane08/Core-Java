package Algorithms;
import java.util.Arrays;
public class MergeSort {
	 public static void main(String[] args) {
		int[] ar = {2,1,5,7,3,-1,-2}; 
//		 int[] ar = {1,3,5,7,2,4,6,8};
		 mergeSort(ar,0,ar.length-1);
		 System.out.println(Arrays.toString(ar));
	}
	 public static void mergeSort(int[]ar, int start,int end)
	 {
		 if(start<end)
		 {
			 int mid = (start+end)/2;
			 mergeSort(ar,start,mid);
			 mergeSort(ar,mid+1,end);
			 merge(ar,start,end);
		 }
	 }
	 public static void merge(int[] ar,int start , int end)
	 {
		 int[] res = new int[ar.length];
		 int i=start,j = ((start+end)/2)+1,k=start;
		 System.out.println(start+" "+end);
		 while(i<=((start+end))/2&&j<=end)
		 {
			 if(ar[i]<=ar[j])
				 res[k++]=ar[i++];
			 else if(ar[i]>ar[j])
				 res[k++]=ar[j++];
		 }
		
		 while(i<=(start+end)/2)
			 res[k++]=ar[i++];
		 while(j<=end)
			 res[k++]=ar[j++];
		 for(i = start;i<=end;i++)
		 {
			 ar[i]=res[i];
		 }
	 }
}
