package h12;

public class Car {
    private String brand;
    private CarModel carModel;
    private String color;

    public Car(String brand, CarModel carModel, String color) {
        this.brand = brand;
        this.carModel = carModel;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public CarModel getCarModel() {
        return carModel;
    }

    public void setCarModel(CarModel carModel) {
        this.carModel = carModel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", carmodel=" + carModel +
                ", color='" + color + '\'' +
                '}';
    }
}
