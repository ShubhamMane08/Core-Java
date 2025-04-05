class Form
{
	String name;
	long phone;
	long tel;
	char gen;
	String blood;
	String email;
	String dob;


	Form()
	{
		System.out.println("From no argument Constructor");

	}
	Form(String name, long phone,char gen,String dob)
	{
		this.name=name;
		this.phone=phone;
		this.gen=gen;
		this.dob=dob;
		System.out.println("From Constructor 1 ");
	}
	Form(String name, long phone,char gen,String dob,long tel)
	{
		this();
		this.tel=tel;
		System.out.println("From Constructor 2");
	}

	public void displayForm()
	{
		System.out.println("Name : "+name);
		System.out.println("Phone Number : "+phone);
		System.out.println("Gender : "+gen);
		System.out.println("Date of Birth : "+dob);
		System.out.println("Telephone Number : "+tel);
		System.out.println("Blood Group : "+blood);
		System.out.println("Email : "+email);

	}
}