// 79 108 139 176 217 260
class Series4
{
	public static void main(String[] args) {
		for(int i=8;i<=20;i++)
		{
			int pow = 2;
			int num = 1;
			while(pow>0)
			{
				num*=i;
				pow--;
			}
			System.out.print((num)+" ");
			
		}
	}
}