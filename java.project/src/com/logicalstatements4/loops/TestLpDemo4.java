package com.logicalstatements4.loops;

import java.util.Scanner;

// WRP The Given Number Is Perfect or not..?

//A perfect number is a positive whole number that equals the sum of its proper divisors, meaning all of its positive divisors excluding the number itself.
// Examples of Perfect Numbers6: Its proper divisors are 1, 2, and 3. Adding them up gives \(1 + 2 + 3 = 6\).
//28: Its proper divisors are 1, 2, 4, 7, and 14. Adding them up gives \(1 + 2 + 4 + 7 + 14 = 28\).

public class TestLpDemo4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();

		boolean flag = isPerfect(n);

		if (flag) {
			System.out.println("The Given Number is Perfect ");

		} else {
			System.out.println("The Given Number is not Perfect ");
		}

	}

	static boolean isPerfect(int n) {
		boolean status = false;
		int sum = 0;
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				sum = sum + i;
			}

		}

		if (sum == n) {
			status = true;
		}
		return status;
	}

}
