// 0 1 1 2 3 5 8 13 21 34 55 89 144 233/ 
class Fibonacci
{
	public static void main(String[] args) {
		int sum = 0;
		System.out.print((sum++)+" ");
		int temp = sum;
		int t=0;
		for(int i=0;i<20;i++)
		{
			System.out.print(" "+sum+" ");
			temp=t;
			t=sum;
			sum=sum+temp;			
		}
	}
}