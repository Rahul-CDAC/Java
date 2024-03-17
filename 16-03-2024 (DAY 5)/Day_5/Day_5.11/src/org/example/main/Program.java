package org.example.main;

import java.util.Scanner;

class Employee{
	private String name;
	private int empid;
	private float salary;
	
	public void acceptRecord( /*Employee this*/ ) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Name	:	");
		this.name = sc.nextLine();
		System.out.print("Empid	:	");
		this.empid = sc.nextInt();
		System.out.print("Salary	:	");
		this.salary = sc.nextFloat();
	}
	public void printRecord( /*Employee this*/ ) {
		System.out.println( this.name+"	"+this.empid+"	"+this.salary);
	}
}
public class Program {
	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.acceptRecord( );	//emp1.acceptRecord( emp1 );
		emp1.printRecord( );	//emp1.printRecord( emp1 );
		
		Employee emp2 = new Employee();
		emp2.acceptRecord( );	//emp2.acceptRecord( emp2 );
		emp2.printRecord( );	//emp2.printRecord( emp2 );
		
		Employee emp3 = new Employee();
		emp3.acceptRecord( );	//emp3.acceptRecord( emp3 );
		emp3.printRecord( );	//emp3.printRecord( emp3);
	}
}
