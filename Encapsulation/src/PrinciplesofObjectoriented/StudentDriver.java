package PrinciplesofObjectoriented;

public class StudentDriver {
	
	public static void main(String[] args) {
		
		Student s1 = new Student("Shubham","Java Full Stack","Deccan",98765432110l,34599);
		System.out.println(s1.getInstituteName());
		System.out.println(s1.getName());
		System.out.println(s1.getCourse());
		System.out.println(s1.getBranch());
		System.out.println(s1.getPhoneNumber());
		System.out.println(s1.getFees());
		
		s1.setBranch(true, "Hadapsar");
		System.out.println(s1.getBranch());
		s1.setPhoneNumber(true, 8857988919l);
		System.out.println(s1.getPhoneNumber());
	}
}
