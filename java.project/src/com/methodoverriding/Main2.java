package com.methodoverriding;


class User {

    String username;
    String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    void display() {
        System.out.println("Username: " + username);
    }
}

class Student extends User {

    public Student(String username, String password) {
        super(username, password);
    }

    void submitAssignment() {
        System.out.println(username + " submitted the assignment.");
    }
}

class Instructor extends User {

    public Instructor(String username, String password) {
        super(username, password);
    }

    void createCourse() {
        System.out.println(username + " created a new course.");
    }
}

class Admin extends User {

    public Admin(String username, String password) {
        super(username, password);
    }

    void manageUsers() {
        System.out.println(username + " is managing users.");
    }
}

public class Main2 {

    public static void main(String[] args) {

        Student s1 = new Student("Ram", "12345");
        Instructor i1 = new Instructor("Raju", "abc123");
        Admin a1 = new Admin("Chinnu", "admin123");

        System.out.println("----- Student Details -----");
        s1.display();
        s1.submitAssignment();

        System.out.println("---------------------------");

        System.out.println("----- Instructor Details -----");
        i1.display();
        i1.createCourse();

        System.out.println("---------------------------");

        System.out.println("----- Admin Details -----");
        a1.display();
        a1.manageUsers();
    }
}
