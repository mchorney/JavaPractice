package homework14;

public class WesternUnionAccount extends BankAccount {
    private int[] persons_list;
    private String[] countries_list;

    public WesternUnionAccount(String name, String last_name, String address, String phone, String email, double balance, int account_number, int[] persons_list, String[] countries_list) {
        super(name, last_name, address, phone, email, balance, account_number);
        this.persons_list = persons_list;
        this.countries_list = countries_list;
    }

    public int[] getPersons_list() {
        return persons_list;
    }

    public void setPersons_list(int[] persons_list) {
        this.persons_list = persons_list;
    }

    public String[] getCountries_list() {
        return countries_list;
    }

    public void setCountries_list(String[] countries_list) {
        this.countries_list = countries_list;
    }

    @Override
    public void showStatement() {
        System.out.println("Dear " + name + " " + last_name + "!" + "\n Here is yours WU Statement: " + "\n Persons, to whom you have sent money: " + persons_list


                + "\n Countries, to which you have sent money: " + countries_list);
    }
}
