class AC
{
	String brand;
	double price;
	int max_temp;
	int min_temp;
	int amb_temp;
	int ton;


	public void details()
	{
		System.out.println("Brand : "+brand);
		System.out.println("Price : "+price);
		System.out.println("Maximum Temperature : "+max_temp);
		System.out.println("Minimum Temperature : "+min_temp);
		System.out.println("Ambient Temperature : "+amb_temp);
		System.out.println("Ton : "+ton);

	}
	public void MaxTemp()
	{
		System.out.println("Maximum Temperature : "+max_temp);
	}
	public void MinTemp()
	{
		System.out.println("Minimum Temperature : "+min_temp);
	}
	public void AmbientTemp()
	{
		System.out.println("Ambient Temperature : "+amb_temp);
	}


}