class Triangle15
{
	public static void main(String[] args) 
	{
		int num=4;
		int n=7;
		int m=-1;
		for(int i=1;i<=num;i++)
		{
			int temp=i;
			System.out.print(temp+" ");
			for(int j=2;j<=i;j++)
			{
				if(j%2==0)
				{
					temp+=n;
					System.out.print(temp+" ");
				}
				else 
				{
					temp+=m;
					System.out.print(temp+" ");
				}			
			}
			System.out.println();
			n -=2;
			m +=2;
			
		}


		
	}

	
}