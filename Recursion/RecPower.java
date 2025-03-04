import java.util.Scanner;
class RecPower
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the base : ");
		int base = sc.nextInt();
		System.out.print("Enter the raise : ");
		int raise= sc.nextInt();
		System.out.println(power(base,raise));
		
	}
	public static int power(int base, int raise)
	{
		if(raise==0)
		{
			return 1;
		}
		return base*power(base,raise-1);
	}
}