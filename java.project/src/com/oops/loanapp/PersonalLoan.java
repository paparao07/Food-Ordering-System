package com.oops.loanapp;

import java.util.Scanner;

public class PersonalLoan {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Welcome to  SBI Loan Banking System");

		PersonalLoan p1 = new PersonalLoan();
	}

	double getEmployeeSalary() {
		System.out.println("Enter Your Salary : ");
		double salary = sc.nextDouble();
		return salary;
	}

	int getEmployeeAge() {
		System.out.println("Enter Your Age : ");
		int age = sc.nextInt();
		return age;
	}

	int getCibilScore() {
		System.out.println("Enter Your Cible Score : ");
		int cibil = sc.nextInt();
		return cibil;
	}

	double getROI() {
		double roi = 0;
		int cibil = getCibilScore();

		if (cibil > 800 && cibil <= 900) {
			System.out.println("Excellent : Strong cridit profile,best loan terms.");
			roi = 9.0;
		} else if (cibil > 770 && cibil <= 800) {
			System.out.println("Very good : high approvel chances, competative rates. ");
			roi = 9.5;
		} else if (cibil > 700 && cibil <= 770) {
			System.out.println("Good : Eligible for most loans with decent terms. ");
			roi = 10.0;
		} else if (cibil > 600 && cibil <= 700) {
			System.out.println("Average : May get loans but at higher interest ");
			roi = 12.0;
		} else if (cibil > 300 && cibil <= 600) {
			System.out.println("Poor : High risk , loasn application often rejected ");
			roi = 14.5;
		} else {
			System.out.println("Invalid cibil score ");
		}

		return cibil;

	}

	boolean isAadharvalid() {
		System.out.println("Enter your 12 Digit Aadhar card Number :");
		String aadhar = sc.next();
		boolean aadharstatus = aadhar.matches("[2-9][0-9]{11}");
		return aadharstatus;
	}

	boolean isPanvalid() {
		System.out.println("Enter your 10 digit Pan card Number :");
		String pan = sc.next();
		boolean panStatus = pan.matches("[A-Z]{5}[0-9]{4}{A-Z}{1}");
		return panStatus;
	}
	
	boolean isPhonevalid() {
		System.out.println("Enter your 10 digit Phone Number :");
		String phone = sc.next();
		boolean phoneStatus = phone.matches("[6-9]{1}[0-9]{9}");
		return phoneStatus;
	}

}
