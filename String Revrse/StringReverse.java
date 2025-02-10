import java.util.Scanner;
class StringReverse
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Name : ");
		String s = sc.next().toUpperCase();
		
		String rev = "";


		for(int i=0; i<s.length();i++)
		{
			
				rev= s.charAt(i)+rev;
			
		}

		System.out.println(rev);


	// 	String str1 = "Asif";
    //     String str2="";
    //     int count=0;
	//  for(int i=0;i<=str1.length();i++)
	//  {
	//  	count++;
	//  }
	// for (int i=0;i<count ;i++ ) {
	// 	str2.charAt(i) = str1.charAt(count);
	// 	count--;
	// }

	// System.out.println(str2);


	}
}



