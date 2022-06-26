package com.upskill.assignment2;

/*  You are given two integer number (a=25, b=30), write a program to swap them and 
      display result on the screen.   */ 

public class Assignment_2_6 {

	/* Problem 6. Write a java program to find the prime number from 1 to 100 and print them.*/
	
	public static void main(String[] args) {
		primeNumber();
	}
	
	//2,3,5,7,11,13,17...
	
	public static void primeNumber(){
		int upperbound = 100;
		for (int number = 2; number <= upperbound; ++number) {

			int maxFactor = (int) Math.sqrt(number);		//sq rt
			boolean isPrime = true;							//everything is prime
			int factor = 2;									//divide it by 2
			while (isPrime && factor <= maxFactor) {		//logic it can be divided
				if (number % factor == 0) {					//divide by 2
					isPrime = false;						// not a prime
				}
				++factor;
			}

			if (isPrime)
				System.out.println(number + " is a prime");
		}
	}
}
