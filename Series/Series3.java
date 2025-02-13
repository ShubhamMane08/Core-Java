// 10   30   68 130 222
//2^3+2 
class Series2{
	public static void main(String[] args) {
		for(int i=2;i<=6;i++)
		{
			int pow = 3;
			int num = 1;
                
			while(pow>0)
			{
				num*=i;
				pow--;
			}
			System.out.print((num+i)+" ");
		}
	}
}