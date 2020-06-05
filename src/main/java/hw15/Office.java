package hw15;

public class Office extends Chairs implements ConferenceChair, OfficeChair {
    private int numberOfChairs;
    private String usageTimes;


    public Office(String brand, String model, int price, int numberOfChairs, String usageTimes) {
        super(brand, model, price);
        this.numberOfChairs = numberOfChairs;
        this.usageTimes = usageTimes;
    }
    public void conferWonder (){
        System.out.println("ConferWonder conference chair implemented for Office");
    }
    public void topOffice () {
        System.out.println("TopOffice office chair implemented for Office");
    }
}
