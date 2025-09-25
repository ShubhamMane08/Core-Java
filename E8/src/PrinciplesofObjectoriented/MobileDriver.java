package PrinciplesofObjectoriented;

public class MobileDriver {

	public static void main(String[] args) {
		
		Mobile m1 = new Mobile("Samsuung", "S23", "5 G", 350000.0);
		m1.displayMobile();
		m1.insertSim("Jio", "5 G", "Prepaid", 9876543210l);
		m1.connectCharger("Realme", "Type-C", 80, 20000.0);
		m1.connectEarbuds("Realme t1", 40, "Wireless", 1400.0);
	}
}
