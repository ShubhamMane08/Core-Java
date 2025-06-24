package Interface;

public class InstaImp2 extends InstaImp1 {

	public InstaImp2() {
		
	}

	public InstaImp2(String user, String pass) 
	{
		super(user, pass);
	
	}
	

	@Override
	public void story(String msg) {
		// TODO Auto-generated method stub
		System.out.println(msg);
		System.out.println("Story Updated");
		
	}
	
	

}
