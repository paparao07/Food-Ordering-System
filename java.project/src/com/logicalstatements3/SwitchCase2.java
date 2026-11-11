package com.logicalstatements3;

import java.util.Scanner;

// WRP to print T-shirt Description Based on size..?

public class SwitchCase2 {

	public static void main(String[] args) {
		System.out.println("Welcome To Akividu Shopping Mall ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your T-Shirt Size : ");
		int size = sc.nextInt();

		switch (size) {
		case 36 -> {
			System.out.println("Based on your T-Shirt number the size would Small");
			System.out.println("The Price  is 999/- ");
		}
		case 38 -> {
			System.out.println("Based on your T-Shirt number the size would Medium");
			System.out.println("The Price  is 1999/- ");
		}
		case 40 -> {
			System.out.println("Based on your T-Shirt number the size would Large ");
			System.out.println("The Price  is 2999/- ");
		}
		case 42 -> {
			System.out.println("Based on your T-Shirt number the size would X-Large");
			System.out.println("The Price  is 3999/- ");
		}
		case 44 -> {
			System.out.println("Based on your T-Shirt number the size would XX-Large ");
			System.out.println("The Price  is 4999/- ");
		}
		default -> System.out.println("Enterd T-Shirt Size is not Available  ");

		}

	}

}
