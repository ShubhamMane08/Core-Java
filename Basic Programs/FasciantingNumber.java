class FasciantingNumber
{
	public static void main(String[] args) 
	{
		int num=327;
		String str= num+""+(num*2)+(num*3);
		boolean flag=true;
		//loop which start from 1 to 9

		for(char i='1';i<='9';i++)
		{
			int cnt=0;

			for(int j=0;j<str.length();j++)
			{
				char ch = str.charAt(j);
				if(ch==i)
				{
					cnt++;//
				}
				
			}
			if(cnt!=1) //if cnt of char is not equals to 1 then if executes
				{
					flag=false; // re inti the flag is cnt is not equals to 1
					break;// terminate the loop
				}
		}
		if(flag)
			{
				System.out.println(num+" is FasciantingNumber");
			}
			else 
			{
				System.out.println(num+" not FasciantingNumber");
			}

		
	}
}
