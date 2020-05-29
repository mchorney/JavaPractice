package l11;

public class Car {
    private String brand;
    private String model;
    private int year;

    public Car(String brand,String model, int year){
        this.brand=brand;
        this.year=year;
        this.model=model;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        if(year<1960){
            year=1960;
        }
        if (year>2020){
            year=2020;
        }
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
