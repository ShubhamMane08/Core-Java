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
	}
}