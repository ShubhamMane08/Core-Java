package PrinciplesofObjectoriented;

public class ComputerDriver {
	public static void main(String[] args) {
		
		Cabinet cb = new Cabinet("ON", 7, "Dell", 72, "ROG", "intel i7 11th gen", 85, 20000.0, "1000", 200,"Logitech",1600.0,32,5000.0,"Logitech,","Wired",1000.0);
		cb.DisplayCPU();
	}
}


