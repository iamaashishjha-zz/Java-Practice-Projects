package encapsulation;

public class TestAccount {

    public static void main(String[] args) {
        Account x = new Account(500.00);
        //modify the account balance
        x.setBalance(550.00);
        //withdraw 100.00 from the account
        x.setBalance(x.getBalance() - 100.00);
        //deposit 250.00 to the account
        x.setBalance(x.getBalance() + 250.00);
        //access the account balance
        System.out.println(x.getBalance());
    }

}
