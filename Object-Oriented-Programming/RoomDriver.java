class RoomDriver
{
	public static void main(String[] args) 
	{
		Room rm = new Room();
		rm.type="3BHK";
		rm.floor=11;
		rm.owner="Shubham";
		rm.parking="Availabe";
		rm.rent=7000.0;
		rm.details();

		Room rm1= new Room();

		rm1.type="2BHK";
		rm1.floor=9;
		rm1.owner="Onkar";
		rm1.parking="Availabe";
		rm1.rent=5000.0;
		rm1.details();


		Room rm2= new Room();

		rm2.type="1BHK";
		rm2.floor=9;
		rm2.owner="Onkar";
		rm2.parking="Availabe";
		rm2.rent=4500.0;
		rm2.details();

		Room rm3= new Room();

		rm3.type="1RK";
		rm3.floor=6;
		rm3.owner="Shubham";
		rm3.parking=" Not Availabe";
		rm3.rent=4000.0;
		rm3.details();
	}
}