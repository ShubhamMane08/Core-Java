import java.util.Scanner;
class CurrencyConverter
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("     CURRENCY CONVERTER ");
		System.out.println();
		System.out.print("Enter the amount(INR) : ");
		float inr = sc.nextFloat();
		System.out.println();


		System.out.println("LIST OF CURRENCY");
		System.out.println("1.USD");
		System.out.println("2.EUR");
		System.out.println("3.GBP");
		System.out.println("4.PKR");
		System.out.println("5.YEN");
		System.out.println("6.NPR");
		System.out.println();
		System.out.print("Select any one: ");



		String curr=sc.next().toUpperCase();
		float conCur;

		if(curr.equals("USD"))
		{
			conCur=inr/86.56f;
			System.out.println(inr+" INR = "+conCur+" USD");
		}
		else if(curr.equals("EUR"))
		{
			conCur=inr/90.2642f;
			System.out.println(inr+" INR = "+conCur+" EUR");

		}
		else if(curr.equals("GBP"))
		{
			conCur=inr/107.652f;
			System.out.println(inr+" INR = "+conCur+" GBP");
		}
		else if(curr.equals("PKR"))
		{
			conCur=inr/0.310624f;
			System.out.println(inr+" INR = "+conCur+" PKR");
		}
		else if(curr.equals("YEN"))
		{
			conCur= inr/0.557060f;
			System.out.println(inr+" INR = "+conCur+" YEN");
		}
		else if(curr.equals("NPR"))
		{
			conCur=inr/0.624707f;
			System.out.println(inr+" INR = "+conCur+" NPR");
		}
		else 
		{
			System.out.println("INVALID");

		}



	}
	
}