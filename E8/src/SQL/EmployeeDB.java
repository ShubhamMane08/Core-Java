package SQL;

import java.util.Scanner;

public class EmployeeDB {
	private static int count;
	private String userName;
	private String passWord;
	private Employee[] emp = new Employee[10];
	private Scanner sc = new Scanner(System.in);
	private static boolean connection;
	
	
	public EmployeeDB(String userName, String passWord) {
		super();
		this.userName = userName;
		this.passWord = passWord;
		System.out.println("Database is Created!!!");
		
	}
	
	public void logIn()
	{
		if(connection)
		{
			System.out.println("You are loggedIn Already!!");
			return;
		}
		int chance = 3;
		do {
			System.out.print("Enter UserName: ");
			String userName = sc.next();
			System.out.print("Enter PassWord: ");
			String passWord = sc.next();
			if(this.userName.equals(userName)&&this.passWord.equals(passWord))
			{
				connection = true;
				
				System.out.println("Database is Logged In");
				break;
			}
			else
			{
				chance--;
				System.out.println("Wrong Credentials!! try again "+chance+" chances remaining!");
			}
		}while(chance>0);
		if(chance==0)
		{
			emp = null;
			System.out.println("All the data has been deleted due to privacy purpose!!!");
		}
	}
	
	public void showDb()
	{
		if(connection)
		{
			if(count>0)
			{
				for(int i = 0;i<count;i++)
				{
					if(emp[i]!=null)
						System.out.println(emp[i]);
				}
			}
			else
			{
				System.out.println("No Data into the Database!!!");
			}
		}
		else
			System.out.println("Login Credential Required!!");
	}
	
	
	public void addEmp(String name, int empid, int deptNo, int managerId, String hireDate, double sal, double comm,
			String jobRole)
	{
		if(empid>0&&connection)
		{
			if(count>(0.75*emp.length))
			{
				Employee [] temp = new Employee[emp.length*2];
				for(int i=0;i<count;i++)
					temp[i] = emp[i];
				emp = temp;
			}
			emp[count++] = new Employee(name, empid, deptNo, managerId, hireDate,sal,comm,jobRole);
			System.out.println("Data Added!!");
		}
		else {
			System.out.println("No empolyee data is provided or Connection error!");
		}
	}
	
	public static boolean checkConnection()
	{
		return connection;
	}
	

}
