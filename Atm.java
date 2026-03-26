import java.util.ArrayList;
import java.util.Scanner;

public class Atm {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> history = new ArrayList<>();

        Account acc = new Account();

        Deposit d = new Deposit();
        Withdraw w = new Withdraw();
        BalanceInquiry b = new BalanceInquiry();
        TransactionHistory t = new TransactionHistory();

        int attempt = 3;
        int originalPin = 7355;

        System.out.println("Welcome To SBI ATM");

        // PIN Check
        while (attempt > 0) {
            System.out.print("Enter Your PIN: ");
            int pin = sc.nextInt();

            if (pin == originalPin) {
                System.out.println("PIN Accepted");
                break;
            } else {
                attempt--;
                System.out.println("Wrong PIN! Attempts left: " + attempt);
            }
        }

        if (attempt == 0) {
            System.out.println("Your ATM card is blocked");
            return;
        }

        // Menu
        while (true) {
            System.out.println("\n1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Transaction History");
            System.out.println("4. Balance Inquiry");
            System.out.println("5. Exit");

            System.out.print("Enter Your Choice: ");
            int ch = sc.nextInt();

            switch (ch) {

                case 1:
                    System.out.print("Enter amount: ");
                    double amount = sc.nextDouble();
                    w.withdraw(acc, amount, history);
                    break;

                case 2:
                    System.out.print("Enter amount: ");
                    double amount1 = sc.nextDouble();
                    d.deposit(acc, amount1, history);
                    break;

                case 3:
                    t.showHistory(history);
                    break;

                case 4:
                    b.checkBalance(acc);
                    break;

                case 5:
                    System.out.println("Thank you for using ATM");
                    return;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}