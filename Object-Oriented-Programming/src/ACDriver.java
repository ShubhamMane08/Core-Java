class ACDriver
{
	public static void main(String[] args)
	{
		AC a1= new AC();

		a1.brand="Blue Star";
		a1.price=30000.0;
		a1.max_temp=30;
		a1.min_temp=16;
		a1.amb_temp=22;
		a1.ton=1;
		a1.details();
		a1.MaxTemp();
		a1.MinTemp();
		a1.AmbientTemp();

		
	}
}