package Interface;

public class InstagramDriver {
	public static void main(String[] args) {
		
		Instagram i1 = new InstaImp2("Raju","Raju@1223");
		i1.post("I am Happy tody..!");
		i1.like("Angel Priya.!");
		
		i1.comment("Angel Priya", "How?");
		i1.comment("Raju", "May I know who is this.!");
		
		
		i1.message("Angel Priya", "How do you know me ?");
		i1.message("Angel Priya", "Hi are you Bussy?");
		
		i1.story("I am a alone Wolf ");
		
		
		i1.comment("Angel Priya", "How?");
		
		
		Instagram.message("Raju");
		
		
	}

}
