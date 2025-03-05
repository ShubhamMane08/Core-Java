class PronicNumber
{
	public static void main(String[] args) 
	{
		System.out.println(isPronic(30));	
	}
	public static boolean isPronic(int num)
	{
		for(int i=1;;i++)
		{
			if(i*(i+1)==num)
			{
				return true;
			}
			else if(i*(i+1)>num)
			{
				return false;
			}
		}
	}
}