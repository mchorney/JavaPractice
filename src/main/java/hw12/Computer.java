package hw12;

public class Computer {
    private String brand;
    private int price;
    private F1 F1;

    public Computer(String brand, int price, hw12.F1 f1) {
        this.brand = brand;
        this.price = price;
        F1 = f1;
    }
        public String getBrand() {
        return brand;
    }

    public int getPrice() {
        return price;
    }

    public hw12.F1 getF1() {
        return F1;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setF1(hw12.F1 f1) {
        F1 = f1;
    }

    @Override
    public  String toString(){
        return "computer{"+
                "brand"+  brand +'\''+", color = " + F1
                + ", price ='$" +price +'\''+'}';
    }
}
