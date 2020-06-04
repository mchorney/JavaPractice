package hw14;

public class CarDealer extends Customer {
    protected String dealername;
    protected String city;
    protected String hoursOfwork;
    protected Car car;


    public CarDealer(String firstname, String lastname, Insurances insurance, PayMethods payment, String dealername, String city, String hoursOfwork, Car car) {
        super(firstname, lastname, insurance, payment);
        this.dealername = dealername;
        this.city = city;
        this.hoursOfwork = hoursOfwork;
        this.car = car;
    }

    public String getDealername() {
        return dealername;
    }

    public void setDealername(String dealername) {
        this.dealername = dealername;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getHoursOfwork() {
        return hoursOfwork;
    }

    public void setHoursOfwork(String hoursOfwork) {
        this.hoursOfwork = hoursOfwork;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }


    public void myInfo() {
        System.out.println("Dealer: {" +
                "Dealership =" + dealername +
                ", City =" + city +
                ", Work Hours =" + hoursOfwork +
                ", Vehicle =" + car +
                ", Customer Name =" + firstname +
                ", Insurance =" + insurance +
                ", Payment Type =" + payment +
                '}');
    }

}
