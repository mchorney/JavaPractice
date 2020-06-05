package hw15;

public class Sedan implements Car {
    private String brand;
    private String model;
    private int price;

    public Sedan(String brand, String model, int price) {
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

    @Override
    public void fuelType() {
        System.out.println("Fuel type = regular");
    }

    @Override
    public void transmissionType() {
        System.out.println("Transmission type = Automatic");
    }

    @Override
    public void wheelsBase() {
        System.out.println("Wheels base = FWD");
    }

}
