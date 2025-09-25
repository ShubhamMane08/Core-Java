package Pattern;

public class Diamond {
	
	public static void main(String[] args) {
		
		int n = 7;
		///    t   t
		for(int i=1;i<=n;i++)
		{
			// 7-1 t   j=2  
			for(int j=1;j<=(n-i);j++)
			{
				//s
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("* ");
			}
			System.out.println();

		}
		for(int i=7;i>=1;i--)
		{
			for(int j=1;j<=(n-i);j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("* ");
			}
			System.out.println();

		}
	}

}
