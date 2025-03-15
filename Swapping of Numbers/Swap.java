class Swap
{
	public static void main(String[] args) 
	{
		int a=1,b=2;
		int dup1=a,dup2=b;
		System.out.println("Before Swapping a: "+dup1+" b : "+dup2);
	   //a=0001
	   //b=0010

		a=a^b;
	   //a=0011
		b=a^b;
	  //0011
	  //0010
	  //b=>0001=>1
		a=a^b;
	  //a=0011 0001
	  //a=>0010=>2
		System.out.print("After Swapping a: "+a+" b: "+b);
		
	}
}