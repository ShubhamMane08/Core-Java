//package SQL;
//
//import java.util.Scanner;
//public class EmployeeDBDriver {
//	public static void main(String[] args) {
//		
//		
//			Scanner sc = new Scanner(System.in);
//			EmployeeDB db = new EmployeeDB("scott", "tiger");
//			
//			int choice;
//			mainLoop:
//			do {
//				System.out.println();
//				System.out.println();
//				System.out.println();
//				System.out.println("-----------------------------------------");
//				System.out.println("         WELCOME TO THE DATABASE         ");
//				System.out.println("-----------------------------------------");
//				
//				System.out.println();
//				System.out.println("Choose Options: ");
//				System.out.println("1. LOGIN ");
//				System.out.println("2. CHECK DATABASE");
//				System.out.println("3. ADD AN EMPOLYEE");
//				System.out.println("4. Quit");
//				System.out.println();
//				System.out.print("Option: ");
//				choice = sc.nextInt();
//				switch(choice)
//				{
//				case 1:
//					db.logIn();
//					break;
//				case 2:
//					db.showDb();
//					break;
//				case 3:
//					if(!EmployeeDB.checkConnection())
//					{
//						System.out.println("Login Credential Required!!!");
//						break;
//					}
//					System.out.println("Insert Empolyee Information: [name empid deptNo managerId hireDate sal comm jobRole]");
//					sc.nextLine();
//					String s = sc.nextLine();
//					String[] ed = s.split(" ");
//					db.addEmp(ed[0],Integer.parseInt(ed[1]),Integer.parseInt(ed[2]),Integer.parseInt(ed[3]),ed[4],Float.parseFloat(ed[5]),Float.parseFloat(ed[6]),ed[7]);
//					break;
//				case 4:
//					break mainLoop;
//				default:
//					System.out.println("ENTER A VALID OPTION!!!");
//				}
//				
//			}while(choice != 4);
//			
//			System.out.println("Thank you for the interaction");
//			
//		}
//
//}
