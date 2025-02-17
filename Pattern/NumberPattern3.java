class NumberPattern3
{
	public static void main(String[] args) {
		int n=5;
			//i=1    1<=5 1(2)
			//i=2    true 2(3)
			//i=3   true  3(4)
			//i=4   true  4(5)
			//i=5   true  5(6)

		for(int i =1;i<=n;i++)
		{
				//j=1  1<=n 1(2)
				//j=2  true 2(3)
				//j=3 true  3(4)
				//j=4 true  4(5)
				//j=5 true  5(6)
			for(int j=i;j<=n;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
}
// 1 2 3 4 5
// 2 3 4 5
// 3 4 5
// 4 5
// 5