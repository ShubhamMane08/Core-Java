import java.util.Scanner;
class sumofDigitsloop
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any Digit : ");

		int num=sc.nextInt();//123
		int dup=num;

		int sum=0;

			 //123->(true)
			// 12->(true)
			//1->(true)
			//0->false
		while(num>0)
		{
			int rem=num%10; //rem=123%10->3 12->2->1

			// num/=10;//123/10->12 ->1->0
			if(rem%2==0)
			{
			  sum+=rem;
			  

			}
			 num/=10;

		}
		System.out.println(sum);


		
	}
}