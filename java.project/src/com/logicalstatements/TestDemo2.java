package com.logicalstatements;

import java.util.Scanner;

public class TestDemo2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter number ");
		int num = sc.nextInt();
		
		if(num >= 0) {
			System.out.println("******************");
			System.out.println("it is a positive number !!! ");
			
		}else {
			System.out.println("it is a negative number !!!");
		}
		
	}

}
