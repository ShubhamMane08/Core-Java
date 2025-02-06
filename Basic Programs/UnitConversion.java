import java.util.Scanner;

class UnitConversion
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the Weight in Pounds : ");
		double pound= sc.nextDouble();
		double dup=pound;
		 
		 double output = pound*0.454;

		System.out.println("The given weight in Pounds : "+dup+"pounds is :"+output);


	}
}