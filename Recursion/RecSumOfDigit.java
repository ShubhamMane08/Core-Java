class RecSumOfDigit
{
	public static void main(String[] args) 
	{
		System.out.println(sumOfDigit(1234,0));
	}
	public static int sumOfDigit(int num, int sum)
	{
		return num==0? sum:sumOfDigit(num/10,sum+=(num%10));
	}
}