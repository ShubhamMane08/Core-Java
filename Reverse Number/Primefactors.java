import java.util.Scanner;
class Primefactors
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();

		for (int  i = 2; i<num;i++)
		{ 
				   if(num%i==0)
				 {
				  	int count=0;
				  	for(int j=1;j<=i;j++)
				  	{

				  		if(i%j==0)
				  		{
				  			count++;
				  		}
				  	}
				  	// System.out.println(i+" : "+ count);
				  	if(count==2)
				  	{
				  		System.out.println(i+" ");
				  	}
				 }	
				

		}
		
	}
}