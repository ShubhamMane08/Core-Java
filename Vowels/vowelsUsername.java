import java.util.Scanner;
class vowelsUsername
{
	public static void main(String[] args)
	throws InterruptedException 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name : ");
		String str= sc.next().toLowerCase();
		int len= str.length();
		

		for(int i =0; i<len;i++)
		{
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
			{
				System.out.println(str.charAt(i));
				Thread.sleep(1000);

			}
			
		}

		
	}
}