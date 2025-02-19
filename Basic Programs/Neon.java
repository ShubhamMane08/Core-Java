import java.util.Scanner;
class Neon
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int num= sc.nextInt();
		int dup=num;

		int temp=num*num;
		int sum=0;

		for(int i=temp;i>0;i/=10)
		{
			temp=i%10;
			sum+=temp;
		
		}
			if(sum==dup)
			{
				System.out.println(num+" is Neon Number");
			}
			else 
			{
				System.out.println(num+" is not a Neon Number..!!");

			}
		
	}
	
}