import java.util.Scanner;
class SpyNumber
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num=sc.nextInt();
		int sum=0;
		int pod=1;
		
		
		for(int i = num; i>0;i/=10)
		{
			int rem=i%10;
			 sum+=rem;
			 pod*=rem;
			
		}
		System.out.println(sum);


		if(sum==pod)
		{
			System.out.println(num +" is a Spy number..!!");

		}
		else
		{
			System.out.println(num+" is not a Spy number..!!");
		}
		
	}

}
