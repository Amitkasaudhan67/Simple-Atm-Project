import java.util.ArrayList;

public class Deposit {

    public void deposit(Account acc, double amount, ArrayList<String> history) {
        acc.balance += amount;
        history.add("Deposit: " + amount);
        System.out.println("Deposit Successful");
    }
}