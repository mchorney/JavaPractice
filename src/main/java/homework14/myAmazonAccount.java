package homework14;

public class myAmazonAccount extends myPersonalAccount{

    private int list_of_purchases;

    public myAmazonAccount(String name, String last_name, String address, String phone, String email, int list_of_purchases) {
        super(name, last_name, address, phone, email);
        this.list_of_purchases = list_of_purchases;
    }

    public int getList_of_purchases() {
        return list_of_purchases;
    }

    public void setList_of_purchases(int list_of_purchases) {
        this.list_of_purchases = list_of_purchases;
    }

}
