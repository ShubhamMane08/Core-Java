class RecFibo
{
	public static void main(String[] args) 
	{
		fibo(5,0,1);
	}
	public static void fibo(int n,int n1,int n2)
	{
		if(n>0)
		{
			int n3=n1+n2;
			System.out.println(n1);
			fibo(--n,n2,n3);
		}
		return;
	}
}