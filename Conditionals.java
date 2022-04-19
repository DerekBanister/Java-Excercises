package main;

import java.util.Scanner;

public class Conditionals {

	public static void main(String[] args) {
		
		// #1
		int x = 15;
		if (x<10) {
			System.out.println(x);
		}

		// #2
		int x1 = 7;
		if (x1 < 10) {
			System.out.println("Less than 10");
		} else {
			System.out.println("Greater than 10");
		}
		
		// #3
		int x2 = 15;
		if (x2 < 10) {
			System.out.println("Less than 10");
		} else if (x2 > 10 && x2 < 20){
			System.out.println("Between 10 and 20");
		} else {
			System.out.println("Greater than 20");
		}
		// #4
		int x3 = 15;
		if (x3 > 10 && x3 < 20) {
			System.out.println("In range");
		} else {
			System.out.println("Out of range");
		}
		// #5
		Scanner userInput = new Scanner(System.in);
		System.out.println("What is your grade");
		int grade = userInput.nextInt();
				if(grade >= 90) {
					System.out.println("A");
				} else if (grade >= 80 && grade <= 90) {
					System.out.println("B");
				} else if (grade >= 70 && grade <= 80) {
					System.out.println("C");
				} else if (grade >= 60 && grade <= 70) {
					System.out.println("D");
				} else if (grade >= 50 && grade <= 60){
					System.out.println("F");
				} else {
					System.out.println("Out of range");
				}
		// #6
		System.out.println("Enter a number to get the corresponding day of the week");
		int userInt = userInput.nextInt();
		 switch (userInt) {
         case 1:
        	 System.out.println("Monday");
             break;
         case 2:
        	 System.out.println("Tuesday");
             break;
         case 3:
        	 System.out.println("Weds");
             break;
         case 4:
        	 System.out.println("Thursday");
             break;
         case 5:
        	 System.out.println("Friday");
             break;
         case 6:
        	 System.out.println("Saturday");
             break;
         case 7:
        	 System.out.println("Sunday");
             break;
         default:
        	 System.out.println("Out of range");
             break;
	
		}
					
	}
}

