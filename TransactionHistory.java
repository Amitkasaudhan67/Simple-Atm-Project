import java.util.ArrayList;

public class TransactionHistory {

    public void showHistory(ArrayList<String> history) {
        System.out.println("\nTransaction History:");

        if (history.isEmpty()) {
            System.out.println("No transactions yet");
        } else {
            for (String h : history) {
                System.out.println(h);
            }
        }
    }
}