package h11;

public class Car {
    private String brand;
    private String model;
    private String series;
    private int year;

    public Car(){};

    public Car(String brand, String model, String series, int year){
        this.brand =brand;
        this.model =model;
        this.series =series;
        this.year =year;
    }
    public Car(String b, String m, int y){
        brand=b;
        year=y;
    }
    public Car(String brand, int year){
        this.brand =brand;
        this.year =year;
    }
    public Car(String model, String series){
        this.model =model;
        this.series =series;
    }
    public Car(String brand, String model, String series){
        this.brand =brand;
        this.model =model;
        this.series =series;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel(){
        return model;
    }

    public String getSeries() {
        return series;
    }

    public int getYear() {
        return year;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public void setYear(int year) {
        this.year = year;
    }



        @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", series='" + series + '\'' +
                ", year=" + year +
                '}';
    }
}



