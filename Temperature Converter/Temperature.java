import java.util.Scanner;
class Temperature
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Temperature in Degree Celsius :");
		int tempDeg=sc.nextInt();
		System.out.println();
		System.out.println("Select Option : ");
		System.out.println("1.Feharanet");
		System.out.println("2.Kelvin");
		System.out.println("3.Rankine");

		int opt=sc.nextInt();

		double feh,kel,rankine;
		
		switch(opt)
		{
			case 1 :
				{
					 feh = ((tempDeg*9.0/5.0)+32.0);
					System.out.println(tempDeg+"C into Feharanet is : "+feh);
					break;
					
				}
			case 2 :
				{
					 kel=(tempDeg+273.15);
					System.out.println(tempDeg+"C into Kelvin is : "+kel);
					break;
				}
			case 3 :
				{
					rankine=((tempDeg*9/5)+491.67);
					System.out.println(tempDeg+"C into Renkine is : "+rankine);
					break;
				}
			default:
				System.out.println("INVALID INPUT..!!");

		}	
	}
	
}