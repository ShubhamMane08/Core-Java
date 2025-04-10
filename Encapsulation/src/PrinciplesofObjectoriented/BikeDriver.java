package PrinciplesofObjectoriented;

public class BikeDriver {
	public static void main(String[] args) {
		
		Bike b1= new Bike("Royal Enfield", "GT360", 360, 20, 100000.0);
		System.out.println(b1.getBrand()); 
		System.out.println(b1.getModel());
		System.out.println(b1.getCC());
		System.out.println(b1.getMilage());
		System.out.println(b1.getPrice());
		b1.setPrice(80000.0);
		
	}

}
