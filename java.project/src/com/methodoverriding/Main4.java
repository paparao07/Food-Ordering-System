package com.methodoverriding;

class Device {
	private String brand;
	private double price;

	// Setter methods
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	// Getter methods
	public String setBrand() {
		return brand;
	}

	public double setPrice() {
		return price;
	}

	void displayDetails() {
		System.out.println("Brand :" + brand);
		System.out.println("price :" + price);
	}
}

class Laptop extends Device {
	private String ram;
	private String processor;

	public void setRam(String ram) {
		this.ram = ram;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public void runIDE() {
		System.out.println("Laptop is Running IDE");
	}

	public void compileCode() {
		System.out.println("Laptop is compiling  java Code");
	}

	@Override
	public void displayDetails() {
		System.out.println("\n--- Laptop Details ---");
		super.displayDetails();
		System.out.println("RAM: " + ram);
		System.out.println("Processor: " + processor);
	}
}

class Mobile extends Device {
	private String camera;
	private String battery;

	public void setCamera(String camera) {
		this.camera = camera;
	}

	public void setBattery(String battery) {
		this.battery = battery;
	}

	public void makeCall() {
		System.out.println("Mobile is making a call");
	}

	public void takePhoto() {
		System.out.println("Mobile is taking a photo");
	}

	@Override
	public void displayDetails() {
		System.out.println("\n--- Mobile Details ---");
		super.displayDetails();
		System.out.println("Camera: " + camera);
		System.out.println("Battery: " + battery);
	}
}

public class Main4 {

	public static void main(String[] args) {

		Laptop l = new Laptop();

		l.setBrand("Dell");
		l.setPrice(65000);
		l.setRam("16GB");
		l.setProcessor("Intel i5");

		// Creating Mobile object
		Mobile m = new Mobile();

		m.setBrand("Samsung");
		m.setPrice(25000);
		m.setCamera("50MP");
		m.setBattery("5000mAh");

		// Runtime Polymorphism
		Device d;

		d = l;
		d.displayDetails();

		d = m;
		d.displayDetails();

		// Calling Laptop specific methods
		System.out.println("\n--- Laptop Operations ---");
		l.runIDE();
		l.compileCode();

		// Calling Mobile specific methods
		System.out.println("\n--- Mobile Operations ---");
		m.makeCall();
		m.takePhoto();

	}

}
