package Pattern;

public class Fibonacci {

	public static void main(String[] args) {
		int sum=0;
		System.out.println((sum++)+" ");
		int temp=sum;
		int t=0;
		for(int i=0;i<20;i++)
		{
			
			
			System.out.println(" "+sum+" ");
			temp=t;
			t=sum;
			sum=sum+temp;
		}
	}
}
