class ForExample
{
	public static void main(String[] args)
	{

		for(int i=1;i<=10;i++)
		{
			System.out.print(i+" ");
		}
		

		System.out.println();

		for(char ch='A'; ch<='Z'; ch++)
		{
			System.out.print(ch+" ");

		}
		System.out.println();

		for(char ch='Z'; ch<='A'; ch--)
		{
			System.out.print(ch+" ");
		}
		System.out.println();

		for(char d='0';d<='9'; d++)
		{
			System.out.print(d+" ");
		}
		System.out.println();
		for (int i =0;i<=127 ;i++ )
		{
			System.out.print(i+": "+((char)i)+" ");
			
		}
	}
}