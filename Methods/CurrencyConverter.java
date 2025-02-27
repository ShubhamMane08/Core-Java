import java.util.Scanner;
class CurrencyConverter
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Currency in Rupees : ");
		double rupee=sc.nextDouble();
		
		rupeetoDollar(rupee);
		
		
	}
	public static void rupeetoDollar(double rup)
	{
		double dollar = rup/87.15;
		System.out.println(dollar+"$");
		dollartoEuro(dollar);
		
	}
	public static void dollartoEuro(double dollar)
	{
		double euro=0.95*dollar;
		System.out.println(euro+"euro");
		eurotoDirham(euro);
		
	}
	public static void eurotoDirham(double euro)
	{
		double dirham=euro*3.67;
		System.out.println(dirham+" dirham");
		
	}


}