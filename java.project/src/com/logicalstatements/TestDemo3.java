package com.logicalstatements;

import java.util.Scanner;

public class TestDemo3 {

	public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            
            System.out.println("Enter number : ");
            double num = sc.nextDouble();
            
            if (num % 2 == 0) {
                System.out.println("********************");
                System.out.println("It is an Even Number");
            } else {
                System.out.println("It is an Odd Number");
            }
            
            
	}

}
