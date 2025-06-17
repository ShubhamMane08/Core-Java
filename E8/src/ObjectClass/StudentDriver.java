package ObjectClass;

public class StudentDriver {
	public static void main(String[] args) {
		
		Student s1 = new Student("Raju","FC",123,"BE","CS");
		System.out.println(s1.toString());
		System.out.println(s1);
		
		Student s2 = new Student("OM","RIT",2272021,"Diploma","Civil");
		System.out.println(s2.toString());
		System.out.println(s2);
	
		System.out.println(s1==s2);// It is comaparing the Original Reference Number Rather than the attributes
		System.out.println();
	}

}