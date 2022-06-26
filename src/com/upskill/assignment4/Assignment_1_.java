package com.upskill.assignment4;

public class Assignment_1_ { 
	
	private String username = "user"; 
	private String password = "password"; 
	private String first_name = "Aastha";  
	private String last_name  = "vohra"; 
	private String email = "vohra.aastha18@gmail.com"; 
	
	
	Void Display(){ 
		System.out.println("username" + username); 
		System.out.println("password" + password); 
		System.out.println("first name" + first_name); 
		System.out.println("last name" + last_name); 
		System.out.println("username" + username);
		return null; 

	}
	
	
	public String getUsername(){ 
		return username; 
	}
	
	public void setName(String Value){ 
		username = Value; 
	
	}
	
	public void setPassword(String Value){ 
		password = Value; 
		
	}
}


