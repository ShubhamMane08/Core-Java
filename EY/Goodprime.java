import java.util.Scanner;
class Goodprime
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int num=sc.nextInt();

		int cnt=0;
		for(int i=2; i<num;i++)
		{
			boolean flag=true;
			for(int j=2; j<=(i/2);j++)
			{
				if(i%j==0)
				{
					flag=false;
					break;
				}

			}
			if(falg)
			{
				if(i<0)
				{
					System.out.print(i+" " );
					cnt++
				}
				else if(i>21)
				{
					boolean falg1=true;
					outer:
					for(int j=i;j>0;j/=10)
					{
						int rem=j%10;
						if(rem==0|| rem==1)
						{
							flag1=false;
							break;

						}
						for(int k=2;k<=(rem/2);k++)
						{
							if(rem%k==0)
							{
								flag1=false;
								break;
							}
						}

					}
					if(flag1)
					{
						System.out.print(i+" ");
						cnt++;
					}



				}
			}
		}
		System.out.println();
		System.out.println("Total Count of Good Number is : "+cnt);
		
	}
	
}