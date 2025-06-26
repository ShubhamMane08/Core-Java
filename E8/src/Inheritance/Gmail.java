package Inheritance;

public class Gmail extends Google{
	
	int inbox;
	int sent;
	int  bin;
	int mails;
	
	public Gmail()
	{
		
	}
	
	public Gmail(String ceo, String hq, double turnover, String email, String pass)
	{
		this.ceo=ceo;
		this.hq=hq;
		this.turnover=turnover;
		this.email=email;
		this.pass=pass;
		
	
	}
	
	public void recieveMail(String email,String content)
	{
		System.out.println("Mail recieved from "+email);
		System.out.println(content);
		inbox++;
		mails++;
	
	}
	public void sendMail(String email,String content)
	{
		System.out.println("Mail Sent ");
		sent++;
	}
	
	public void deleteMail(String email)
	{
		mails--;
		bin++ ;
	}
	public void dislplayGmail()
	{
		System.out.println("Total mails: "+mails);
		System.out.println("Inbox : "+inbox);
		System.out.println("Sent Mails : "+sent);
		System.out.println("Deleted Mails : "+bin);
		System.out.println("----------------------------");
	}
}
