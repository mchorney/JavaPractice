package homework10;

public class App {

    public static void main(String[] args) {

        BankAccount customer1 = new BankAccount();
        customer1.customer_name = "Matthew Olson";
        customer1.account_number = 0003333444556;
        customer1.account_balance = 500000.0;
        customer1.account_creation_date = "2001-01-01";

        Double balance = customer1.check_balance();
        System.out.println(balance);

        customer1.showMyBankStatement();
        System.out.println("Balance before deposit of 1000$: " + "\n" + balance);

        customer1.deposit(1000.0);
        System.out.println("Balance after deposit: " + "\n" + customer1.deposit(1000.0));

        BankAccount customer2 = new BankAccount();

        customer2.customer_name = "Natalia Olson";
        customer2.account_number = 0003333344756;
        customer2.account_balance = 200000.0;
        customer2.account_creation_date = "2003-01-01";

        Double balance1 = customer2.check_balance();
        System.out.println(balance1);

        customer2.showMyBankStatement();
        System.out.println("Balance before deposit of 10000$: " + "\n" + balance);

        customer2.deposit(1000.0);
        System.out.println("Balance after deposit: " + "\n" + customer2.deposit(1000.0));
    }
}
