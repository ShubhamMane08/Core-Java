package Algorithms;
import java.util.Arrays;
public class QuickSort {
	public static void main(String[] args) {
		int[] ar = {-1,1,10,9,1,2,3};
		System.out.println("before QuickSort: "+Arrays.toString(ar));
		quickSort(ar,0,ar.length-1);
		System.out.println("After QuickSort: "+Arrays.toString(ar));
	}
	
	public static void quickSort(int[]ar,int start,int end) {
		if(start<end)
		{
			int partition = sideArr(ar,start,end);
			quickSort(ar,start,partition-1);
			quickSort(ar,partition+1,end);
		}
	}
	
	public static int sideArr(int[]ar,int start,int end)//[-1,1,10,9,1,2,3] //0  //6
	{
		int pivot = ar[start];//-1
		int i = start+1,j=end;// i = 0    j = 6
		while(i<=j)
		{
			if(ar[i]<pivot)
				i++;
			else if(ar[j]>=pivot)
				j--;
			else if(i<=j)
				swap(ar,i++,j--);
		}
		swap(ar,start,j);
		return j;
	}
	public static void swap(int []ar , int i,int j)
	{
		int temp = ar[i];
		ar[i] = ar[j];
		ar[j] = temp;
	}
}
