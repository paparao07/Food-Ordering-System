package com.interview;
// Fibonacci Series Simple idea: Next number = previous two numbers added.

public class Main {

	public static void main(String[] args) {
		int a = 0, b = 1;
		for (int i = 1; i <= 10; i++) {
			System.out.println(a + " ");
			int c = a + b;
			a = b;
			b = c;
		}
	}

}
