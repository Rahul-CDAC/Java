package in.acts.cdac;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num3=10.00;
		double num4=20.54;
		double result1=num3+num4;
		
		float num5=20.9f;
		float num6=(float)num3; //widening
		float result2=num5+num6;
		
		int num1= (int)num4;// widening
		int num2=100;
		int result= num1+num2;
		
		System.out.println("Addition of int number:"+ result);
		System.out.println("Addition of double number:"+ result1);
		System.out.println("Addition of float number:"+ result2);

	}

}
