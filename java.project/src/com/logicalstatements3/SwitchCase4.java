package com.logicalstatements3;

import java.util.Scanner;

public class SwitchCase4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A day number : ");
		int day = sc.nextInt();

		String info = getDayinfo(day);

		System.out.println(info);

	}

	private static String getDayinfo(int day) {

		String info = switch (day) {
		case 1 -> {
			System.out.println("It is a Holiday !!! ");
			yield "Sunday";
		}
		case 2 -> {
			System.out.println("Its A lazy Day  !!! ");
			yield "Monday";
		}
		case 3, 4, 5 -> {
			System.out.println("These Are ROTINUE Days   !!! ");
			yield "TWT";
		}
		case 6 -> {
			System.out.println("Preparation Day  ");
			yield "Friday";
		}

		case 7 -> {
			System.out.println("Exams day !!! ");
			yield "Saturday";
		}
		default -> "not availasble ";
		};
		
		return info;
	}

}
