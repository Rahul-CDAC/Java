package in.acts.cdac;

class Employee {
	
	String name;
	int empid;
	double salary;

	public void employeeDetails(String name, int empid, double salary){
		System.out.println("Employee1   :"+ name);
		System.out.println("Employee1   :"+ empid);
		System.out.println("Employee1   :"+ salary);
		System.out.println("***************************************");
	
	}
	public void employeeDetails1(String name, int empid, double salary){
		System.out.println("Employee2   :"+ name);
		System.out.println("Employee2   :"+ empid);
		System.out.println("Employee2   :"+ salary);
		System.out.println("***************************************");
	}
	public void employeeDetails2(String name, int empid, double salary){
		System.out.println("Employee3   :"+ name);
		System.out.println("Employee3   :"+ empid);
		System.out.println("Employee3   :"+ salary);
		System.out.println("***************************************");
	}
	


public static void main(String args[])
	{
		Employee e1=new Employee();
		e1.employeeDetails("abc",100987, 2345.55f);
		
		Employee e2=new Employee();
		e2.employeeDetails1("def",1234,234.32f);
		
		Employee e3=new Employee();
		e3.employeeDetails2("ghi",123234,234.43f);
	
	}

}
