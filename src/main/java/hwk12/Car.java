package hwk12;

public class Car {
    private CarType model;
    private String make;
    private int year;
    private CarType[] previousCars;

    public Car(CarType model, String make, int year) {
        this.model = model;
        this.make = make;
        this.year = year;
    }

    public void getPreviousCars() {
        for (CarType name : previousCars) {
            System.out.println(name);
        }
    }

    public CarType getModel() {
        return model;
    }

    public String getMake() {
        return make;
    }

    public int getYear() {
        return year;
    }

    public void setModel(CarType model) {
        this.model = model;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPreviousCars(CarType[] previousCars) {
        this.previousCars = previousCars;
    }
}
