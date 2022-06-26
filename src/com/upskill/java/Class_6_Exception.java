package com.upskill.java;

public class Class_6_Exception {

	public static void main(String[] args) {

	//Built-in Exceptions - ArrayIndexOutOfBoundsException
		
	try{
		int[] ageGroup = new int[]{25, 35, 32, 38, 50, 56};
		System.out.println("Student Age = " + ageGroup[8]);
	} catch (Exception e){
		System.out.println("Test 20 failed !");
//		e.printStackTrace();
	}
	
	//Specific Built-in Exceptions - NumberFormatException
	
	try{
		int num  = Integer.parseInt("Rasel");
		System.out.println("Value of num int = " + num);
	} catch (NumberFormatException e){
		System.out.println("Please enter a valid int value !");
//		e.printStackTrace();
	}
	finally { 
		System.out.println("Test execution complete ! ");

	}
	}
}
	
	


		
