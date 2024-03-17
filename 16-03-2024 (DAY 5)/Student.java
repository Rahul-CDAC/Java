package in.acts.cdac;

import java.util.Scanner;

class StudentDetails {

		private String name;
		private int age;
		private float marks;
		
		
		public void acceptRecord() {
			    Scanner sc = new Scanner (System.in);{
				System.out.println("Name of Student  :");
				this.name=sc.nextLine();
				
				System.out.println("Age of Student  :");
				this.age=sc.nextInt();
				
				System.out.println("Marks of Student  :");
				this.marks=sc.nextFloat();
			}
			
		}
		
		public void printRecord() {
			System.out.println(this.name + " " + this.age + " " + this.marks);
		}
	}
	
	public class Student{
		public static void main(String args[]) {
			StudentDetails  s1=new StudentDetails ();
			s1.acceptRecord();
			s1.printRecord();
			
			StudentDetails  s2=new StudentDetails ();
			s2.acceptRecord();
			s2.printRecord();
			
			StudentDetails  s3=new StudentDetails ();
			s3.acceptRecord();
			s3.printRecord();
			
			StudentDetails  s4=new StudentDetails ();
			s4.acceptRecord();
			s4.printRecord();
			
		}
	
		
	}


