import java.util.Scanner;
class LeapYear 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print(" Enter the Year : ");
		int year=sc.nextInt();
			//2000       //2000 false
			//2004                       //true 
		if((year%4==0 && year%100!=0) || (year%400==0 && year%100!=0))
		{
			System.out.println(year+" is a Leap Year");
			
		}
		else
		{
			System.out.println(year+" is not a Leap Year");
		}

	}
}
