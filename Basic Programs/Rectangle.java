import java.util.Scanner;

class Rectangle
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Width of Rectangle: ");
		float width= sc.nextFloat();
		System.out.print("Enter Height of Reactangle: ");

		float height= sc.nextFloat();

		float area = width*height;
		System.out.println("Area of Rectangle is : "+area);
	}
}