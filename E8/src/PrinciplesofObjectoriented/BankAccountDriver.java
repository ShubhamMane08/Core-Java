package PrinciplesofObjectoriented;

public class BankAccountDriver {
	
	public static void main(String[] args) {
		
		BankAccount b1 = new BankAccount("SBI","Shubham Mane",26401100544l,8899,10000.0,"SBIN000064",54465778554l,88775554564l);
		
		
		b1.credit(987654321, 1234, 1000);
		System.out.println(b1.getBalance(987654321, 1234));
		b1.debit(987654321, 1234, 100);
		System.out.println(b1.getBalance(987654321, 1234));
		b1.setPin(987654321, 1234, 6263);
		System.out.println(b1.getBalance(987654321, 6263));
	}
	

}
