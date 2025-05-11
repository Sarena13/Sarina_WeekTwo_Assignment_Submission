/* Bank Account System Create a class BankAccount with attributes accountHolderName, 
accountNumber, and balance. Create a constructor to initialize them. Create methods
 deposit(amount) and withdraw(amount) which modify the balance. Show messages if
  withdrawal amount exceeds balance. */
  public class BankAccount {
    
    private String accountHolderName;
    private String accountNumber;
    private double accountBalance;

    public BankAccount(String name, String accNumber, double accountBalance) {
        this.accountHolderName = name;
        this.accountNumber = accNumber;
        this.accountBalance = accountBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            accountBalance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > accountBalance) {
            System.out.println("Insufficient balance. Withdrawal of $" + amount + " failed.");
        } else if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else {
            accountBalance -= amount;
            System.out.println("Withdrew: $" + amount);
        }
    }


    public void showAccountDetails() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: $" + accountBalance);
    }

    
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Ayush Tamang", "123456", 10000.0);
        acc.showAccountDetails();
        acc.deposit(500.0);
        acc.withdraw(600.0);
        acc.withdraw(11000.0); 
        acc.showAccountDetails();
    }
}
