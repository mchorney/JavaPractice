package homework14;

public class myBankAccount extends myPersonalAccount {
    protected double balance;
    protected int account_number;

    public myBankAccount(String name, String last_name, String address, String phone, String email, double balance, int account_number) {
        super(name, last_name, address, phone, email);
        this.balance = balance;
        this.account_number = account_number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void showStatement() {
        System.out.println("Dear " + name + " " + last_name + "!" + "\n Here is yours bank Statement: " + "\n Account number: " + account_number
                + "\n Account balance: " + balance + "$");
    }

    public double deposit(double deposit_money) {
        return balance + deposit_money;
    }
}
