class Room
{
	String apartment="Ghulmohor";
	int floor;
	String type;
	String owner;
	double rent;
	String parking="Available";


	public void details()
	{
		System.out.println("Apartment : "+apartment);
		System.out.println("Floor : "+floor);
		System.out.println("Room Type : "+type);
		System.out.println("Owner Name : "+owner);
		System.out.println("Rent : "+rent);
		System.out.println("Parking : "+parking);
		System.out.println("---------------------------------");
	}
}