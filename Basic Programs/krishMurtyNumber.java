//WAP prgram Krish  Number
class krishMurtyNumber
{
	public static void main(String[] args)
	 {
		int num=145;
		int sum=0;
		for(int i=num;i>0;i/=10)
		{
			int rem = i%10;
			int fact=1;
			int j=1;
			while(j<=rem)
			{
				fact*=j;
				j++;

			}sum+=fact;

		}
		System.out.println((sum==num)? ("  Number is krish "):(" Numer is not Krish"));
	}
}