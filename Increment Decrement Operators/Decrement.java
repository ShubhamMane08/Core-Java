class Decrement 
{
	public static void main(String[] args) 
	{
		int a=100;
		System.out.println(--a);//99
		System.out.println(--a);//98
		System.out.println(a--);//98
		System.out.println(a--);//97
		System.out.println(--a - a--);//->96 - 97

		
	}
}
