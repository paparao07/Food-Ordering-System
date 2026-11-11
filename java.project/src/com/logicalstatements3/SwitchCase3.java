package com.logicalstatements3;

import java.util.Scanner;

//WRP to print calculation Based on two numbers & with Arithmetic Operator symbol.

public class SwitchCase3 {

	public static void main(String[] args) {

		System.out.println("Welcome to Educational System ");
		String yn = "";
		
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a first number :");
			double d1 = sc.nextDouble();
			System.out.println("Enter a secound number :");
			double d2 = sc.nextDouble();

			System.out.println("Please Enter The Sybol like This +  -  *  /  %  ");
			String sym = sc.next();

			switch (sym) {

			case "+" -> System.out.println("Sum of the two numbers is " + (d1 + d2));
			case "-" -> System.out.println("differece of the two number is " + (d1 - d2));
			case "*" -> System.out.println("Product of the two numbers is " + (d1 * d2));
			case "/" -> System.out.println("Quotient of the two numbers is " + (d1 / d2));
			case "%" -> System.out.println("Remainder of the two numbers is " + (d1 % d2));
			default -> System.out.println("Invalid Number Enterd Please Check ");

			}
	       System.out.println("do You want to Continue ..? Click Y for Yes or Click N for No ");
	       yn = sc.next();// y or n
	    		   
		}while(yn.equalsIgnoreCase("y"));
		
		System.out.println(" You Click For EXIT ??? ");
	}

}
