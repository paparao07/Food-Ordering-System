package com.methodoverriding;



class Payment {
    String customerName;
    double amount;

    public Payment(String customerName, double amount) {
        this.customerName = customerName;
        this.amount = amount;
    }

    void makePayment() {
        System.out.println("Payment Processing ....");
    }
}

class UPIPayment extends Payment {

    String upiId;

    public UPIPayment(String customerName, double amount, String upiId) {
        super(customerName, amount);
        this.upiId = upiId;
    }

    @Override
    void makePayment() {

        if (upiId != null && upiId.matches("[a-zA-Z0-9._-]+@[a-zA-Z]+")) {
            System.out.println("Customer Name: " + customerName);
            System.out.println("Amount Rs: " + amount);
            System.out.println("UPI ID: " + upiId);
            System.out.println("UPI Payment Successful!");
        } else {
            System.out.println("Invalid UPI ID!");
        }
    }
}

class CardPayment extends Payment {

    String cardNumber;
    String cvv;

    public CardPayment(String customerName, double amount, String cardNumber, String cvv) {
        super(customerName, amount);
        this.cardNumber = cardNumber;
        this.cvv = cvv;
    }

    @Override
    void makePayment() {

        if (cardNumber != null && cardNumber.matches("\\d{16}")
                && cvv != null && cvv.matches("\\d{3}")) {

            System.out.println("Customer Name: " + customerName);
            System.out.println("Amount Rs: " + amount);
            System.out.println("Card Payment Successful!");

        } else {
            System.out.println("Invalid Card Number or CVV!");
        }
    }
}

class CashPayment extends Payment {

    double cash;

    public CashPayment(String customerName, double amount, double cash) {
        super(customerName, amount);
        this.cash = cash;
    }

    @Override
    void makePayment() {

        System.out.println("Customer Name: " + customerName);
        System.out.println("Amount Rs: " + amount);
        System.out.println("Cash Given: Rs." + cash);

        if (cash >= amount) {
            double balance = cash - amount;
            System.out.println("Cash Payment Successful!");
            System.out.println("Remaining Balance: Rs." + balance);
        } else {
            System.out.println("Insufficient Cash!");
            System.out.println("Shortage: Rs." + (amount - cash));
        }
    }
}

public class Main3 {

    public static void main(String[] args) {

        Payment p1 = new UPIPayment("Ram", 500, "ram123@okaxis");

        Payment p2 = new CardPayment("Raju", 1000, "1234567812345678", "123");

        Payment p3 = new CashPayment("Chinnu", 300, 500);

        System.out.println("----- UPI PAYMENT -----");
        p1.makePayment();

        System.out.println("\n----- CARD PAYMENT -----");
        p2.makePayment();

        System.out.println("\n----- CASH PAYMENT -----");
        p3.makePayment();
    }
}
