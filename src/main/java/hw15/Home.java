package hw15;

public class Home extends Chairs {
    private int numberOfChairs;
    private String usageTimes;

    public Home(String brand, String model, int price, int numberOfChairs, String usageTimes) {
        super(brand, model, price);
        this.numberOfChairs = numberOfChairs;
        this.usageTimes = usageTimes;
    }

    @Override
    public String toString() {
        return "Home{" +
                "numberOfChairs=" + numberOfChairs +
                ", usageTimes='" + usageTimes + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
