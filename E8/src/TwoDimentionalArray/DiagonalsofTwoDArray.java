package TwoDimentionalArray;

import java.util.Arrays;
import java.util.Scanner;

public class DiagonalsofTwoDArray {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int [][]a=new int [3][3]; 
		System.out.println("Enter the elements : ");
		
		for(int i=0; i<a.length;i++)
		{
			for(int j =0; j<a[i].length;j++)
			{
				if( i==0|| j==0)
				{
					a[i][j]=sc.nextInt();
				}
			}
			System.out.println();
			System.out.println(Arrays.toString(a[i]));
		}
		
	
	}

}
