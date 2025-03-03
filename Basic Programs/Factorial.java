
import java.util.Scanner;
class Factorial
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num=sc.nextInt();// 5

		long fact=1;//1
		
					//6<=5(false)
					//5<=5(true) 5(6)
					//4<=5(true) 4(5)
					//3<=5(true) 3(4)
					//2<=5(true) 2(3)
			//1      1<=5(true)  1(2)
		for(int i = 1; i <= num; i++)
		{
			//fact (1)= 1*1   -> 1
			//fact (1)= 1*2   -> 2
			//fact (2)= 2*3   ->6
			//fact (6)= 6*4   ->24
			//fact (24)= 24*5 ->120   
			//fact ()
			fact=fact*i;

		}

		System.out.println("Factorial of "+num+" is : " +fact);
		
	}

}