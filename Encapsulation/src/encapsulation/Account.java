package encapsulation;

public class Account {

    private double balance;

    public Account(double x) {
        balance = x;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

}
