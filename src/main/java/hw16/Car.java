package hw16;

public class Car {
    private String fabric;
    private String car;
    private String type;
    private int price;

    public Car(String fabric, String car, String type, int price) {
        this.fabric = fabric;
        this.car = car;
        this.type = type;
        this.price = price;
    }

    public String getFabric() {
        return fabric;
    }

    public void setFabric(String fabric) {
        this.fabric = fabric;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
