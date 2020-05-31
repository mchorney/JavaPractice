package hw13;

public class Monitor {
    private String brand;
    private String model;
    private int price;

    public Monitor(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void printInfo(){
        System.out.println("Monitor: brand is " + brand + ", model is " + model + ", price is " + price);
    }
}
