package TwoDimentionalArray;

import java.util.Scanner;
import java.util.Arrays;
public class singleline {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an Element : ");
		int [][]ar= new int [3][3];
		
		for(int i =0; i<ar.length;i++)
		{
			for(int j=0; j<ar[i].length;j++)
			{
				ar[i][j]=sc.nextInt();
			
			}
			System.out.println();
		}
	
		System.out.println(Arrays.deepToString(ar));
	}

}
