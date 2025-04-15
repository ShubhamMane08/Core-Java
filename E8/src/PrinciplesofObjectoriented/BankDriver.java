package PrinciplesofObjectoriented;

public class BankDriver {

	
	
	public static void main(String[] args) {
		
		BankAccount b1 = new BankAccount("SBI", "Shubham Mane", 026401002230220l, 8899, 1000.0, "SBIN000064", 95291785544l, 8857988919l);
		
		
		GooglePay gpay=new GooglePay("shubham@ybl", 8899, 026401002230220l, "SBI", 8899, 8857988919l, 98557855474l, 118, "08/2030", "shubhammane@gmail.com", b1);
		
		gpay.displayGooglePay();
		gpay.upi.displayUPI();
		
	}
}
