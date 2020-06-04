package hw14;

public class Car {
    protected Brands brand;
    protected String model;
    protected Years year;


    public Car(Brands brand, String model, Years year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public Brands getBrand() {
        return brand;
    }

    public void setBrand(Brands brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Years getYear() {
        return year;
    }

    public void setYear(Years year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "{" +
                "brand=" + brand +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }

    public void printOut() {
        System.out.println("Car{" +
                "brand=" + brand +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}');
    }
}
