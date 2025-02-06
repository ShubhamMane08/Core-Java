import java.util.Scanner;
class If2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Do you come under the Reserved Category ?");

		boolean it=sc.nextBoolean();
		
		if(it)
		{
			System.out.println("Fill the Scholarship Form..!!");
		}
		System.out.println("Pay the Fees..!!");
	}
}
