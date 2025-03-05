class CoPrime
{
	public static void main(String[] args) 
	{
		System.out.println(iscoPrime(5,3));
	}
	public static int hcf(int n1,int n2)
	{
		int small = n1<n2?n1:n2;
		while(true)
		{
			if(n1%small==0 && n2%small==0)
			{
				return small;
			}
			small--;
		}
	}
	public static boolean iscoPrime(int n1,int n2)
	{
		return hcf(n1,n2)==1;
	}
}