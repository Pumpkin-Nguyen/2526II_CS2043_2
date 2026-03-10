public class BankAccount {
    final String accountNumber;
    private double balance;
    String ownerName;

    public BankAccount(String accountNumber, String ownerName) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = 0;
    }

    public BankAccount(String accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        if (balance < 0) {
            this.balance = 0;
            System.out.println("Balance can't be negative.");
        } else {
            this.balance = balance;
        }
    }

    public void deposit(double amount) {
        if (amount < 0) {
            System.out.println("Amount to deposit can't be negative.");
        } else {
            this.balance += amount;
            System.out.println("Deposited: " + amount);
        }
    }

    public boolean withdraw(double amount) {
        if (amount < 0) {
            System.out.println("Amount to withdraw can't be negative.");
            return false;
        } else if (amount > this.balance) {
            System.out.println("INSUFFICIENT FUNDS");
            return false;
        } else {
            this.balance -= amount;
            System.out.println("Withdrawed: " + amount);
            return true;
        }
    }

    public double getBalance() {
        return this.balance;
    }

    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("3429032007", "Nguyen Hai Nam", 100);

        System.out.println("Balance: " + myAccount.getBalance());
        myAccount.deposit(-30);
        myAccount.withdraw(300);
        myAccount.withdraw(20.1);
        System.out.println("Balance: " + myAccount.getBalance());
    }

}
