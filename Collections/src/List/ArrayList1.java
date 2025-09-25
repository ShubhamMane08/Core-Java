package List;
 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
public class ArrayList1 {
	
	class StringLengthComparator implements Comparator<String>
	{
		@Override
		public int compare(String o1, String o2) {
			// TODO Auto-generated method stub
			return o1.length()-o2.length();
		}
	}
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(80);
		
//		list.remove(2);
//		System.out.println(list.contains(20));
		list.add(2,800);
		list.set(3, 100);
		
		list.sort(null);
		list.sort((a,b)->b-a);
		System.out.println(list);
		for(int i =0; i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		
		List<String>fruits = Arrays.asList("Banana","Pinaple","Chiku","Apple");
		System.out.println(fruits);
		fruits.sort(null);
		
		System.out.println(fruits);
		System.out.println(fruits);
		for(int i=0;i<fruits.size();i++)
		{
			System.out.println(fruits.get(i));
		}
		
		

		
	}

	

}
