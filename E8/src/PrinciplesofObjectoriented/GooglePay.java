package PrinciplesofObjectoriented;

public class GooglePay {
	
	String upiID;
	int upiPin;
	long accno;
	String bank;
	int bankPin;
	long phno;
	long cardNo;
	int cvv;
	String expiryDate;
	String email;
	UPI upi;
	
	public GooglePay()
	{
		
	}

	public GooglePay(String upiID, int upiPin, long accno, String bank, int bankPin, long phno, long cardNo, int cvv,
			String expiryDate, String email, BankAccount ref) 
	{
		this.upiID = upiID;
		this.upiPin = upiPin;
		this.accno = accno;
		this.bank = bank;
		this.bankPin = bankPin;
		this.phno = phno;
		this.cardNo = cardNo;
		this.cvv = cvv;
		this.expiryDate = expiryDate;
		this.email = email;
		
		if(validate(ref,bank,bankPin,phno,accno))
		{
			upi=new UPI(upiID, upiPin, accno, bank, bankPin, phno, ref);
		}
		else
		{
			System.out.println("Invalid Bank Details!");
		}
	}
	
	public void displayGooglePay()
	{
		System.out.println("UPI ID : "+upiID);
		System.out.println("Bank Name : "+bank);
		System.out.println("Bank Account Number : "+accno);
		System.out.println("Card No : "+cardNo);
		System.out.println("Phone Number : "+phno);
		System.out.println("--------------------------------------------");
	}
	
	public boolean validate(BankAccount ref,String bank,int pin,long phno,long accno)
	{
		if(ref.getAccnumber()==accno && ref.getBankname()==bank && ref.getPin()==pin && ref.getPhone()==phno)
		{
			return true;	
		}
		return false;
	}
	
	
	

}
