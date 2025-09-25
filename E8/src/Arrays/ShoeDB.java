package Arrays;

public class ShoeDB {
	public static void main(String[] args) {
		
		
		Shoe[]sh= new Shoe[3];
		
		sh[0]=new Shoe( "Red", 5000.0, 9);
		sh[1]=new Shoe("Yellow",3000.0,8);
		sh[2]= new Shoe("White",7000.0,9);
		
		
		for(int i = 0; i<sh.length;i++)
		{
			System.out.println(sh[i]);
		}
	}

}
