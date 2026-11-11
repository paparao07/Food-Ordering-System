package com.logicalstatements4.loops;

// WRP TO PRINT EVEN AND ODD NUMBERS FORM 0 TO 100...?

public class TestLpDemo2 {

	public static void main(String[] args) {
	       System.out.println("main method started ");

             System.out.println("Even numbers :");
		for (int i = 0; i <= 100; i++) {
			
			if(i % 2 == 0 && i!=0) {
				System.out.print(i + " ");
			}

		}
		System.out.println();
		System.out.println("______________________________________________________________________");
        System.out.println("Odd numbers :");

for (int i = 0; i <= 100; i++) {
			
			if(i % 2 == 1 && i!=0) {
				System.out.print(i + " ");
			}

		}
       System.out.println("main method ended ");
	}

}
