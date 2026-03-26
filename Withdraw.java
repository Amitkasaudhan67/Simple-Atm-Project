import java.util.ArrayList;

public class Withdraw {

    double totalDailyLimit = 50000.0;
    double dailyWithdraw = 0;

    public void withdraw(Account acc, double amount, ArrayList<String> history) {

        if (amount > acc.balance) {
            System.out.println("Insufficient Balance");
        } 
        else if (dailyWithdraw + amount > totalDailyLimit) {
            System.out.println("Daily Limit Exceeded");
        } 
        else {
            acc.balance -= amount;
            dailyWithdraw += amount;
            history.add("Withdraw: " + amount);
            System.out.println("Withdraw Successful");
        }
    }
}