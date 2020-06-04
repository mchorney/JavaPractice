package hw14;

public class Customer {
    protected String firstname;
    protected String lastname;
    protected Insurances insurance;
    protected PayMethods payment;


    public Customer(String firstname, String lastname, Insurances insurance, PayMethods payment) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.insurance = insurance;
        this.payment = payment;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Insurances getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurances insurance) {
        this.insurance = insurance;
    }

    public PayMethods getPayment() {
        return payment;
    }

    public void setPayment(PayMethods payment) {
        this.payment = payment;
    }


    public void introduce(String yourName){
        System.out.println("Hi, " + yourName + " My name is "+firstname+" i am looking to buy a new car today!");
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", insurance=" + insurance +
                ", payment=" + payment +
                '}';
    }
}
