package com.devraj.oops;

class Vehicl {
    String numberOfVehicle;
    public Vehicl(String numberOfVehicle) {
        this.numberOfVehicle = numberOfVehicle;
    }
    public void honk() {
        System.out.println("HONK!!!!!!");
    }
    public void printNumberOfVehicle() {
        System.out.println(numberOfVehicle);
    }
}

class LuCar extends Vehicl {
    public LuCar(String numberOfCar) {
        super(numberOfCar);
    }

    @Override
    public void honk() {
        System.out.println("HONK HONK HONK");
    }
}
class LuBus extends Vehicl {
    public LuBus(String numberOfBus) {
        super(numberOfBus);
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        LuCar car = new LuCar("DL01GH5787");
        car.printNumberOfVehicle();
        car.honk();

        LuBus bus = new LuBus("DL04LJ76896");
        bus.printNumberOfVehicle();
        bus.honk();
    }
}
