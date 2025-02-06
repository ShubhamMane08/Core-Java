import java.util.Scanner;
class Result
{
	public static void main(String [] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter marks :");
		float marks = sc.nextFloat();
		float res= (marks/600)*100;


		System.out.println( (res>=35)?( (res>=75)?("A Grade"+res+"%"):( (res>=60)?("B Grade"+res+"%"):(" C Grade"+res+"%") ) ):("Fail") );


	}
}