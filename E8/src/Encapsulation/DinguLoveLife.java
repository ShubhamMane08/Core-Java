package Encapsulation;

import java.util.Scanner;
public class DinguLoveLife {
	
	String gf1,gf2,gf3;
	
	public DinguLoveLife()
	{
		
	}
	
	private DinguLoveLife(String gf1 , String gf2, String gf3)
	{
		this.gf1=gf1;
		this.gf2=gf2;
		this.gf3=gf3;
	}
	
	public static DinguLoveLife createObject()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your School gf, College gf , Finally Married Wife : ");
		return new DinguLoveLife(sc.next(),sc.next(),sc.next());
	}
	

}
