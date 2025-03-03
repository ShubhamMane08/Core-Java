//Error
import java.util.*;
class KeithNumber
{
	public static void main(String[] args)
	{
		int num=19;
		int dup=num;
		int len=0;
		int sum=0;
		boolean flag = true;

		for(int i =num;i>0;i/=10)
			len++;

		int [] arr= new int [len];

		for(int i = len-1; i>=0;i--)
		{
			int rem=num%10;
			arr[i]=rem;
			num/=10;
		}
		for(;;)
		{
			for(int i=0;i<len;i++)
				sum+=arr[i];
			for(int i =0;i<len;i++)
				arr[i-1]=arr[i];
			
			arr[len-1]=sum;
			if(dup==sum)
			{
				break;
			}
			sum=0;
		}
		if(flag)
		{
			System.out.println(dup+" is Keith Number..!!");
		}
		else
		{
			System.out.println(dup+" is not a Keith Number..!!");
		}	
	}
	
}