import java.util.Scanner;
class BinarytoDecimal
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a binary number : ");
		int num=sc.nextInt();
		int dup=num;
		int dec = 0, power=0;

		while(num>0)
		{
			int rem=num%10;
			dec+=rem*Math.pow(2,power);
			num/=10;
			power++;
		}
		System.out.println(dup+" of Decimal is : "+dec);

		
	}
}
