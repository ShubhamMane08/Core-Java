import java.util.Scanner;
class EmirpNumber
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num= sc.nextInt();
		int den=2;
		int rev=0;


		while (den<=num/2)
		{
			if(num%den==0)
			{
				break;
			}
			den++;
		}
		if(num>den)
		{
			for(int i=num;i>0;i/=10)
			{

				rev=rev*10+(i%10);

			}
			if(rev==num)
			{
				System.out.println("This is not Emirp Number..!!");
				System.exit(0);
			}

			while(den<=rev/2)
			{
				if(rev%den==0)
				{
					break;
				}
				den++;
			}
			if(den>rev/2)
			{
				System.out.println(rev+" Emirp Number");
			}
			else 
			{
				System.out.println("Not Emirp");
			}


		}
		else
		{
			System.out.println("Not Prime");
		}
		
	}
	
}