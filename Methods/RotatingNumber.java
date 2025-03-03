import java.util.Scanner;
class RotatingNumber
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num=sc.nextInt();

		System.out.println(rotate(num));
	}
	public static int rotate(int num)
	{
		int last=num%10;
		num/=10;
		int ct = count(num);
		return last*pow(10,ct)+num;
		//return (num%10)*power(10,(count(num)-1))+num/10)
	}
	public static int count(int num)
	{
		int ct=0;
		while(num!=0)
		{
			num/=10;
			ct++;
		}
		return ct;
	}
	public static int pow(int digit,int ct)
	{
		int pow=1;
		for(int i=0;i<ct;i++)
		{
			pow*=digit;
		}
		return pow;
	}
	
}