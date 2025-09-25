package TwoDimentionalArray;

import java.util.Scanner;
public class SumofMatrix {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int [][]arr = new int [3][3];
		System.out.println("Enter the Elements : ");
		 int sum=0;
		for(int i = 0; i<arr.length;i++)
		{
			for(int j=0; j<arr[i].length;j++)
			{
				arr[i][j]=sc.nextInt();
			}
			System.out.println();
			
		}
		
		for(int i = 0 ; i<arr.length;i++)
		{
			for(int j = 0; j< arr[i].length;j++)
			{
				sum+=arr[i][j];
			}
			System.out.println();
		}
		
		System.out.println("Sum of the given martix is : "+sum);
		
		
		
	}

}
