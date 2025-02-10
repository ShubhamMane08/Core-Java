import java.util.Scanner;
class NumbertoWord
{
	public static void main(String[] args)
	{
		Scanner sc1 = new Scanner(System.in);
		System.out.print("Enter a Number :");
		int num = sc1.nextInt();

		String sc="";

		for(int i=num; i>0;i%=10)
		{


			switch(i/=10)
			{
				case 1 :
					{
						sc+="one";
						break;
					}
				case 2 :
				{
					sc+="two";
					break;
				} 
				case 3: 
				{
					sc+="three";
					break;

				}
				case 4:
					{
						sc+="four";
						break;
					}
					case 5:
					{
						sc+="five";
						break;
					}
					case 6:
					{
						sc+="six";
						break;
					}
					case 7:
					{
						sc+="seven";
						break;
					}
					case 8:
					{
						sc+="eight";
						break;
					}
					case 9:
					{
						sc+="nine";
						break;
					}
			}
		}
		System.out.println(sc);

		
	}
}