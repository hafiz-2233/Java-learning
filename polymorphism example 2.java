class Vehicle {

    void start() {
        System.out.println("Vehicle starts");
    }
}

class Car extends Vehicle {

    void start() {
        System.out.println("Car starts with key");
    }
}

class Bike extends Vehicle {

    void start() {
        System.out.println("Bike starts with button");
    }
}

public class Main {

    public static void main(String[] args) {

        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();

        v1.start();
        v2.start();
    }
}