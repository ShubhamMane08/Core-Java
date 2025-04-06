class BankAccountDriver
{
	public static void main(String[] args) 
	{
		
		BankAccount a1 = new BankAccount();
		a1.username="Shubham";
		a1.acc_no=4569878956l;
		a1.balance=5000;
		a1.details();
		a1.credit(200);
		a1.debit(100);
		System.out.println();
		System.out.println();

		BankAccount a2 = new BankAccount();
		a2.username="Onkar";
		a2.acc_no=4544546456l;
		a2.details();
		a2.credit(200);

		//a2.debit(100);

	}


}
