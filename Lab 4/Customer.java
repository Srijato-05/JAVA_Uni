package Upes;

class Customer {
    private double balance;

    // Constructor
    public Customer() {
        this.balance = 0.0;
    }

    public void addBalance(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Added: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void addBalance(int amount) {
        addBalance((double) amount);
    }

    protected void deductBalance(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Deducted: " + amount);
        } else {
            System.out.println("Invalid deduction amount or insufficient balance.");
        }
    }

    // Package-private method to show balance
    void showBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        Customer customer = new Customer();

        customer.addBalance(100.50);
        customer.addBalance(50);

        // Displaying balance
        customer.showBalance();
    }
}