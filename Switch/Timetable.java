import java.util.Scanner;
class Timetable
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("------------------------------WELCOME-----------------------");
		System.out.println("1. Monday");
		System.out.println("2. Tuesday");
		System.out.println("3. Wednesday");
		System.out.println("4. Thursday");
		System.out.println("5. Friday");
		System.out.println("6. Saturday");
		System.out.println("7. Sunday");
		System.out.println();

		System.out.print("Choose the Day :");

		byte day = sc.nextByte();

		switch (day)
		{
		case 1:
			{
				System.out.println("Practice Maths..!!");
				break;
		

			}
			case 2:
			{
				System.out.println("Practice English..!!");
				break;
			}
			case 3:
			{
				System.out.println("Explore Histroy..!!");
				break;
			}
			case 4:
			{
						System.out.println("Discover Geopgraphy..!!");
						break;
			}
			case 5:
			{
						System.out.println("Study Scienc..!!!");
						break;
			}
			case 6:
			{
						System.out.println("Learn Marthi..!!");
						break;
			}
			case 7: 
			{
						System.out.println("Do Painting..!!");
						break;
			}
			default :
			{
						System.out.println("Go to School..!!");
						break;
			}
		
		}


	}
}
