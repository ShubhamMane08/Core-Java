import java.util.Scanner;
class MakenumberPrime
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");

		int num= sc.nextInt();
		boolean flag = true;

		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				flage=false;
				num++;
				i=2;			
			}
		}
		System.out.println("The Number "+num+" is a prime");



		
	}
}