import java.util.Random;
import java.util.Scanner;

public class Account {
    protected int agency;
    protected int number;
    protected double balance;

    Random random = new Random();
    Scanner scan = new Scanner(System.in);

    public Account() {
        this.agency = 1;
        this.number = random.nextInt(1001, 9999);
        this.balance = 0;
    }

    public Account(int agency, int number) {
        this.agency = agency;
        this.number = number;
    }

    public void withdraw() {
        System.out.println("Insert the value of the withdrawal");
        double value = scan.nextDouble();
        if (value > this.balance) {
            System.out.println("Insufficient balance.");
        } else {
            this.balance -= value;
            System.out.printf("New balance on account %d: US$%.2f %n", this.number, this.balance);
        }
    }
    public void withdraw(double value) {
        this.balance -= value;
    }

    public void deposit() {
        System.out.println("Insert the value of the deposit");
        double value = scan.nextDouble();
        this.balance += value;
        System.out.printf("New balance on this %d: US$%.2f %n", this.number, this.balance);
    }
    public void deposit(double value) {
        this.balance += value;
    }

    public void transfer() {
        System.out.println("Insert the agency and number of the destination account");
        int destinationAccountAgency = scan.nextInt();
        int destinationAccountNumber = scan.nextInt();

        Account account1 = new Account(destinationAccountAgency, destinationAccountNumber);

        System.out.println("Insert the value of the transfer");
        double value = scan.nextDouble();

        if (value > this.balance) {
            System.out.println("Insufficient balance.");
        } else {
            this.withdraw(value);
            account1.deposit(value);
            System.out.println("Transfer successful.");
            System.out.printf("New balance on account %s: US$%.2f %n", this.number, this.balance);
            System.out.printf("New balance on account %s: US$%.2f %n", account1.number, account1.balance);
        }
    }

}
