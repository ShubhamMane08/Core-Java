class MobileDriver
{
	public static void main(String[] args) 
	{
		//Apple
		Mobile m1 = new Mobile();
		System.out.println(m1);
		m1.brand="APPLE";
		m1.model="iPhone 16 Pro";
		m1.ram=16;
		m1.rom=1;
		m1.camera=3;
		m1.price=150000.0;
		m1.display();


	
		//Samsung
		Mobile m2 = new Mobile();
		System.out.println(m2);
		m2.brand="SAMSUNG";
		m2.model="S25";
		m2.ram=16;
		m2.rom=1;
		m2.camera=5;
		m2.price=125000.0;
		m2.display();




		//Realme
		Mobile m3 = new Mobile();
		System.out.println(m3);
		m3.brand="REALME";
		m3.model="Realme 11 5G";
		m3.ram=8;
		m3.rom=256;
		m3.camera=2;
		m3.price=20000.0;
		m3.display();




		//Redmi
		Mobile m4 = new Mobile();
		System.out.println(m4);
		m4.brand="REDMI";
		m4.model="Redmi Note 15 Pro";
		m4.ram=16;
		m4.rom=512;
		m4.camera=4;
		m4.price=30000.0;
		m4.display();

	

		
	}
}