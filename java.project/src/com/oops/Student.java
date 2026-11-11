package com.oops;

class Address {
	String city;

	public Address(String city) {
		this.city = city;
	}
}

public class Student implements Cloneable {

	int id;
	String name;
	Address address;

	public Student(int id,String name,Address address) {
		this.id= id;
		this.name =name;
		this.address= address;
		
	}
	@Override
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
	

}
