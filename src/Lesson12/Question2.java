package Lesson12;

public class Question2 {


    public static void main(String[] args) {
        CustomerAccount account = new CustomerAccount("Alice", "987654", 500.0);

        // Test Case 1: Deposit a valid amount
        account.deposit(100.0);
        System.out.println("Test Case 1 - After Deposit: " + account.getBalance()); // Expected: 600.0

        // Test Case 2: Deposit an invalid amount
        account.deposit(-50.0); // Expected error message
        System.out.println("Test Case 2 - After Invalid Deposit: " + account.getBalance()); // Expected: 600.0

        // Test Case 3: Withdraw a valid amount
        account.withdraw(200.0);
        System.out.println("Test Case 3 - After Withdraw: " + account.getBalance()); // Expected: 400.0

        // Test Case 4: Withdraw an amount greater than the balance
        account.withdraw(600.0); // Expected error message
        System.out.println("Test Case 4 - After Exceed Withdraw: " + account.getBalance()); // Expected: 400.0

        // Test Case 5: Withdraw causing balance to fall below $100
        account.withdraw(350.0); // Expected error message
        System.out.println("Test Case 5 - After Below Minimum Balance Withdraw: " + account.getBalance()); // Expected: 400.0

    }
}

class CustomerAccount {
    String Cus_name;
    String Acc_no;
    double balance;

    CustomerAccount(String Cus_name, String Acc_no, double balance) {
        this.Cus_name = Cus_name;
        this.Acc_no = Acc_no;
        this.balance = balance;
    }

    public boolean deposit(double amount) {

        if (amount <= 0) {
            System.out.println("Deposit amount should be greater than 0");
            return false;
        }
        balance = balance + amount;

        return true;
    }

    public boolean withdraw(double amount) {

        try {

            if (amount <= 0) {
                System.out.println("Withdraw amount should be greater than 0");
                return false;
            }
            if (amount > balance) {
                throw new BalanceException("Withdraw amount exceed the balance");
            }
            if (balance - amount < 100) {
                throw new BalanceException("Balance reach below 100$");
            }
            balance = balance - amount;
        } catch (BalanceException e) {
            System.out.println(e.getMessage());
            return false;
        }

        return true;
    }


    public double getBalance() {
        return this.balance;
    }
}

class BalanceException extends Exception {
    public BalanceException(String message) {
        super(message);
    }
}
