package sessions.polymorphism;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class BankDriver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Is it checking or savings?");
        String choice = sc.next();
//polymorphism
        BankAccount bankAccount = null;
        if (choice.equalsIgnoreCase("savings")) {
            bankAccount = new SavingAccount(100, "583583");

        } else if (choice.equalsIgnoreCase("checking")) {
            bankAccount = new CheckingAccount(100, "385683");
        }

        bankAccount.printDomain();
        bankAccount.showBalance();
        bankAccount.chargeMonthlyFee();
        bankAccount.showBalance();
        System.out.println(bankAccount.getAccountNumber());

        List<String> list = new ArrayList<>();
    }
}
