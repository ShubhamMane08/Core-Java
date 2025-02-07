import java.util.Scanner;
class Factorswithprime
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		int count=0;
		for(int i = 2; i<num;i++)
		{
			if(num%i==0)
			{
				count++;
				System.out.print(i+" ");
			}


		}
		System.out.println();
		System.out.print(count==0? num+" is a prime":num+" is not prime");
		
	}
}