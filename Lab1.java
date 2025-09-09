/*1. Create a Bank class and declare an instance variable named amount of type double.

Create parameterized constructor to initialize variable “amount” with value 10000.Create two methods withdraw(double withdrawalAmount) and deposit(double depositAmount).

Calculate withdrawal based on some condition (using ternary operator) like If amount is sufficient then “withdraw successful” message will be printed on the console and amount should be updated after withdraw. Later on, deposit 5000 in the account balance.At the end display total balance on the console. String message = (withdrawalAmount <= amount) ? "Withdrawal successful" : "Insufficient balance";

[Hint: Use constructor, ternary operator] Sample input: Amount=10000 Withdrawal amount=5000 Deposit amount=5000 */

package Demo;

class Bank {
    // Instance variable
    private double amount;

    // Parameterized constructor
    public Bank(double amount) {
        this.amount = amount;
    }
    
    // Withdraw method
    public void withdraw(double withdrawalAmount) {
        // Ternary operator to check sufficient balance
        String message = (withdrawalAmount <= amount) ? "Withdrawal successful" : "Insufficient balance";
        System.out.println(message);

        // Update balance only if withdrawal is possible
        amount = (withdrawalAmount <= amount) ? (amount - withdrawalAmount) : amount;
    }

    // Deposit method
    public void deposit(double depositAmount) {
        amount += depositAmount;
        System.out.println("Deposit successful: " + depositAmount);
    }

    // Display balance
    public void displayBalance() {
        System.out.println("Total Balance: " + amount);
    }

    public static void main(String[] args) {
        // Create object with initial amount = 10000
        Bank account = new Bank(10000);

        // Withdraw 5000
        account.withdraw(3000);

        // Deposit 5000
        account.deposit(5000);

        // Display final balance
        account.displayBalance();
    }
}

/*
Withdrawal successful
Deposit successful: 5000.0
Total Balance: 12000.0
 */
