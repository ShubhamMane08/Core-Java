package AccessModifier;

public class C {
	 int a =10;
	public C()
	{
		
	}
	protected static void test()
	{
		System.out.println("From the Default test of C");
	}
	public static void main(String[] args) {
		
		C c1 = new C();
		c1.test();
		System.out.println(c1.a);
	}

}
