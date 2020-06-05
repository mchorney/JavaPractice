package hw15;

public class Chairs implements ConferenceChair, GamingChair, OfficeChair{
    protected String brand;
    protected String model;
    protected int price;

    public Chairs(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    @Override
    public void conference21() {
        System.out.println("Conference21 is our conference type chair");

    }

    @Override
    public void gaming12() {
        System.out.println("Gaming12 is our gaming type chair");

    }

    @Override
    public void office33() {
        System.out.println("Office33 is our office type chair");

    }
    public void printOut(){
        System.out.println(brand + " " + model+" " +price);
    }

}
