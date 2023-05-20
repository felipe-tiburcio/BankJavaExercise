package org.example;

import org.entities.BankAccount;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a account number: ");

        int accountNumber = scan.nextInt();
        scan.nextLine();

        System.out.print("Enter a account holder: ");
        String holder = scan.nextLine();

        System.out.print("Is there an initial deposit? (y/n)? ");
        String answer = scan.next();

        double initialDeposit;

        if(answer.equals("y")) {
            System.out.print("Enter initial deposit value: ");
            initialDeposit = scan.nextDouble();
        } else {
            initialDeposit = 0;
        }

        BankAccount bankAccount = new BankAccount(accountNumber, holder, initialDeposit);

        System.out.println("\nAccount data: ");
        System.out.println(bankAccount);

        System.out.print("Enter a deposit value: ");
        double depositValue = scan.nextDouble();
        bankAccount.deposit(depositValue);
        System.out.println("Updated account data: ");
        System.out.println(bankAccount);

        System.out.print("Enter a withdraw value: ");
        double withDrawValue = scan.nextDouble();
        bankAccount.withDraw(withDrawValue);
        System.out.println("Updated account data: ");
        System.out.println(bankAccount);

        scan.close();
    }
}