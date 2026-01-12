import java.util.ArrayList;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<String> transactions = new ArrayList<>();
        double balance = 0;
        boolean running = true;

        while (running) {
            System.out.println("""
            WHAT IS HAPPENING TODAY?
            1. Deposit money
            2. Withdraw money
            3. Show transaction history
            4. Exit the program
            """);

            System.out.print("Choose an option: ");
            int log = input.nextInt();

            switch (log) {

                case 1:
                    System.out.print("How much do you want to deposit? ");
                    double deposit = input.nextDouble();
                    balance += deposit;
                    transactions.add("Deposited: " + deposit);
                    System.out.println("Current balance: " + balance);
                    break;

                case 2:
                    System.out.print("Enter withdraw amount: ");
                    double withdraw = input.nextDouble();

                    if (withdraw > balance) {
                        System.out.println("Insufficient balance!");
                    } else {
                        balance -= withdraw;
                        transactions.add("Withdrew: " + withdraw);
                        System.out.println("Current balance: " + balance);
                    }
                    break;

                case 3:
                    System.out.println("Transaction History:");
                    if (transactions.isEmpty()) {
                        System.out.println("No transactions yet.");
                    } else {
                        for (String t : transactions) {
                            System.out.println(t);
                        }
                    }
                    break;

                case 4:
                    System.out.println("Exiting program. Goodbye!");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid option. Try again.");
            }
        }

        input.close();
    }
}

