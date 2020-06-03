package homework14;

public class myWesternUnionAccount extends myPersonalAccount {
    private int[] persons_list;
    private String[] countries_list;

    public myWesternUnionAccount(String name, String last_name, String address, String phone, String email, int[] persons_list, String[] countries_list) {
        super(name, last_name, address, phone, email);
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
}
