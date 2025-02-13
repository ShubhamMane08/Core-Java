import java.util.Scanner;
class RangePrime
{
	public static void main(String[] args) {
		System.out.print("Enter the Range : ");
		int num = new Scanner(System.in).nextInt();
		for(int i=2;i<num;i++)
		{
			boolean flag = true;
			for(int j=2;j<=(i/2);j++)
			{
				if(i%j==0)
					{
						flag = false;
						break;
					}
			}
			if(flag)
				System.out.print(i+" ");
		}
	}
}