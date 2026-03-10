public class Transaction {
    private final String transactionId, timestamp;
    private final double amount;

    public Transaction(String transactionId, double amount, String timestamp) {
        this.transactionId = transactionId;
        this.amount = amount;
        this.timestamp = timestamp;
    }

    public double getAmount() {
        return this.amount;
    }
}
