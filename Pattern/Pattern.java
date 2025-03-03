//*
//* *
//* * *
//* * * *
//* * *
//* *
//*
class Pattern
{
	public static void main(String[] arg)
	{
		int rows=4, cols=4;
		for(int i=1;i<=rows;i++)
		{ 
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}				
				System.out.println();
		}
		for(int i= 1; i<=rows;i++)
		{
			for(int j=3;j>=i;j--)
			{
				System.out.print("* ");
			}
				System.out.println();
		}
	}
}