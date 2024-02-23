public class ATM_1{
    private double balance;

    public ATM+(double initialBalance) {
        this.balance = initialBalance;
    }

    public double checkBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New balance: " + balance);
        } else {
            System.out.println("Invalid amount for deposit.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        } else {
            System.out.println("Insufficient funds or invalid amount for withdrawal.");
        }
    }

    public static void main(String[] args) {
        ATM atm = new ATM(1000); // Initialize ATM with initial balance

        // Test ATM functionality
        System.out.println("Initial balance: " + atm.checkBalance());
        atm.deposit(500);
        atm.withdraw(200);
        atm.withdraw(1500); // Attempt to withdraw more than available balance
    }
}
