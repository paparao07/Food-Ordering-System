package com.logicalstatements;

import java.util.Scanner;

public class TestDemo4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age :");
		int age = sc.nextInt();

		System.out.println("Enter your marks : ");
		int marks = sc.nextInt();

		if (age >= 17 && marks >= 60) {
			System.out.println("You are eligible for College addmission $$$");
		} else {
			System.out.println("you are not eligible for Addimission ??");
		}

	}

}
