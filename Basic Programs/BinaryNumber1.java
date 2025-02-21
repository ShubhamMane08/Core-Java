import java.util.Scanner;
class BinaryNumber1
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num = sc.nextInt();
		String bin=Integer.toBinaryString(num);
		System.out.println(bin);		
	}
	
}