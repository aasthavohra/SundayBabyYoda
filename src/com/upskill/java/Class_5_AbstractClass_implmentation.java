package com.upskill.java;

public class Class_5_AbstractClass_implmentation extends Class_5_AbstractClass {
	
	public static void main(String[] args) {

		Class_5_interface_implementation myObj = new Class_5_interface_implementation();
		myObj.iDoor();
		System.out.println("Number of Wheel in Car : " + myObj.iWheels());
		System.out.println("Color of the Car : " + myObj.iColor());
		myObj.iSeat();
		myObj.iMirror();
	}

	public void iDoor() {
		int numDoor = 2;
		System.out.println("Number of Door in Car : " + numDoor);
		
	}

	
	public int iWheels() {
		int numWheel = 4;
		return numWheel;
	}

	
	public String iColor() {
		String color = "Blue";
		return color;
	}

	
	public void iSeat() {
		int numSeat = 5;
		System.out.println("Number of Seat in Car : " + numSeat);
		
	} 
	
	public void iMirror(){
		int mirror = 2;
		
		System.out.println("Number of Mirror ; " + mirror);
		
		
	}

	@Override
	public int iWheel() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}