class HCF
{
	public static void main(String[] args) 
	{
		System.out.println(hcf(6,4));
	}
	public static int hcf(int n1,int n2)
	{
		int small =n1<n2?n1:n2;
		while(true)
		{
			if(n1%small==0 && n2%small==0)
			{
				return small;
			}
			small--;
		}
	}
}