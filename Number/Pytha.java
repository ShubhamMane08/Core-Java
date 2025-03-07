class Pytha 
{
	public static void main(String [] args)
	{
		System.out.println(isPyth(3,4,5));
	}
	public static boolean isPyth(int num1,int num2,int num3)
	{
		System.out.println(power(num1,2)+" "+power(num2,2)+" "+power(num3,2));//For checking Power.
			return power(num1,2)+power(num2,2)==power(num3,2);
	}
	public static int power(int num,int range)
	{
		if(range==1)
			return num;
		else
			return num*power(num,--range);
	}
}