package task1;

import java.util.Scanner;

public class CreditCard {
    private final int number;
    private double summ;
    private static final Scanner console = new Scanner(System.in);

    public CreditCard(int number, double summ) {
        this.number = number;
        this.summ = summ;
    }

    public void info() {
        System.out.println("Card number " + this.number + "; Balance: " + this.summ);
        System.out.println();
    }

    public void addTheMoney() {
        System.out.println("Enter the amount to add: ");
        double a = console.nextDouble();
        this.summ += a;
        System.out.println("Balance: " + this.summ);
        System.out.println();
    }

    public void takeTheMoney() {
        System.out.println("Enter the amount to withdraw funds: ");
        double a = console.nextDouble();
        this.summ -= a;
        if (this.summ <= 0) {
            System.out.println("Insufficient funds");
            System.out.println();
        } else {
            System.out.println("Balance: " + this.summ);
            System.out.println();
        }
    }
}
