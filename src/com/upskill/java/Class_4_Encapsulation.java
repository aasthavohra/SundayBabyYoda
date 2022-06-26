package com.upskill.java;

public class Class_4_Encapsulation {
	
	//Encapsulation used to hide the data using setter and getter method
	
	private int ssn = 67857655;				//Write only
	private String username = "user69";		//Read only
	private String name = "rasel";			//Write & Read
	
	public void setSSN(int value){			//set the data
		ssn = value;
	}
	
	public String getUsername(){			//get the data
		return username;
	}
	
	public void setName(String value){		//set the data
		name = value;
	}
	
	public String getName(){				//get the data
		return name;
	}

	public static void main(String[] args) {
		Class_4_Encapsulation obj = new Class_4_Encapsulation();
		obj.setSSN(8989898);
		System.out.println("Username : " + obj.getUsername());
		obj.setName("Alam");
		System.out.println("Name : " + obj.getName());
	}
}

