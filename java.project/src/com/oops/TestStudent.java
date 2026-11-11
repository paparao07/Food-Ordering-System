package com.oops;

public class TestStudent {

	public static void main(String[] args) throws CloneNotSupportedException{
		Address add = new Address("Hydrabad");
		Student s1 = new Student(101, "paparao", add);
		
		System.out.println(s1.id);
		System.out.println(s1.name);
		System.out.println(s1.address.city);
		System.out.println("------------------------------");
		
		Student s2 =(Student) s1.clone();
		System.out.println(s2.id);
		System.out.println(s2.name);
		System.out.println(s2.address.city);
		System.out.println("------------------------------");

		
		s2.name = "C V N Srikanth";
		s2.address.city = "Bangalore";
		
		System.out.println(s1.id);//101
		System.out.println(s1.name);//Srikanth
		System.out.println(s1.address.city);//Bangalore
		System.out.println("--------------------------");
		System.out.println(s2.id);//101
		System.out.println(s2.name);//C V N Srikanth 
		System.out.println(s2.address.city);//Bangalore
		
		
	}

}
