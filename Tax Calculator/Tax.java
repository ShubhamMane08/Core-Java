import java.util.Scanner;
class Tax 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Salary : ");
		double salary = sc.nextDouble();

		if( salary>=0 && salary<=1200000)
		{
			System.out.println("Aur Kaammau..!!");
		}
		else if (salary>130000 && salary<=1600000)
		{
			System.out.println("You need to pay with the 5% tax "+salary*0.5);
		}
		else if(salary>1600000 && salary<2000000)
		{
			System.out.println("You need to pay 10% of Tax "+salary*0.1);
		}
		else if(salary>2100000 && salary<2400000)
		{
			System.out.println("You need to pay 15% of Tax "+salary*1.5);
		}
		else if(salary>2500000 && salary<300000)
		{
			System.out.println("You need to pay 20% of Tax "+salary*2.0);
		}
		else if (salary>3100000)
		{
			System.out.println("You need to pay 30% of Tax "+salary*3.0);
		}
		else
		{
			System.out.println("INVALID INPUT");
		}



	}
}
