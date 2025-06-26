package Inheritance;

public class GoogleDriver {
	public static void main(String[] args) {
		
		Gmail g1 = new Gmail("Sundar Pachai", "San Franciso", 3012228735000.00, "raju@gmail.com", "Raju@gmail.com");
		g1.displayGoogle();
		g1.sendMail("Shubham@gmail.com", "Hey");
		g1.sendMail("ritesh@gmail.com", "Hey");
		g1.recieveMail("raju@gmail.com", "Hey.!");
		g1.deleteMail("ritesh@gmail.com");
		g1.dislplayGmail();
		
	}

}
