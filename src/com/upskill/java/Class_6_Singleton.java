package com.upskill.java;

public class Class_6_Singleton { 
	
	// Can only one object 
	//Private constructor, it prevents any other class from instantising 
	
private Class_6_Singleton(){

		

	}

	

	//Private static object of the class

	

	private static Class_6_Singleton objSingleton = new Class_6_Singleton();

	

	//Static instance method


	public static Class_6_Singleton getInstance(){

		return objSingleton;

	}

	

	//Method protected by singleton-nese


	protected static void demo(){

		System.out.println("Demo method for singleton class");

	}


//test git
	
}
