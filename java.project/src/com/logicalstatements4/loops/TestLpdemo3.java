package com.logicalstatements4.loops;

import java.util.Scanner;

// WRP TO PRINT FACTORS/ DIVIDERS OF GIVEN NUMBER..?
// input : 6
// output : 1 2 3 6
public class TestLpdemo3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number : ");
		int n = sc.nextInt();
		findFactors(n);

	}

	static void findFactors(int n) {
		for (int i = 1; i <= n/2; i++) {
			if (n % i == 0) {
				System.out.println(i + " ");
			}
		}

	}

}
