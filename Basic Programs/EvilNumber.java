import java.util.Scanner;
class EvilNumber
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num= sc.nextInt();
		String bin = "";
		for(int i = num;i>0;i/=2)
		{
			bin=(i%2)+bin;
		}
		int cnt=0;
		for(int i =0; i <bin.length();i++)
		{
			char ch=bin.charAt(i);
			if(ch=='1')
			{
				cnt++;
			}
		}
		if(cnt%2==0)
		{
			System.out.println(num+" is EvilNumber");
		}
		else 
		{
			System.out.println(num+" is not a Evil Number ");
		}
		
	}
	
}