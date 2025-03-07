import java.util.Scanner;
class BouncyNumber
{
	public static void main(String [] args)
	{
		
		System.out.print("Enter : ");
		int num = new Scanner(System.in).nextInt();
		int temp1 = 10;
		int temp = -1;   //34111 4
		boolean flag1 = true,flag2=true;

		
		for(int i = num;i>0;i/=10){
			int rem = i%10;
			
			if(temp<rem||temp==rem){
				temp=rem;
				
			}	
			else{
				flag1 = false;
				break;
			}
		}
		
		for(int i = num;i>0;i/=10){
			int rem = i%10;
			if(temp1>rem||temp1==rem){
				temp1=rem;
				
			}	
			else{
				flag2 = false;
				break;
			}
		}
		
		if(!(flag1||flag2))
			System.out.print(num+" Bouncy Number ");
		else
			System.out.print(num+" Not a Bouncy Number ");


		
	}
}