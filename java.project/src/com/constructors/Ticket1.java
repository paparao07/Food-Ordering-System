package com.constructors;

import java.util.Scanner;

  class Movie {
	String movieName;
	double movieBudjet;
	String movieDirector;
	String heroName;

	Movie(String movieName, double movieBudjet, String movieDirector, String heroName) {
		this.movieName = movieName;
		this.movieBudjet = movieBudjet;
		this.movieDirector = movieDirector;
		this.heroName = heroName;

	}

}

class Ticket1 extends Movie {

	int numberOfTickets;
	double price = 300;

	Ticket1(String movieName, double movieBudjet, String movieDirector, String heroName) {
		this(movieName, movieBudjet, movieDirector, heroName, 1);

	}

	Ticket1(String movieName, double movieBudjet, String movieDirector, String heroName, int numberOfTickets) {

		super(movieName, movieBudjet, movieDirector, heroName);

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
		System.out.println("Name of the movie : " + movieName);
		System.out.println("movie budjet : " + movieBudjet);
		System.out.println("Name of the Director : " + movieDirector);
		System.out.println("name of the hero : " + heroName);
		System.out.println("Number of Tickets : " + numberOfTickets);
		System.out.println("Price per Ticket  : ₹" + price);
		System.out.println("Total Amount   : ₹" + (numberOfTickets * price));
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter name of the movie :  ");
		String movieName = sc.nextLine();

		System.out.println("Enter Movie Budjet   : ");
		double movieBudjet = sc.nextDouble();
		sc.nextLine();

		System.out.println("Enter movie Director : ");
		String movieDirector = sc.nextLine();

		System.out.println("Enter Hero name :  ");
		String heroName = sc.nextLine();

		System.out.println("Enter Number Of tickets :");
		int numberOfTickets = sc.nextInt();

		Ticket1 t = new Ticket1(movieName, movieBudjet, movieDirector, heroName, numberOfTickets);

		t.bookTicket();
		t.displayBookingDetails();

		sc.close();

	}

}
