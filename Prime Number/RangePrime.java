import java.util.Scanner;
class RangePrime
{
	public static void main(String[] args) {
		System.out.print("Enter the Range : ");
		int num = new Scanner(System.in).nextInt();
		//num=5
			//2  true  3
		for(int i=2;i<num;i++)
		{	
			//flag true
			boolean flag = true;
			// 2  3   4 5 
			for(int j=2;j<=(i/2);j++)
			{
				//
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