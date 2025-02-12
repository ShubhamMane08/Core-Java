//2  6  22  278  65814

class Series2
{
	public static void main(String[] args) 
	{
		int sum=2;
		int temp=2;
		for(int i =1;i<=5;i++)
		{
			sum=(temp*temp)+sum;
			temp*=temp;
			System.out.print(sum+" ");
		}
		
	}
}