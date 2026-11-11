package com.logicalstatements2;

import java.util.Scanner;

public class MobileReacharge {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Reacharge Amount : ");
		double amount = sc.nextDouble();

		if (amount < 10) {
			System.out.println("Invalid Reacharge Amount ");
		} else if (amount <= 199) {
			System.out.println("Basic Plan ");
		} else if (amount <= 499) {
			System.out.println("Standard plan ");
		} else if (amount <= 999) {
			System.out.println("Premium Plan ");
		} else {
			System.out.println("Unlimited Plan ");

		}

	}

}
