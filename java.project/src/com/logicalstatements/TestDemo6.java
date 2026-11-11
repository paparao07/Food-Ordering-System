package com.logicalstatements;

import java.util.Scanner;

public class TestDemo6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Persentage % :");
		double p = sc.nextDouble();
		
		System.out.println("Enter Your Encome  :");
		double e = sc .nextDouble();
		
		if(p >= 80 && e <= 300000) {
			System.out.println("You Are Eligible for Scolorship ");
		}else {
			System.out.println("you are not Eligible for Scolor Ship");
		}

	}

}
