package homework14;

public class PayPalAccount extends BankAccount {

    public PayPalAccount(String name, String last_name, String address, String phone, String email, double balance, int account_number) {
        super(name, last_name, address, phone, email, balance, account_number);
    }

    @Override
    public void showStatement() {
        System.out.println("Dear " + name + " " + last_name + "!" + "\n You have on your PalPal account: " + balance + "$");
    }
}
