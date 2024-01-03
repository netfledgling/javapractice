package dsa;
public class Account {
    int id;
    int balance;

    public Account(int id, int balance) {
        this.id = id;
        this.balance = balance;
    }

    private void deposit(int amount) {
        balance = balance + amount;
    }

    private void withdraw(int amount) {
        balance = balance - amount;
    }

    private void display() {
        System.out.println("Your account has $" + balance);
    }

    public static void main(String[] args) {
        Account a1 = new Account(1, 10000);
        a1.deposit(100);
        a1.withdraw(100);
        a1.display();
        a1.withdraw(5000);
        a1.display();
    }
}
