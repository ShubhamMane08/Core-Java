import java.util.Scanner;
class Cylinder
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius of Cylinder : ");
		int radius = sc.nextInt();

		System.out.println("Enter Height of the Cylinder : ");
		int height=sc.nextInt();

		final double pie=3.14;
		double volume=pie *(radius*radius)*height;
		double area =2*pie*radius*(radius+height);

		System.out.println("Area of Cylinder is : "+area);
		System.out.println("Volume of Cylinder is :"+volume);

	}
}