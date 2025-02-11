import java.util.Scanner;
class Rajasoft
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num= sc.nextInt();
		int dup=num;
		int pprime=0;
		int nprime=0;

		for(int i = num-1;i>=2;i--)
		{
			
			boolean flag = true;

			for(int j = 2 ; j<i;j++)
			{
				if(i%j==0)
				{
					flag = false; 
					break;
				}
			}
			if(flag)
			{
				pprime=i;
				break;
			}
		}

		for(int i =num+1 ; i>=2;i++)
		{
			boolean flag=true;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag=false;
					break;
				}

			}
			if(flag)
			{
				nprime=i;
				break;
			}
			
		}
		System.out.println(pprime+" "+dup+" "+nprime);


		
	}
}