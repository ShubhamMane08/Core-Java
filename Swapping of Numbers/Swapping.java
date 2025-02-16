class Swapping
{
	public static void main(String[] args) 
	{
		int a=10,b=20;
		int dup1=a, dup2=b;

		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("Before Swapping a :"+dup1+" b: "+dup2);
		System.out.println("After Swapping a : "+a+" b: "+b);

		
	}
}