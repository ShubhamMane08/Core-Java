import java.util.Scanner;
class GoodPrimeEY
{
	public static void main(String[] args) {
		System.out.print("Enter the Range : ");
		int num = new Scanner(System.in).nextInt();
		int cnt=0;
		for(int i=2;i<num;i++)
		{
			boolean flag = true;
			for(int j=2;j<=(i/2);j++)
			{
				if(i%j==0)
					{
						flag = false;
						break;
					}
			}
			if(flag)
			{
				if(i<10)
				{
					System.out.print(i+" ");
					cnt++;
				}
				else if(i>21)
				{
					boolean flag1 = true;
					outer :
					for(int j = i;j>0;j/=10)
					{
						int rem = j%10;
						if(rem==0||rem==1)
						{
							flag1=false;
							break ;
						}
						for(int k=2;k<=(rem/2);k++)
						{
							if(rem%k==0)
								{
									flag1 = false;
									break ;
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
		System.out.println("Total Count of Good Numbers : "+cnt);
	}
}