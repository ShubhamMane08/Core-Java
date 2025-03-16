class ForExample
{
	public static void main(String[] args)
	{
			//1  true     1(2)
			//2  true     2(3)
		    //3 true      3(4)
			//4 true      4(5)
			//5 true      5(6)
			//6 true 	  6(7)
			//7 true      7(8)
			//8 true 	  8(9)
			//9 true  	  9(10)
			//10 true 	  10(11)
			//11 false
		for(int i=1;i<=10;i++)
		{
			//1 2 3 4 5 6 7 8 9 10 
			System.out.print(i+" ");
		}
		
		//1 2 3 4 5 6 7 8 9 10 
		//|

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