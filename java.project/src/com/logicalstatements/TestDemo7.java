package com.logicalstatements;

import java.util.Scanner;

public class TestDemo7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("___________________________________ ");
		System.out.println("Enter username : ");
	
		String username = sc.next();

		System.out.println("Enter password : ");
		String password = sc.next();
		System.out.println("___________________________________ ");

		if (username.equals("paparao") && password.equals("2003")) {
			System.out.println("Login Successful");
			System.out.println("Welcome To Java World ! ! ! !");
		} else {
			System.out.println("Invalid Username or Password");
		}

	}
}