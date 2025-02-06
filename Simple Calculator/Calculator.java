import java.util.Scanner;
class Calculator
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Number : ");
		float num1=sc.nextFloat();
		System.out.print("Enter Second Number: ");
		float num2=sc.nextFloat();

		System.out.print("Select Operand : ");
		char op=sc.next().charAt(0);

		float output=( (op=='+')?(num1 + num2):
					 ( (op=='-')?(num1-num2):
					 ( (op=='*')?(num1*num2):
					 ( (op=='/')?(num1/num2):
					 ( (op=='%')?(num1%num2):(0.0001f) )  ) ) ));
		if(!(output==0.0001F))
		{
			System.out.println(output);
		}

	
	}
	
}