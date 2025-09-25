package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
public class StudentDriver {
	public static void main(String[] args) {
		
		List<Student> stud = new ArrayList<>();
		
		stud.add(new Student("Ram",6.5));
		stud.add(new Student("Suresh",7.5));
		stud.add(new Student("Suman",5.5));
		
		for(int i=0; i<stud.size();i++)
		{
			System.out.println(stud.get(i));
		}
//		Student s = new Student();
//		s.getCgpa(0);
//		s.getName(null);
	
//		Comparator<Student> comparator =Comparator.comparing(Student::getCgpa).reversed();
//		stud.sort(comparator);
//		for(Student s : stud)
//		{
//			System.out.println(s.getName()+" :"+s.getCgpa());
//			
//		}
	}

}
