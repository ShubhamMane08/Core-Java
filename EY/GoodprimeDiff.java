import java.util.Scanner;
class GoodprimeDiff
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Range : ");
		int range= sc.nextInt();
		
		for(int i=1;i<=range;i++)
		{
			int num=i;
			boolean flag= true;
			if(num<2)
			{flag=false;}
			for(int j=2;j<num;j++)
			{
				if(num%j==0)
				{
					flag=false;
					break;

				}
			}
			if(flag)
			{
				int prime=num;
				if(prime>9)
				{
					boolean flag1= true;
					outerloop:
					for(int k=prime;k>0;k/=10)
					{
						int dgt= k%10;
						if(dgt<2)
						{
							flag1=false;
							break outerloop;
						}
						for(int m=2;m<dgt;m++)
						{
							if(dgt%m==0)
							{
								flag1=false;
								break outerloop;
							}

						}

					}
					if(flag1)
						{
							System.out.print(prime+" ");
						}
						else 
						{
							System.out.print(prime+" ");
						}
				}
			}
		}


		
	}
	
}