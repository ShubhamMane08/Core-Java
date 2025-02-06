import java.util.Scanner;
class AreaofCircle
{
	public static void main(String[] args)
	{
		final double pie=22/7;
		Scanner sc = new Scanner(System.in);

		float r=sc.nextFloat();
		double area;
		System.out.print("Enter Radius of Circle :");
		area=pie*(r*r);
		System.out.println("The Area of Circle is :"+area+"sqcm");

	}
}