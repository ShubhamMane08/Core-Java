class Narrowing  
{
	public static void main(String[] args) 
	{

		double d = 2.0000012211;
		float f= (float)d;

		long l =(long) d;

		int i = (int)d;
		short s = (short)d;
		byte b= (byte)d;
		char c = (char)d;

		System.out.println(f);
		System.out.println(l);
		System.out.println(s);
		System.out.println(b);
		System.out.println(c);//emoji
		System.out.println(i);

		float f1= 5.2f;
		long l1= (long) f1;
		int i1 = (int)f1;
		short s1=(short)f1;
		char ch = (char)f1;
		byte b1=(byte)f1;
		System.out.println(l1);
		System.out.println(i1);
		System.out.println(s1);
		System.out.println(ch);//+
		System.out.println(b1);

		long l2=211321232;
		int il=(int)l2;
		short sl =(short)l2;
		char cl = (char)l2;
		byte bl=(byte)l2;
		System.out.println(il);
		System.out.println(sl);
		System.out.println(cl);//?
		System.out.println(bl);

		int it=100;
		short si = (short) it;
		char ci= (char)it;
		byte bi=(byte)it;

		System.out.println(si);
		System.out.println(ci);
		System.out.println(bi);

		short sh=2545;
		char chs=(char)sh;
		byte bsh=(byte)sh;

		System.out.println(chs);
		System.out.println(bsh);

		char cha='a';
		byte bch=(byte)cha;

		System.out.println(bch);
		



	}
}
