class Triangle12
{
	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=(5-i);j++)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=5;j++)
			{
				if(i==5|| j==1 || i==j)
				 System.out.print("* ");
				else 
					System.out.print("  ");

			}
			System.out.println();
		}
	}
}