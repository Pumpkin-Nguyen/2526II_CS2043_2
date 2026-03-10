import java.util.Arrays;

public class Account {
    private final String accountId;
    private double balance;
    private Transaction[] history;
    
    public Account(String accountId, double balance) {
        this.accountId = accountId;

        if (balance < 0) {
            this.balance = 0;
            System.out.println("Balance can't be negative.");
        } else {
            this.balance = balance;
        }
    }

    public void addTransaction(Transaction t) {
        int n = (history != null) ? history.length : 0;
        Transaction newHistory[] = new Transaction[n + 1];

        for (int i = 0; i < n; i++) {
            newHistory[i] = history[i];
        }
        newHistory[n] = t;
        history = newHistory;
    }

    public Transaction[] getHistory() {
        return Arrays.copyOf(history, history.length);
    }

    public static void main() {
        Account account1 = new Account("25020281", 300.0);
        Transaction t1 = new Transaction("1", 10, "10:42 PM 10/3/2026");
        account1.addTransaction(t1);

        Transaction t2 = new Transaction("2", -4, "2:12 PM 7/3/2026");
        account1.addTransaction(t2);

        Transaction[] history = account1.getHistory();
        System.out.println("Amount of transaction 1: " + history[0].getAmount());

        // history[0].amount = 9999999; // Không thể truy cập amount do final
        history[0] = null;

        Transaction[] history2 = account1.getHistory();
        System.out.println("Amount of transaction 1 after hack: " + history2[0].getAmount());

    }
}
