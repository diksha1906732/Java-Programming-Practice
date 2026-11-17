public class Bank {

    String accountHolder = "Diksha";
    double balance = 10000;

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        balance = balance - amount;
        System.out.println("Withdrawn: " + amount);
    }

    void displayBalance() {
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {

        Bank acc = new Bank();

        acc.displayBalance();

        acc.deposit(5000);

        acc.withdraw(2000);

        acc.displayBalance();
    }
}