package com.upskill.java;

public class Class_0_HelloWorld {
	
	// Access Modifier - public, private, protected, default
	
	public String name = "Rasel";   					// public - Any class can access it
	
	private int age = 55;								// private - Only same class can access it
	
	protected int ssn = 123451526;						// protected - Only same package & subclass can access it
	
			String address = "Hertiage Tower";			// default - works as public, only by classes in the same package.
	

	public static void main(String[] args) {
		
		System.out.println("Hello World");
		
		localVariableBD("Gyro"); 
		localVariableBD("Chinese");

	}
	//method 
	public static void localVariableBD(String Food){   		//method parametere 
		//local Variable 
		String City = "Dhaka"; 
		String Dinner = Food;  
		System.out.println("Dinner >>>" + Dinner);
	}
	//method
	public void localVariableUK(){
		//local variable 
		String City = "London";			//local method stays on method only 
	
	} 
	
	//instance Variable 
	String country = "USA";				//Instance Variable stays on class only 
	static String zip = "07124";		//Static variable store memory in class, not require to create object 

}



	