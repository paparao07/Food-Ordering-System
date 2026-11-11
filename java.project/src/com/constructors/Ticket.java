package com.constructors;

import java.util.Scanner;

class Railway {

	String passengerName;
	int age;
	String source;
	String destination;

	Railway(String passengerName, int age, String source, String destination) {
		this.passengerName = passengerName;
		this.age = age;
		this.source = source;
		this.destination = destination;
	}
}

public class Ticket extends Railway {

	int numberOfTickets;
	double price = 500;

	Ticket(String passengerName, int age, String source, String destination) {
		this(passengerName, age, source, destination, 1);

	}

	Ticket(String passengerName, int age, String source, String destination, int numberOfTickets) {

		super(passengerName, age, source, destination);

		this.numberOfTickets = numberOfTickets;

	}

	void bookTicket() {
		double totalAmount = numberOfTickets * price;

		System.out.println("\n===== BOOKING SUCCESSFUL =====");
		System.out.println("Total Ticket Amount : ₹" + totalAmount);
	}

	// Method to display details
	void displayBookingDetails() {
		System.out.println("\n===== BOOKING DETAILS =====");
		System.out.println("Passenger Name      : " + passengerName);
		System.out.println("Age                 : " + age);
		System.out.println("Source              : " + source);
		System.out.println("Destination         : " + destination);
		System.out.println("Number of Tickets   : " + numberOfTickets);
		System.out.println("Price per Ticket    : ₹" + price);
		System.out.println("Total Amount        : ₹" + (numberOfTickets * price));
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Name of the Passenger : ");
		String name = sc.nextLine();

		System.out.println("Enter passenger age :");
		int age = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter Source :");
		String source = sc.nextLine();

		System.out.println("Enter destination :");
		String destination = sc.nextLine();

		System.out.println("Enter Number Of tickets :");
		int numberOfTickets = sc.nextInt();

		Ticket t = new Ticket(name, age, source, destination, numberOfTickets);

		t.bookTicket();
		t.displayBookingDetails();

		sc.close();
	}
}