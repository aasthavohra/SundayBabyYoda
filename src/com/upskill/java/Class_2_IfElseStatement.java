package com.upskill.java;

public class Class_2_IfElseStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
	//nested if Else Statement
		
		int year = 2011; 
		
		if (year<2000){ 
			System.out.println("20st century"); 
		} else {  
			if (year >= 2019 && year <=2022){
				System.out.println("Pandemic");
			} else { 
				System.out.println("21st century"); 

			}
			}
		}
	
		
	public void ifElse(){
		
		// less then 13 = children 
		// 13-18 = teenager 
		// 18-60 = adult 
		// 60-100 = senior 
		// 100+ = champion
	
		int age = 60; 
		
		if(age<=13){ 

		System.out.println("You are Children"); 
		} else if(age> 13&& age < 18){ 
			System.out.println("You are teenager"); 
		} else if(age >= 18 && age <=59){
			System.out.println("You are adult");
		} else if( age>= 60 && age<=99){
			System.out.println("You are senior");
		} else { 
			System.out.println("You are Champion"); 
		}
		
	}

}
