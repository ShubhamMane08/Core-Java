class LoopingExample1
{
	public static void main(String[] args)
	{
		//asci
		for(char ch=0;ch<=127;ch++)
		{

			if(ch>=65 && ch<=90)
			{
				continue;
			}
			System.out.print(ch+" ");
		}
		
	}
}
