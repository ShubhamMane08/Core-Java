import java.util.Scanner;
class PatternMock
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num=sc.nextInt();

		for(int i = num;i>=1;i--)
		{
			
			
			for(int j=1; j<=2;j++)
			{
				int a=i;
				for(int k=1;k<=i;k++)
				{
					System.out.print(a-- + "*");
				}

			}
			System.out.println();
		}

		
	}
}