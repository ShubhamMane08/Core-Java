class SmallestDgt
{
	public static void main(String[] args) {
		int num = 25489;
		int max=9;

		for(int i = num; i>0;i/=10)
		{
			int dgt = num%10;

			if(max>dgt)
			{
				max=dgt;
			}

		}
		System.out.println("Smallest dgt from "+num+" is "+max);
	}
}