import java.util.Scanner;
class ProductofDigits
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter four digits number : ");

		int num=sc.nextInt();
		int pod = 0;
		int rem;
		rem=num%10;//1234 ->4
		pod=pod+rem;//0+4
		num=num/10;//123

		rem=num%10;//123->3
		pod=pod*rem;//4*3->12
		num=num/10;//12

		rem=num%10;//2
		pod = pod*rem;//24
		num=num/10;//12->1

		rem=num%10;//1	
		pod=pod*rem;//24*1

		System.out.println(pod);

	}
}