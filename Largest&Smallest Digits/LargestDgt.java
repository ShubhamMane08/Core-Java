class LargestDgt
{
	public static void main(String[] args) {
		int num = 25489;
		int max=0;

		for(int i = num; i>0;i/=10)
		{
			int dgt = num%10;

			if(max<dgt)
			{
				max=dgt;
			}

		}
		System.out.println("Largest dgt from"+num+" is "+max);
	}
}