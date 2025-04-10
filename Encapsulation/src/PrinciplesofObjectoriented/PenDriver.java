package PrinciplesofObjectoriented;

public class PenDriver {
	
	public static void main(String[] args) {
		
		Pen p1 = new Pen("Reynolds","Gel",50.0);
		System.out.println(p1.getBrand());
		System.out.println(p1.getType());
		System.out.println(p1.getPrice());
		
		System.out.println(p1.ref.getColor());
		System.out.println(p1.ref.getSize()); 
		
		
	}

}
