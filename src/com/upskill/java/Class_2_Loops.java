package com.upskill.java;

public class Class_2_Loops {
	
	/* Types of Loops 
	  *1. For Loop 
	  2. while loop 
	  3. Do while Loop 
	  4. Infinite Loop 
	  */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// practiceForLoop(); 
	//	practicewhileloop();
	//	practiceDoWhile(); 
	//	practiceInfiniteLoop();
	//	practiceForLoop();		
		multipicationTable();
	}
 
	public static void practiceForLoop(){   //For Loop - do Again and Again upto upper limit 
		int i;  							//Initialize variables
		for(i=1; i<100; i++) { 				//setting lower limit, upper limit, increment or 
			System.out.println("For Loops Number = " + i);
		}
	}
	
	public static void practicewhileloop(){   					//while loop - do again and again up to condition match
		int i = 1; 												// initialize variable 
			while(i<1000){ 										// Setting Condition 
				System.out.println("for loops numbers=" + i); 	//statement 
				i++; 											//increment or decrement 
			}
	}
	public static void practiceDoWhile(){                           //Do While Loop - do action then match 
		int i = 1; 													// Initialize variables 
		do { 
			System.out.println("while Loops Numner = " + i); 		// statement 
		} while (i< 1000); 											//Checking Condition 
	}

		public static void practiceInfiniteLoop(){ 
			int i; 
			for(i=1; ; i++){ 
				System.out.println("for loops numbers= " + i);
		}
		}
		public static void practiceNestedForLoop(){										//Nested loop = loop inside another loop
			int i;																		//Initializing variable i
			int j;																		//Initializing variable j
			for(i=1; i<=10; i++){														//First loop for i
				for(j=1; j<=10; j++){													//Second loop for j
					System.out.println("Nested For Loops Numbers = " + i + ":" + j);	//Statement for j loop
				}
				System.out.println("Increase value of i -> " + i);}					//Statement for i loop
		}
			public static void multipicationTable() {
				
				for (int row = 1; row <= 10; row++) {
					for (int col = 1; col <= 10; col++) {
						int MultiplicationTable = row * col;
						System.out.print(MultiplicationTable + " ");
					}
					System.out.println("");
					
					

}
}
			
			
		}
		
		



