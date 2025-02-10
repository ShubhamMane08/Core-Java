import java.util.Scanner;
class OddtoEven
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");

		int num = sc.nextInt();
		int sum=0;
		int temp=0;

		for(int i = num; i>0;i/=10)
		{
			int rem = i%10;

			if(rem==9)
			{
				rem+=0;
			}
			if(rem%2==1)
			{
				rem+=1;
			}
			sum+=rem*(Math.pow(10,temp++));

		}
		System.out.println(num+" : "+sum);
		
	}
	
}