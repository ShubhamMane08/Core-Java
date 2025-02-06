class  Modulus
{
	public static void main(String[] args) 
	{

		byte a=10;
		byte b=20;
		int c= a%b;
		System.out.println("Modulos of two byte values is  Integer : "+c);

		short s1=200;
		short s2=500;
		int s3=s1%s2;
		System.out.println("Modulus of two Short values is Integer :"+s3);

		char c1='a';
		char c2='b';
		int c3=c1%c2;
		System.out.println("Modulus of two Character values is : "+c3);

		int i1=200;
		int i2=500;
		int i3=i1%i2;
		System.out.println("Modulus of two Integer value is Integer :"+i3);

		long l1=250l;
		long l2=25000l;
		long l3=l1%l2;
		System.out.println("Modulus of two Long value is Long : "+l3);

		float f1=1.1f;
		float f2=2.2f;
		float f3=f1%f2;
		System.out.println("Modulus of two Floating value is Float : "+f3);

		double d1=1.1;
		double d2=2.2;
		double d3=d1%d2;
		System.out.println("Modulus of two Double value is Double : "+d3);
	}
}
