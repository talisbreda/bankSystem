import java.util.InputMismatchException;
import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Account account = new Account();
        boolean stop = false;
        int input;

        do {
            try {
                Scanner scan = new Scanner(System.in);
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
                    case 4:
                        stop = true;
                        break;
                    default:
                        System.out.println("Please enter a valid number");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Please insert a valid number");
            }
        } while (!stop);

    }

}

