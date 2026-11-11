package com.logicalstatements;

import java.util.Scanner;

public class TestDemo1 {

	public static void main(String[] args) {

		System.out.println("main method started ");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age : ");
		double age = sc.nextDouble();

		if (age >= 18) {
			System.out.println("************congractulations*********** ");
			System.out.println(" you are eligible for Driving & Voting");
		} else {
			System.out.println("You are not eligible for Driving & Voting2");

		}
		System.out.println("main method ended");
	}

}
