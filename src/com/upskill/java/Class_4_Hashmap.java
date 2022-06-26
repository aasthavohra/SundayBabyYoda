package com.upskill.java;

import java.util.HashMap;
import java.util.HashSet;

public class Class_4_Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		//Array store multiple value using index
		
		int age = 30;
		
		int[] ageYoda = new int [] {30, 24, 28, 32, 55,48, 52}; 
		
		//Array Index   [0} [1] [2] [3] 

		System.out.println("Array Value " + age); 
		
		System.out.println("Array Value " + ageYoda[3]); 
	
		System.out.println("Array Length " + ageYoda.length);
		
		//write an array called nameYoda 
		
		String[] nameYoda = new String[]{"Jafrin", "Imtiaz", "Kazi", "Rishi"}; 
		
		System.out.println("String Array Value " + nameYoda[3]); 
		
		System.out.println("String Array Length " + nameYoda.length);
		
		//multi Dimensional Array 
		
		int[][] ageYoda2D = { 
				{30, 24, 28, 32, 55},  //[0][0]  [0][1] [0][2] [0][3] [0][4]
				{98, 49, 11,}};        //[1][0]  [1][1] [1][2] 
		
		System.out.println("2D Array Value " + ageYoda2D[1][1]);
		
		//Multi Dimensional Print Array 
		
		for (int i=0; i<ageYoda2D.length; i++){ 
			for (int j=0; j<ageYoda2D[i].length; j++ ){  
				System.out.println(ageYoda2D[i][j]+ " "); 
				
				
			}
		}

		// hashmap store Multple data using key-value pair, Implementation of Map Interface 
		
		HashMap <String, Integer> Student = new HashMap <String, Integer>(); 
				
				Student.put("Azad", 30); 
				Student.put("Aastha", 21); 
				Student.put("Kazi", 27); 
				Student.put("Imtizi", 30); 
				Student.put("Rishi", 31); 
				Student.put("Imtiaz", 30); 
				Student.put("Jafrin", + 28); 
				
				System.out.println("Hashmap Value, Student Age" + Student.get("Azad"));
				
				HashMap <String, String> capitalCities = new HashMap<String, String>(); 
				capitalCities.put("England", "London");
				capitalCities.put("Germany", "Berlin"); 
				capitalCities.put("India","New  Delhi");
				capitalCities.put("Pakistan", "Islamabad");  
				
				System.out.println("Hashmap Value, capitalCities" + capitalCities.get("England"));

				
			// Hashset store unordered collection containing unique value, Implementation of Set Interface 
				

	HashSet<String> Car = new HashSet <String> (); 
	Car.add("BMW"); 
	Car.add("Audi"); 
	Car.add("ford"); 
	
		System.out.println("Hashset value: " + Car); 
		System.out.println("Hashset length: " + Car.size()); 

		
	
	}
	
		


				
				
	}


