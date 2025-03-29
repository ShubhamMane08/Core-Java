class BankAccount
{
	String bankName="      State Bank of India  ";
	String username;
	long acc_no;
	double balance;


	public void details()
	{
		System.out.println("Enter the Username : "+username);
		System.out.println("Account Number : "+acc_no);
		System.out.println("Current Balance : "+balance);

	}
	public void credit(int amt)
	{
		if(amt>0)
		{
			balance +=amt;
			System.out.println("Amount Credited Successfully");
			System.out.println("Updated Balance : "+balance);
		}
		else 
		{
			System.out.println("Invalid Amount");
		}

	}
	public void debit(int amt)
	{
		if(amt>0 && balance-amt>1000)
		{
			balance-=amt;
			System.out.println("Amount Debited Successfully");
			System.out.println("Updated Balance : "+balance);
		}
		else 
		{
			System.out.println("Invalid Amount");
		}
	}
}