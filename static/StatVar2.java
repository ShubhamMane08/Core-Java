class StatVar2
{
	static double balance;
	public static void main(String[] args) 
	{
		credit(10000);
		System.out.println("Current Balance : "+balance);
		debit(100.0);
				
	}
	public static void debit(double amt)
	{
		if(amt>0 && balance-amt>1000)
		{
			balance-=amt;
			System.out.println("Amount Debited!");
			System.out.println("Your Balance is : "+balance);
		}
		else 
		{
			System.out.println("Invalid Amount");
		}
	}
	public static void credit(double amt)
	{
		if(amt>0)
		{
			balance+=amt;
			System.out.println("Amount Credited!");
			System.out.println("Your Balance is : "+balance);
		}
		else 
		{
			System.out.println("Invalid Amount");
		}
	}
}