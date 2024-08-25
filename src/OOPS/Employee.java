package OOPS;

public class Employee {
	int Empid;
	String Empname;
	int Salary;
	int Deptno;
	
	/*Employee(int id,String name,int sal,int dno)
	{		
		Empid=id;
		Empname=name;
		Salary=sal;
		Deptno=dno;
	}*/
	
	void display() {
		System.out.println(Empid);
		System.out.println(Empname);
		System.out.println(Salary);
		System.out.println(Deptno);
		
	}
	
	void Setdata(int id,String name,int sal,int dno) {
		
		Empid=id;
		Empname=name;
		Salary=sal;
		Deptno=dno;
		
	}
	
	public static void main(String[]args) {
		
		/*Employee emp = new Employee();
		emp.Empid = 201;
		emp.Empname = "Ravi";
		emp.Salary= 50000;
		emp.Deptno = 40;
		emp.display();*/
		
		Employee emp = new Employee();
		emp.Setdata(50, "Kanan",40000,70);
		emp.display();
		
		
	}

}
