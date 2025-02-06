import java.util.Scanner;
class Tip
{
	public static void main (String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Bill : ");

		float bill= sc.nextFloat();
		System.out.print("Enter Tip rate :");
		float tipRate= sc.nextFloat();
		float tipAmount =(tipRate*bill)/100;
		
		float totalBill=bill+tipAmount;


		System.out.println("Total Bill is : "+totalBill);
		System.out.println("Tip added is : "+tipAmount);

	}
}