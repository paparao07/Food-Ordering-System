package com.methodoverriding;


import java.util.Scanner;

// Abstract Parent Class
abstract class FoodOrder {

    abstract void calculateBill();

    abstract void prepareOrder();
}

// Child Class 1
class PizzaOrder extends FoodOrder {

    int quantity;
    double price = 250;

    PizzaOrder(int quantity) {
        this.quantity = quantity;
    }

    @Override
    void calculateBill() {
        System.out.println("Pizza Bill: Rs." + (quantity * price));
    }

    @Override
    void prepareOrder() {
        System.out.println("Preparing Pizza with cheese and toppings...");
    }
}

// Child Class 2
class BurgerOrder extends FoodOrder {

    int quantity;
    double price = 120;

    BurgerOrder(int quantity) {
        this.quantity = quantity;
    }

    @Override
    void calculateBill() {
        System.out.println("Burger Bill: Rs." + (quantity * price));
    }

    @Override
    void prepareOrder() {
        System.out.println("Preparing Burger with vegetables and cheese...");
    }
}

// Child Class 3
class BiryaniOrder extends FoodOrder {

    int quantity;
    double price = 180;

    BiryaniOrder(int quantity) {
        this.quantity = quantity;
    }

    @Override
    void calculateBill() {
        System.out.println("Biryani Bill: Rs." + (quantity * price));
    }

    @Override
    void prepareOrder() {
        System.out.println("Preparing delicious Biryani with spices...");
    }
}
class CurdRice extends FoodOrder {

    int quantity;
    double price = 99;

    CurdRice(int quantity) {
        this.quantity = quantity;
    }

    @Override
    void calculateBill() {
        System.out.println("CurdRice Bill: Rs." + (quantity * price));
    }

    @Override
    void prepareOrder() {
        System.out.println("Preparing delicious CurdRice with fruits...");
    }
}

// Main Class
public class FoodOrderingSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== FOOD ORDERING SYSTEM =====");
        System.out.println("1. Pizza - Rs.250");
        System.out.println("2. Burger - Rs.120");
        System.out.println("3. Biryani - Rs.180");
        System.out.println("4.CurdRice - Rs.99");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        FoodOrder order;

        switch (choice) {

            case 1:
                order = new PizzaOrder(quantity);
                break;

            case 2:
                order = new BurgerOrder(quantity);
                break;

            case 3:
                order = new BiryaniOrder(quantity);
                break;
            case 4:
                order = new CurdRice(quantity);
                break;

            default:
                System.out.println("Invalid food choice!");
                sc.close();
                return;
        }

        System.out.println("\n===== ORDER DETAILS =====");

        order.calculateBill();
        order.prepareOrder();

        System.out.println("Thank you for ordering!");

        sc.close();
    }
}
