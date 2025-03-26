class MobileDriver
{
	public static void main(String[] args) 
	{
		//Apple
		Mobile m1 = new Mobile();
		System.out.println("-----------------------------------------");
		System.out.println(m1);
		m1.brand="APPLE";
		m1.model="iPhone 16 Pro";
		m1.ram=16;
		m1.rom=1;
		m1.camera=3;
		m1.price=150000.0;

		System.out.println("Brand: "+m1.brand);
		System.out.println("Model: "+m1.model);
		System.out.println("RAM: "+m1.ram);
		System.out.println("ROM: "+m1.rom+"TB");
		System.out.println("Camera: "+m1.camera);
		System.out.println("Price: "+m1.price);

		
	}
}