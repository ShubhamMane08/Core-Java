class Mystry 
{
	public static void main(String [] args)
	{
		for(int i = 10;i<=1000;i++)
		{
			if(isMystry(i))
				System.out.print(i+" ");
		}
		
	}
	public static boolean isMystry(int num)
	{
		if(num<10)
			return true;
		else{
			for(int i = 1;;i++)
			{
				//System.out.println(i+" "+reverse(i,0)+" "+num); // for checking the sum of number and its reverse.
				if(i+reverse(i,0)==num)
					return true;
				else if(i+reverse(i,0)>num)
					return false;
			}
		}
		
	}
	public static int reverse(int num,int temp)
	{
		if(num==0)
			return temp;
		else
			return reverse(num/10,temp=temp*10+(num%10));
	}
}