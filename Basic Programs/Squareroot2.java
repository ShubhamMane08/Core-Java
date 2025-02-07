import java.util.Scanner;
class Squareroot2
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num = sc.nextInt();
		int sqrt=0;
		boolean flag=false;

		for(int i=1; i<=num ; i++)
		{
			if(i*i==num)
			{
				System.out.println(num+" is a perfect Squreroot for "+num);
			}
			if(i*i>num)
			{
				break;
			}
		}
		if(!flag)
			System.out.println(num+" is not having a perfect Square Root.");


		
	}
}