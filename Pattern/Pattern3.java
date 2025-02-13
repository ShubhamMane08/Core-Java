class Pattern3
{
	public static void main(String[] args) 
	{
		int n=4;
		for(int i =0 ; i<n;i++)
		{
			for (int j = 0 ; j<n;j++)
			{
				if(i==0 || j==0)
				{
					System.out.print("*"+" ");
				}
			}
			System.out.println() ;
		}
		
	}
	
}