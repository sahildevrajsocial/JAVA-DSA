package com.devraj.oops;

class Vehicle {
    String numberOfVehicle;
    public Vehicle(String numberOfVehicle) {
        this.numberOfVehicle = numberOfVehicle;
    }
    public void honk() {
        System.out.println("HONK!!!!!!");
    }
    public void printNumberOfVehicle() {
        System.out.println(numberOfVehicle);
    }
}

class Car extends Vehicle {
    public Car(String numberOfCar) {
        super(numberOfCar);
    }
}
class Bus extends Vehicle {
    public Bus(String numberOfBus) {
        super(numberOfBus);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Car car = new Car("DL01GH5787");
        car.printNumberOfVehicle();
        car.honk();

        Bus bus = new Bus("DL04LJ76896");
        bus.printNumberOfVehicle();
        bus.honk();
    }
}
