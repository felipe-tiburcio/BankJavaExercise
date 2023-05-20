package org.entities;

public class BankAccount {
    private final int number;
    private String holder;
    private double balance;

    public BankAccount(int number, String holder, double initialDeposit) {
        this.number = number;
        this.holder = holder;
        deposit(initialDeposit);
    }

    public int getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public double getBalance() {
        return balance;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withDraw(double amount) {
        double tax = 5.00;
        balance -= (tax + amount);
    }

    @Override
    public String toString() {
        return "Account " + getNumber() + ", " +
                "Holder: " + getHolder() + ", " +
                "Balance: $ " + String.format("%.2f", getBalance()) + "\n";
    }
}
