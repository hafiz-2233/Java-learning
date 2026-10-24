
class BankAccount {

    private String owner;
    private long balanceCents;

    // Constructor to initialize account
    public BankAccount(String owner, long openingBalanceCents) {

        if (owner == null || owner.isBlank()) {
            throw new IllegalArgumentException("Invalid owner");
        }

        if (openingBalanceCents < 0) {
            throw new IllegalArgumentException("Invalid balance");
        }

        this.owner = owner;
        this.balanceCents = openingBalanceCents;
    }

    public boolean deposit(long amountCents) {

        if (amountCents <= 0) {
            return false;
        }

        // Add amount to balance
        balanceCents += amountCents;

        return true;
    }

    // Withdraw money from the account
    public boolean withdraw(long amountCents) {

        if (amountCents <= 0 || amountCents > balanceCents) {
            return false;
        }
        balanceCents -= amountCents;

        return true;
    }

    // Getter for balance
    public long getBalanceCents() {
        return balanceCents;
    }

    // Getter for owner
    public String getOwner() {
        return owner;
    }
}

public class Main {
    public static void main(String[] args) {

        // Create account
        BankAccount account = new BankAccount("Ali", 10000);

        // Deposit 5000 cents
        System.out.println(account.deposit(5000));
        System.out.println(account.withdraw(3000));

        System.out.println(account.withdraw(20000));

        System.out.println(
                "Final Balance: " + account.getBalanceCents() + " cents"
        );
    }
}
