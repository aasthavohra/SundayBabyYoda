package com.upskill.java;

public class Class_1_MethodType_Object {

	
	static int hourlyIncome = 65; 		//Manual QA = 40-50$, Automation QA = 50-70$, SDET = 60-80$
	
	public static void main(String[] args) {
			weeklyIncomeVoid();
			annualIncomeVoid();  
			
		//static Method - can call directly 
			weeklyIncomeVoid(); 
			
			monthlyIncomeReturn2(); 
			
			System.out.println("Job Title ::: " +jobTitle());
			
			Class_1_MethodType_Object myobj = new Class_1_MethodType_Object();
			
			//class name 		object name = new class name ()
			myobj.annualIncomeVoid(); 
			
			int monthly = myobj.monthlyIncomeReturn();
			System.out.println("Monthly Income :::" + monthly); 

	}
	
	/*Types of Methods  
	 1.Void Method - empty method you can write any statement
	 2. Static Method - dont have to create object to call 
	 3. Return Type Method - must have to return any data 
	   */
		

	// Void Method 
	public static void annualIncomeVoid(){ 
		int anuual = hourlyIncome * 2000; 
		System.out.println("Annual Income :::" + anuual); 
	}
	
	// Static Method
	public static void weeklyIncomeVoid(){ 
		int weekly = hourlyIncome * 40; 
		System.out.println("Weekly Income :::" + weekly);
	}
		//Return Type Method - non-static
	public int monthlyIncomeReturn (){ 
		int monthly = hourlyIncome *180; 
		return monthly; 
	}
	// Return Type Method - static 
	public static int monthlyIncomeReturn2(){ 
		int monthly = hourlyIncome *180; 
		return monthly;  
		 
	}
	public static String jobTitle(){
		String title = "QA Automation Engineer";
		return title;
	}
		
}
