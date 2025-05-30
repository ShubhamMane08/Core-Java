package PrinciplesofObjectoriented;

public class BankAccount {
	
	private String username;
	private String bankName;
	private long accno;
	private int pin;
	private double balance;
	private String ifsc;
	private long phno;
	private long aadhar;
	
	UPI upi;
	
	public BankAccount(String bankName,String userName,long accno,int pin, double balance,String ifsc,long aadhar,long phno) {
		
	
		username=userName;
		this.bankName=bankName;
		this.accno=accno;
		this.pin=pin;
		this.balance=balance;
		this.ifsc=ifsc;
		this.aadhar=aadhar;
		this.phno=phno;
	}
	
	
	public long getPhone()
	{
		return phno;
	}
	public void setPhone(long aadhar, long newPhno)
	{
		
		if(this.aadhar==aadhar )
		{
			phno=newPhno;
			System.out.println("Phone Number Updated!");
		}
		else
		{
			System.out.println("Invalid Aadhar Number.!");
		}
	}
	public long getAadhar()
	{
		return aadhar;
	}
	
	public void registerUPI(String upiID, int upiPin)
	{
		upi=new UPI(upiID, upiPin, upiPin, upiID, upiPin, upiPin, this);
		System.out.println("UPI successfully Registered!");
	}
	
	
	
	public String getUsername()
	{
		return username;
	}
	public String getBankname()
	{
		return bankName;
	}
	public long getAccnumber()
	{
		return accno;
	}
	
	public int getPin()
	{
		return pin;
	}
	public void setPin(long accno,int oldpin,int newpin)
	{
		if(this.accno==accno && this.pin==oldpin)
		{
			pin=newpin;
			System.out.println("Pin Updated!");
		}
		else
		{
			System.out.println("Invalid Credentials");
		}
		
	}
	public String getIFSC()
	{
		return ifsc;
	}
	
	public double getBalance(long accno,int pin)
	{
		if(this.accno==accno && this.pin==pin)
		{
			return balance;
		}
		else
		{
			System.out.println("Invalid Credentials");
			return 0;
		}
		
	}
	
	public void credit(long accno, int pin,double amt)
	{
		if(this.accno==accno && this.pin==pin)
		{
			if(amt>0)
			{
				balance+=amt;
				System.out.println("Amount Credited");
			}
			else
			{
				System.out.println("Please Enter Valid Amount");
			}
		}
		else
		{
			System.out.println("Invalid Credentials");
		}
		
	}
	
	public void debit(long accno , int pin,double amt)
	{
		if(this.accno==accno && this.pin==pin)
		{
			if(amt>0)
			{
				if(balance-amt>0)
				{
					balance-=amt;
					System.out.println("Amount Debited!");
				}
				else
				{
					System.out.println("Insufficient Balance");
				}
				
			}
			else
			{
				System.out.println("Please enter valid Amount!");
			}
		}
		else
		{
			System.out.println("Invalid Credentials");
		}
	}
	
	

}
