package homework14;

public class myPayPalAccount extends myBankAccount {
    private int[] persons_list;

    public myPayPalAccount(String name, String last_name, String address, String phone, String email, double balance, int account_number, int[] persons_list) {
        super(name, last_name, address, phone, email, balance, account_number);
        this.persons_list = persons_list;
    }

    public int[] getPersons_list() {
        return persons_list;
    }

    public void setPersons_list(int[] persons_list) {
        this.persons_list = persons_list;
    }

    public void showStatement() {
        System.out.println("Dear " + name + " " + last_name + "!" + "\n You have on your PalPal account: " + balance + "$");
    }
}
