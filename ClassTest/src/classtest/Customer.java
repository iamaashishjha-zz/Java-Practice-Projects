
package classtest;

public class Customer {

    private String name;
    private Account myAccount;

    public Customer(String name, int id, double balance) {
        this.name = name;
        myAccount = new Account(id, balance);
    }

}
