class Widening 
{
	public static void main(String[] args) 
	{
		double d=10;
		System.out.println(d);

		float a='z';
		System.out.println(a);

		int b = 'f';
		System.out.println(b);

		byte c=100;
		short e=c;
		//char f=c; lossy conversion from byte to char
		int i=c;
		long l=c;
		float f=c;
		double db=c;

		System.out.println(db);
		//System.out.println(f);

		short s= 1254;
		//char ch=s; Lossy conversion from short to char
		int is=s;
		long ls=s;
		float fs=s;
		double ds=s;
		System.out.println(ds);

		char ch='r';
		//short sc= ch; Lossy conversion from char to short
		int ic=ch;
		long lc=ch;
		float fc=ch;
		double dc= ch;
		System.out.println(dc);


		int it=200;
		long li=it;
		float fi=it;
		double di=it;
		System.out.println(di);

		long ll=985579874;
		float fl=ll; // decimal from first number
		double dl= ll;
		System.out.println(dl);

		float fo=22.5f;
		double df=fo;
		System.out.println(df);
		





	}
}
