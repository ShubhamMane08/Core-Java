package Arrays;

public class StudentDetailsDB {

	
	public static void main(String[] args) {
		
		
		StudentDetails[] db = new StudentDetails[3];
		db[0]=new StudentDetails("Ritu", "RIT", 2260007, 21);
		db[1]=new StudentDetails("Shubh", "RIT", 2260001, 25);
		db[2]=new StudentDetails("Niru", "RIT", 2260006, 23);
		
		
		System.out.println(db.length);
		for(int i = 0 ; i< db.length;i++)
		{
			System.out.println(db[i]);
		}
	}
}
