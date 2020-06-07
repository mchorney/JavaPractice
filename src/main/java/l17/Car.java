package l17;

public class Car {
    private static String xx;
    private String brand;
    private String model;
    private int year;

    public static String getXx() {
        return xx;
    }

    public static void setXx(String xx) {
        Car.xx = xx;
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        xx = "TTTT";
    }

    public static void about(){
        System.out.println("I am a claass CAAR!!");
    }
}
