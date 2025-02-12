import java.util.Scanner;
class CountDgt
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");

		long num = sc.nextLong();
		int max = 0,dgt = 0,min=9;
		
		for(int i=0;i<=9;i++)	
		{
			int cnt = 0;
			for(long j=num;j>0;j/=10)
			{
				// System.out.println(i+" "+j%10);

				if(i==(int)(j%10))
				cnt++;
			}
			// System.out.println(cnt);
			if(cnt<min && cnt!=0)
			{
				min=cnt;
				 dgt =i;
				
			}
			if(cnt>max)
			{
				max=cnt;
				dgt=i;
			}
		}
		System.out.println("Digit : "+dgt+" & min Count is : "+min);System.out.println("Digit : "+dgt+" Max count is : "+max);
		

	}
	
}