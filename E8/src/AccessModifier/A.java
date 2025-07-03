package AccessModifier;

public class A {
	
	private int a = 10;
	public A()
	{
		
	}
	 static void test()
	{
		 System.out.println("From the Private");
		
	}
	public static void main(String[] args) {
		
		A a1 = new A();
		a1.test();
		System.out.println(a1.a);
		
	}

}
