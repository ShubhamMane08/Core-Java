//1
//2 6 
//3 7 10
//4 8 11 13




class NumberPattern
{
	public static void main(String[] args) {
		int n =5;
		for(int i =1;i<n;i++)
		{
			int count=i;
			for(int j = 1;j<n;j++)
			{
				if(j>i)
				{
					System.out.print(" "+" ");

				}
				else 
				{
					System.out.print(count+" ");
					count=count + n-j;

				}

			}
			System.out.println();
		}

	}
}