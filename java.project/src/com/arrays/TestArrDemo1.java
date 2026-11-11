package com.arrays;

public class TestArrDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started");
//    Step1: Declaration		
		int[] ages;

//	    Step2:Creation
		ages = new int[10];// 0 1 2 3 4 5 6 7 8 9

//	    Step3:Initialization
		ages[0] = 21;
		ages[1] = 22;
		ages[2] = 23;
		ages[3] = 24;
		ages[4] = 23;
		ages[5] = 21;
		ages[6] = 23;
		ages[7] = 22;
		ages[8] = 21;
		ages[9] = 24;

//     Step:4 Representation with for each loop
		//for (int age : ages) {
			//if (age % 2 == 0) {
				//System.out.println(age);
			//}
		//}
//	     Step:4 Representation with for loop
		for(int i= 0;i<ages.length;i++) {
			System.out.println(ages[i]);
		}
		

		System.out.println("main method ended");

	}

}
