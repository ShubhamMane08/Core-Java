class Car
{
	String brand;
	String model;
	String modeOfFuel;
	double price;
	int milage;
	int topSpeed;


	public void details()
	{
		String model=" (Kidnaper Car)";
		System.out.println("Brand : "+brand);
		System.out.println("Model : "+this.model+model);
		System.out.println("Milage : "+milage);
		System.out.println("Mode of Fuel : "+modeOfFuel);
		System.out.println("Topspeed : "+topSpeed);
		System.out.println("Price : "+price);


	}
}