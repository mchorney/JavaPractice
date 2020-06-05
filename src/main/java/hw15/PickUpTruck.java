package hw15;

public class PickUpTruck implements Car {
    private String brand;
    private String model;
    private int price;

    public PickUpTruck(String brand, String model, int price) {
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
        System.out.println("Fuel type = diesel");
    }

    @Override
    public void transmissionType() {
        System.out.println("Transmission type = Manual");
    }

    @Override
    public void wheelsBase() {
        System.out.println("Wheels base = 4X4");
    }
}
