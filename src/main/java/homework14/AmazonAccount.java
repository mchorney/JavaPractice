package homework14;

public class AmazonAccount extends myPersonalAccount {

    private int number_of_purchases;

    public AmazonAccount(String name, String last_name, String address, String phone, String email, int number_of_purchases) {
        super(name, last_name, address, phone, email);
        this.number_of_purchases = number_of_purchases;
    }

    public int getNumber_of_purchases() {
        return number_of_purchases;
    }

    public void setNumber_of_purchases(int number_of_purchases) {
        this.number_of_purchases = number_of_purchases;
    }

    @Override
    public void myAccountInfo() {
        System.out.println("Dear " +
                name + " " +
                last_name + " !" +
                " (address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + " )" + '\'' +
                " Number of your Amazon purchases = " + number_of_purchases);
    }
}



