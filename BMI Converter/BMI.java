import java.util.Scanner;
class BMI
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Weight in Pounds : ");
		double wt=sc.nextDouble();
		System.out.print("Enter a Height in inches : ");
		double ht=sc.nextDouble();

		double weight = wt*0.45359237;   
		double height=ht*0.0254;

		double bmi = weight/(height*height);
		System.out.println("BMI is :"+bmi);

	}
}