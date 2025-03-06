class XylemNumber
{
	public static void main(String[] args) 
	{
		System.out.println(isXylem(1234));
		
	}
	public static boolean isXylem(int num)
	{
		int sumExt=num%10;
		int sumMid=0;
		num/=10;
		while(num>9)
		{
			sumMid+=(num%10);
			num/=10;
		}
		sumExt+=num;
		return sumExt==sumMid;
	}


}