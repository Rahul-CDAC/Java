package in.acts.cdac;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     Scanner sc = new Scanner(System.in);
	     System.out.println("enter the first number :");
	     double num1= sc.nextDouble();
	     System.out.println("enter the second number :");
	     double num2=sc.nextDouble();
	     
	     System.out.println("enter any one operator (+,-,*,/):");
	     char operator=sc.next().charAt(0);
	     
	     double result;
	     
	     switch(operator) {
	     
	     case '+':
	    	 result= num1+num2;
	    	 System.out.println("addition of two number: "+"num1 "+"+ num2 = "+ result);
	    	 break;
	    	 
	     case '-':
	    	 result= num1-num2;
	    	 System.out.println("substraction of two number: "+"num1 "+"- num2 = "+ result);
	    	 break;
	    	 
	     case '*':
	    	 result= num1*num2;
	    	 System.out.println("multiplication of two number: "+"num1 "+"* num2 = "+ result);
	    	 break;
	    	 
	     case '/':
	    	 result= num1/num2;
	    	 System.out.println("division of two number: "+"num1 "+"/ num2 = "+ result);
	    	 break;
	    	 
	    default:
	    	System.out.println("invalid operator, try valid operator");
	     }
	 
	}

}
