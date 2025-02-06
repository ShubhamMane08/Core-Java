class Looping2 
{
	public static void main(String[] args) 
	{
		char ch='a', CH='A';
		
		while(ch>='a' && ch<='z')
		{

		  System.out.print(ch+" ");
		  ch++;
		}
		System.out.println();
		while(CH>='A' && CH<='Z')
		{
			System.out.print(CH+" ");
			CH++;
		}
		System.out.println();

		int i=1;
		while(i>=1 && i<=100)
		{
			System.out.print(i+" ");
			i++;
		}


	}
}
