import java.util.Scanner;
class Password
{
	public static void main(String[] args) throws InterruptedException
	{
		Scanner sc = new Scanner(System.in);

		int storedPin=143;
		int seconds=5000;
		outerloop:
		for (; ; ) 
		{
			int attempt=3;
			do 
			{
				System.out.print("Enter the Pin : ");
				int pin =sc.nextInt();

				if(pin==storedPin)
				{
					System.out.println("PHONE UNLOCKED ");
					break outerloop;
				}
				else 
				{
					System.out.println("WRONG PIN");
					System.out.println("ATTEMPT LEFT "+(attempt-1));
				}
				attempt--;
			}
				while(attempt>=1);

				System.out.println();
				System.out.println("PHONE DISABLED FOR "+(seconds/1000)+" seconds");
				Thread.sleep(seconds);
				seconds*=2;
				System.out.println();

			}

			
		}

		
	}
