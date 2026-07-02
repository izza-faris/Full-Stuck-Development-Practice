public class BankAccountSynchronization {
      // BankAccount Class
    static class BankAccount {
        private int balance;

        // Constructor
        public BankAccount(int balance) {
            this.balance = balance;
        }

        // Synchronized Deposit Method
        public synchronized void deposit(int amount, String threadName) {
            System.out.println(threadName + " is depositing Rs." + amount);

            balance += amount;

            System.out.println(threadName + " deposited successfully.");
            System.out.println("Current Balance : Rs." + balance);
            System.out.println("--------------------------------");
        }

        // Synchronized Withdraw Method
        public synchronized void withdraw(int amount, String threadName) {
            System.out.println(threadName + " is withdrawing Rs." + amount);

            if (balance >= amount) {
                balance -= amount;
                System.out.println(threadName + " withdrew successfully.");
            } else {
                System.out.println(threadName + " failed! Insufficient Balance.");
            }

            System.out.println("Current Balance : Rs." + balance);
            System.out.println("--------------------------------");
        }

        // Display Final Balance
        public synchronized void displayBalance() {
            System.out.println("Final Account Balance : Rs." + balance);
        }
    }

    public static void main(String[] args) {

        // Create Bank Account
        BankAccount account = new BankAccount(1000);

        // Deposit Thread 1
        Thread depositThread1 = new Thread(() -> {
            account.deposit(500, "Deposit Thread 1");
        });

        // Withdraw Thread 1
        Thread withdrawThread1 = new Thread(() -> {
            account.withdraw(700, "Withdraw Thread 1");
        });

        // Withdraw Thread 2
        Thread withdrawThread2 = new Thread(() -> {
            account.withdraw(1200, "Withdraw Thread 2");
        });

        // Deposit Thread 2
        Thread depositThread2 = new Thread(() -> {
            account.deposit(300, "Deposit Thread 2");
        });

        // Start Threads
        depositThread1.start();
        withdrawThread1.start();
        withdrawThread2.start();
        depositThread2.start();

        // Wait until all threads finish
        try {
            depositThread1.join();
            withdrawThread1.join();
            withdrawThread2.join();
            depositThread2.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }

        // Display Final Balance
        System.out.println("================================");
        account.displayBalance();
    }
}

