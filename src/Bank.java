import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Account account = new Account();
        int input = 0;

        while (input != 4) {
            System.out.println("1 to Withdraw, 2 to deposit, 3 to transfer, 4 to stop");
            input = scan.nextInt();

            switch (input) {
                case 1:
                    account.withdraw();
                    break;
                case 2:
                    account.deposit();
                    break;
                case 3:
                    account.transfer();
                    break;
                default:
                    System.out.println("Please enter a valid number");
                    break;
            }
        }

    }
}
