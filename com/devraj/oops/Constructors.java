package com.devraj.oops;

class BankAccount {
    double balance;
    String accountType;

    public BankAccount(double balance) {
        this.balance = balance;
        accountType = "Savings";
    }
    public BankAccount(double balance, String accountType) {
        this.balance = balance;
        this.accountType = accountType;
    }
    public void printBalance() {
        System.out.println(balance);
    }
    public void printAccountType() {
        System.out.println(accountType);
    }
}

public class Constructors {
    public static void main(String[] args) {
        BankAccount person1 = new BankAccount(200);
        person1.printBalance();
        person1.printAccountType();

        BankAccount person2 = new BankAccount(1000, "Current");
        person2.printBalance();
        person2.printAccountType();
    }
}
