package hw15;

public class Home extends Chairs implements GamingChair, KidsChair {
    private int numberOfChairs;
    private String usageTimes;


    public Home(String brand, String model, int price, int numberOfChairs, String usageTimes) {
        super(brand, model, price);
        this.numberOfChairs = numberOfChairs;
        this.usageTimes = usageTimes;
    }
    public void gameLife (){
        System.out.println("GameLife gaming chair interface implemented for Home ");
    }
    public void kidies () {
        System.out.println("Kiddies kids chair implemented for Home");
    }
}
