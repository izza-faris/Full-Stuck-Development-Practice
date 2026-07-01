public class Main {

    public static void main(String[] args) {

        // Create BankAccount object
        BankAccount1 account = new BankAccount1();

        // Set account details
        account.setAccountNumber(20050605);
        account.setAccountHolderName("Izza Faris");
        account.setBalance(10000);

        // Deposit ₹5000
        account.deposit(5000);

        // Withdraw ₹2000
        account.withdraw(2000);

        // Display updated account details
        account.displayAccountDetails();
    }
}

