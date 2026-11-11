package com.logicalstatements;

import java.util.Scanner;

public class TestDemo5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Balance :");
		Double balance = sc.nextDouble();

		System.out.println("Enter Your Withdraw amount : ");
		double amount = sc.nextDouble();

		if (amount <= balance && amount > 0) {
			System.out.println(" ************WITHDRAW SUCESSFULL*************");
			System.out.println("Withdraw amount " + amount);
			System.out.println("Remaining Balance " + (balance - amount));

		}else {
			System.out.println("Invalid Amount ");
		}

	}

}
