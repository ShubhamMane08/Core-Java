import java.util.Scanner;
class TechNumber
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num=sc.nextInt();
		int len=0,div=1;
		for(int i=num;i>0;i/=10)
			len++;

		if(len%2==0)
		{
			for(int i =1;i<=(len/2);i++)
			{
				div*=10;
			}
			int sum=(num/div)+(num%div);
			int sqrt=sum*sum;
			System.out.println((sqrt==num)?(num+" is a Tech Number "):(num+ " is not a Tech Number"));
		}
		else 
		{
			System.out.println(num+" is not a tech number");
		}


		
	}
	
}