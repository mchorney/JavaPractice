package homework14;

public class WesternUnionAccount extends BankAccount {
    private String[] persons_list;
    private String[] countries_list;

    public WesternUnionAccount(String name, String last_name, String address, String phone, String email, double balance, int account_number, String[] persons_list, String[] countries_list) {
        super(name, last_name, address, phone, email, balance, account_number);
        this.persons_list = persons_list;
        this.countries_list = countries_list;
    }

    public String[] getPersons_list() {
        return persons_list;
    }

    public void setPersons_list(String[] persons_list) {
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
        System.out.println("Dear " + name + " " + last_name + "!" + "\n Here is yours WU Statement: " + "\n Persons, to whom you have sent money: ");

        for (String i : persons_list) {
            System.out.print(" " + i);
        }
        System.out.println("\n Countries, where you sent money: ");

        for (String i : countries_list) {
            System.out.print(" " + i);
        }
    }
}
