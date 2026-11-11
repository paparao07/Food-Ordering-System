package com.logicalstatements2;

//WRP to print Grade of student based on his marks...?

import java.util.Scanner;

public class NestedIfElse {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Marks Parcentage ! ! ! ");
		double marks = sc.nextDouble();
		
		if(marks > 100 || marks < 0) {
			System.out.println("Invalid marks  percentage !!!");
		}else if(marks >= 90) {
			System.out.println("Grade A");
		}
		else if(marks >= 80) {
			System.out.println("Grade B");
		}
		else if(marks >= 70) {
			System.out.println("Grade C");
		}
		else if(marks >= 60) {
			System.out.println("Grade D");
		}
		else if(marks >= 50) {
			System.out.println("Grade E");
		}
		else if(marks >= 35) {
			System.out.println("Just Passed ! ! !");
		}
		else {
			System.out.println("Failed  ! ! !");
		}
	}

}
