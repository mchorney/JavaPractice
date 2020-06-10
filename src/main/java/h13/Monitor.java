package h13;

public class Monitor {
    private String brand;
    private String model;
    private int size;
    private int price;

    public Monitor(String brand, String model, int size, int price) {
        this.brand = brand;
        this.model = model;
        this.size = size;
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

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void printInfo(){
        System.out.println("Monitor: brand =" + brand + ", model =" + model + ", size =" + size + ", price =" + price);
    }
}
