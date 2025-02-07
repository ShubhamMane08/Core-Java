import java.util.Scanner;
class squareroot
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num = sc.nextInt();
		int sqrt=0;

		for(int i=1; i<=num/2;i++)
		{
			if(i*i==num)
			{
				sqrt=i;
				break;
			}
		}
		if(sqrt!=0)
		{
			System.out.println("SquareRoot : "+sqrt);
		}
		else 
		{
			System.out.println(num+" is not perfect square");
		}		
	}
}