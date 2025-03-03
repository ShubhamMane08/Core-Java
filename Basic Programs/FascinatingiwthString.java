class FascinatingiwthString
{
	public static void main(String[] args) 
	{
		int num=327;
		int dup=num;
		boolean flag=true;
		for(int i =2; i<=3;i++)
		{
			num=(num*1000)+(dup*i);
		}
		for(int i=1;i<=9;i++)
		{
			int cnt=0;

			for(int j=num;j>0;j/=10)
			{
				int rem=j%10;
				if(i==rem)
				{
					cnt++;
				}

			}
			if(cnt!=1)
			{
				flag=false;
				break;
			}

		}
		System.out.println(flag? dup+" is a Fascinating Number..!" 
							:dup+" is not a Fascinating Number..!");
		
	}
	
}