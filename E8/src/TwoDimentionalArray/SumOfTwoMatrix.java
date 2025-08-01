package TwoDimentionalArray;

import java.util.Arrays;
public class SumOfTwoMatrix {
	
	public static void main(String[] args) {
		
		
		int [][]a= { {1,2,3},
					 {4,5,6},
					 {7,8,9},
					};
		int [][]b= { {10,11,12},
					 {13,14,15},
					 {16,17,18},
					};
		
		if(a.length==b.length)
		{
			int i;
			
			for(i=0;i<a.length;i++)
			{
				if(a[i].length!=b[i].length)
				{
					break;
					
				}
				
			}
			if(i==a.length)
			{
				int [][]c = new int [a.length][a[0].length];
				
				for(int j=0;j<a.length;j++)
				{
					for(int j1 = 0;j1<a[j].length;j1++)
					{
						c[j][j1]= a[j][j1]+b[j][j1];
					}
				}
				for(int j=0;j<c.length;j++)
				{
					System.out.println(Arrays.toString(c[j]));
				}
			}
			
			
		}
	}

}
