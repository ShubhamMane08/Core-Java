package Exception;

public class E2 {

	public static void main(String[] args) {
		
		
		for(int i =0;i<5;i++)
		{
			System.out.println("I love India");
			try
			{
				Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{
				System.out.println("Handled");
			}
		}
	}
}
