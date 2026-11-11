package com.logicalstatements3;

import java.util.Scanner;

public class RestaurantSC {

	public static void main(String[] args) {
		System.out.println("Welcome To Restaurant ");

		Scanner sc = new Scanner(System.in);
		String yn = "";
		do {

			System.out.println("\n----- FOOD MENU -----");
			System.out.println("1. Pizza - Rs.250");
			System.out.println("2. Burger - Rs.120");
			System.out.println("3. Biryani - Rs.200");
			System.out.println("4. Coffee - Rs.50");

			System.out.println("Enter Your Food Choice : ");
			int choice = sc.nextInt();
			System.out.println("Enter Your Quantity :");
			int quantity = sc.nextInt();

			double price = 0;
			String foodName = "";

			switch (choice) {

			case 1 -> {
				foodName = "Pizza";
				price = 250;
			}

			case 2 -> {
				foodName = "Burger";
				price = 120;
			}

			case 3 -> {
				foodName = "Biryani";
				price = 200;
			}

			case 4 -> {
				foodName = "Coffee";
				price = 50;
			}

			default -> {
				System.out.println("Invalid food choice!");
				System.out.println("Please select a valid option.");
				continue;

			}
			}

			double totalBill = price * quantity;

			System.out.println("\n----- BILL DETAILS -----");
			System.out.println("Food Name: " + foodName);
			System.out.println("Price: Rs." + price);
			System.out.println("Quantity: " + quantity);
			System.out.println("Total Bill: Rs." + totalBill);

			System.out.println("\nDo you want to continue?");
			System.out.println("Enter Y for Yes or N for No");

			yn = sc.next();

		} while (yn.equalsIgnoreCase("y"));

		System.out.println("Thank you! Visit Again.");

	}
}
