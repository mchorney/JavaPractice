package homework10;

public class BankAccount {
    public int account_number;
    public double account_balance;
    public String account_creation_date;
    public String customer_name;

    public double check_balance() {
        return account_balance;
    }
    public void showMyBankStatement() {
        System.out.println("Dear " + customer_name + "!" + "\n Here is yours bank Statement: " + "\n Account number: " + account_number
                + "\n Account balance: " + account_balance + "$");
    }
    public double deposit(double deposit_money) {
        return account_balance + deposit_money;
    }
}
