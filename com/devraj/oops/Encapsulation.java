package com.devraj.oops;

class BankSystem {
    private double balance;

    public BankSystem(double balance) {
        this.balance = balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        BankSystem person = new BankSystem(100);
        person.setBalance(1000);
        System.out.println(person.getBalance());
    }
}

// private keyword is used to do encapsulation to maintain security, data can only be changed using getters and setters
