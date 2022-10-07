package task1;

import java.util.Scanner;
public class CreditCard {
  Scanner console = new Scanner(System.in);
  int number;
  double summ;
  public CreditCard(int number, double summ) {
    this.number = number;
    this.summ = summ;
  }
  public void info() {
    System.out.println("Card number " + this.number + "; Balance: " + this.summ);
    System.out.println();
  }
  public void addTheMoney() {
    System.out.println("Enter the amount to replenish: ");
    double a = console.nextDouble();
    this.summ += a;
    System.out.println("Balance: " + this.summ);
    System.out.println();
  }
  public void takeTheMoney() {
    System.out.println("Enter the amount to withdraw funds: ");
    double a = console.nextDouble();
    this.summ -= a;
    System.out.println("Balance: " + this.summ);
    System.out.println();
  }
}
