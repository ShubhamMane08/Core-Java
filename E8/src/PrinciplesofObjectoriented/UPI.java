package PrinciplesofObjectoriented;

public class UPI {
	String upiID;
	int upiPin;
	long accno;
	String bank;
	int bankPin;
	long phno;
	BankAccount acc;
	
	
	public UPI()
	{
		
	}


	public UPI(String upiID, int upiPin, long accno, String bank, int bankPin, long phno, BankAccount acc) {
		this.upiID = upiID;
		this.upiPin = upiPin;
		this.accno = accno;
		this.bank = bank;
		this.bankPin = bankPin;
		this.phno = phno;
		this.acc = acc;
		System.out.println("UPI Linked Successfully");
	}
	
	public void displayUPI()
	{
		System.out.println("UPI ID :"+upiID);
		System.out.println("UPI Pin :"+upiPin);
		System.out.println("Account Number :"+accno);
		System.out.println("Bank Name :"+bank);
		System.out.println("Phone Number : "+phno);
	}
	

}
