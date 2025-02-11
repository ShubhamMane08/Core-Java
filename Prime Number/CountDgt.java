class CountDgt
{
	public static void main(String[] args) 
	{
		long num = 1214314131657248l;
		int max = 0,dgt = 0;
		
		for(int i=0;i<=9;i++)	
		{
			int cnt = 0;
			for(long j=num;j>0;j/=10)
			{
				if(i==(int)(j%10))
				cnt++;
			}
			if(cnt>max)
			{
				max=cnt;
				 dgt =i;
				
			}
		}
		System.out.println(" max Count is : "+i);

	}
	
}