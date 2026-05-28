package com.devraj.oops;

abstract class BankAcc {
    double balance;
    abstract void addMoney(double amount);
    abstract void canUserWithdrawMoney(double amount);
    void updateBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAcc {
    public void addMoney(double amount) {
        super.updateBalance(super.getBalance()+amount);
    }

    public void canUserWithdrawMoney(double amount) {
        if(amount <= super.getBalance()) {
            System.out.println("User can");
        }
        else {
            System.out.println("User can not");
        }
    }
}

class CurrentAccount extends BankAcc {
    public void addMoney(double amount) {
        super.updateBalance(super.getBalance()+amount);
    }

    public void canUserWithdrawMoney(double amount) {
        double minimumLimit = 1000;
        if(super.getBalance() - amount >= minimumLimit) {
            System.out.println("User can");
        }
        else {
            System.out.println("User can't");
        }
    }
}

public class Abstraction {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount();
        sa.addMoney(1000);
        sa.canUserWithdrawMoney(800);

        CurrentAccount ca = new CurrentAccount();
        ca.addMoney(1200);
        ca.canUserWithdrawMoney(1500);
    }
}
