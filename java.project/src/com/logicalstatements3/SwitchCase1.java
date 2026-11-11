package com.logicalstatements3;

// WRP to print cricketer Info based on jersey Number...??

import java.util.Scanner;

public class SwitchCase1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome TO Indian Cricketers ");
		System.out.println("Enter Jersey number :");
		int jno = sc.nextInt();

		switch (jno) {

		case 7:
			System.out.println("Mahendra Singh Dhoni + Jersey numder  is : 7 ");
			System.out.println("Captain cool ");
			System.out.println("Grate Wiket keeper & Talented Batsman ");
			break;
		case 18:
			System.out.println("Virat kohli  + Jersey Number is : 18");
			System.out.println("Consistancy Batsman & vrey Aggresive Fire ");
			System.out.println(" King Kohli ");
			break;
		case 45:
			System.out.println("Rohit Sharma + Jersey Number is : 45 ");
			System.out.println("Openar batsMan ");
			System.out.println("Hit Man & Big Sixes ");
			break;

		case 96:
			System.out.println("Shreyas Iyer + Jersey Number is : 96 ");
			System.out.println("Good Captain & Best Batsman ");
			break;

		case 33:
			System.out.println("Hardik Pandya + jersey number is : 33 ");
			System.out.println("All rounder & Very Talented Player ");
			break;
		default:
			System.out.println("Enter Jersey number is Not Avalible ");

		}

	}

}
