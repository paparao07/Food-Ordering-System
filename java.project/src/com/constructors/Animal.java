package com.constructors;

// parent or Super or base 
public class Animal {
	String breed = "Persian";
	int age = 3;

	Animal() {
		System.out.println("Animal constructor called");
	}

	public static void main(String[] args) {
		System.out.println("main method started from animal ");

	}

}

// Child or Sub or derived  
class Dog extends Animal {
	String breed = "German Shepherd";
	int age = 4;

	Dog() {
		System.out.println("dog constructor called ");

	}

	public static void main(String[] args) {
		System.out.println("Main method started from dog calss ");

		Dog d = new Dog();
		d.animalInfo();
	}

	void animalInfo() {
		System.out.println("Cat info ");
		System.out.println("Breed of the dog : " + super.breed);
		System.out.println("age of the dog : " + super.age);
		System.out.println("Dog info ");
		System.out.println("Breed of the dog : " + this.breed);
		System.out.println("age of the dog : " + this.age);

	}

}