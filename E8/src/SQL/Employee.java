package SQL;

public class Employee {
	
	String name;
	int empid;
	int deptNo;
	int managerId;
	String hireDate;
	double sal;
	double comm;
	String jobRole;
	
	
	
	public void  Empolyee(String name, int empid, int deptNo, int managerId,String jobRole, String hireDate, double sal, double comm)
	{
		
		this.name = name;
		this.empid = empid;
		this.deptNo = deptNo;
		this.managerId = managerId;
		this.jobRole = jobRole;
		this.hireDate = hireDate;
		this.sal = sal;
		this.comm = comm;
	}
	
//	public static Empolyees createEmp(String name, int empid, int deptNo, int managerId, String hireDate, double sal, double comm,
//			String jobRole)
//	{
//		if(DbEmpolyees.checkConnection())
//		{
//			return new Empolyees(name,empid,deptNo,managerId,hireDate,sal,comm,jobRole);
//		}
//		else 
//			return null;
//	}
	@Override
	public String toString() {
		return "Empolyees [name=" + name + ", empid=" + empid + ", deptNo=" + deptNo + ", managerId=" + managerId
				+ ", hireDate=" + hireDate + ", sal=" + sal + ", comm=" + comm + ", jobRole=" + jobRole + "]";
	}
}
