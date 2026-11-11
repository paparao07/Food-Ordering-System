package com.methodoverriding;



class Delivery {
    int deliveryId;
    String partnerName;
    double distance;

    Delivery(int deliveryId, String partnerName, double distance) {
        this.deliveryId = deliveryId;
        this.partnerName = partnerName;
        this.distance = distance;
    }

    double calculateDeliveryCharge() {
        return 0;
    }

    void display() {
        System.out.println("Delivery ID: " + deliveryId);
        System.out.println("Partner Name: " + partnerName);
        System.out.println("Distance: " + distance + " km");
        System.out.println("Delivery Charge: Rs." + calculateDeliveryCharge());
        System.out.println("---------------------------");
    }
}

class BikeDelivery extends Delivery {

    BikeDelivery(int id, String name, double distance) {
        super(id, name, distance);
    }

    @Override
    double calculateDeliveryCharge() {
        return distance * 10;
    }
}

class CycleDelivery extends Delivery {

    CycleDelivery(int id, String name, double distance) {
        super(id, name, distance);
    }

    @Override
    double calculateDeliveryCharge() {
        return distance * 5;
    }
}

class ExpressDelivery extends Delivery {

    ExpressDelivery(int id, String name, double distance) {
        super(id, name, distance);
    }

    @Override
    double calculateDeliveryCharge() {
        return distance * 20;
    }
}

public class Main {
    public static void main(String[] args) {

        Delivery d1 = new BikeDelivery(101, "Ravi", 5);
        Delivery d2 = new CycleDelivery(102, "Krishna", 4);
        Delivery d3 = new ExpressDelivery(103, "Ram", 3);

        d1.display();
        d2.display();
        d3.display();
    }
}

