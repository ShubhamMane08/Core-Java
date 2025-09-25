package Algorithms;

import java.util.Arrays;
public class SingleArrayMergeSort {
	
	public static void main(String[] args) {
		
		int []a= {3,1,-3,10,5,15};
		System.out.println(Arrays.toString(a));
		mergeSort(a,0,a.length-1);
		System.out.println(Arrays.toString(a));
	}
	
	public static void mergeSort(int[] a,int start,int end)// 0 ,1
	{
		if(start<end)
		{
			int mid = (start+end)/2;
			mergeSort(a,start,mid);// b,0
			mergeSort(a,mid+1,end);// f,1
			mergeSingle(a,start,end);
		}
	}
	
	
	
	public static void mergeSingle(int []a,int start,int end)//a ,0 ,1
	{
		int i=start; // i=0
		int j=((start+end)/2)+1;//j=1
		int k=start;
		int ans[]=new int[a.length]; //[1, , , , , ]
		while(i<=((start+end)/2) && j<=end)
		{
			if(a[i]<=a[j])
			{
				ans[k++]=a[i++];
			}
			else if(a[i]>a[j])
			{
				ans[k++]=a[j++];
			}
		}
		while(i<=(start+end)/2)
		{
			ans[k++]=a[i++];
		}
		while(j<=end)
		{
			ans[k++]=a[j++];
		}
		for(i=start;i<=end;i++)
			a[i]=ans[i];
	}

}


////
//[3,1,-3]    [10,5,15]
//[3,1][-3]    [10,5][15]
//				[10][5][15]
//						[5,10][15]
//								[5,10,15]
//		
//[3] [1] [-3] 
//		
//[1,3] [-3]
//		[-3,1,3]
//				[-3,1,3,5,10,15]
