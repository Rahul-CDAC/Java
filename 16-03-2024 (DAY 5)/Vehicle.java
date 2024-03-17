package in.acts.cdac;


class Vehicle {
	public void feature(String colourName) {
			System.out.println("colour of vehicle  :" + colourName);
			
	}
   public void feature1(double price)
      {
	System.out.println("price of a car  :"+ price);
	
}
   public void feature2(String model)
   {
	System.out.println("model of a car  :"+ model);
   }


public static void main(String[]args)
{
	Vehicle v= new Vehicle();
	
	v.feature("white"); // method calling
	v.feature1(20345.23); // method calling
	v.feature2("SUV'S");// method calling
	
}

}

