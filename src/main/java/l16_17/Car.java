package l16_17;

public class Car {
    public static String xx;
    private String brand;
    private String model;
    private int year;
    public static int count;

    public static String getXx() {
        return xx;
    }

    public static void setXx(String xx) {
        Car.xx = xx;
    }

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        xx="TTTTTT";
        count++;
    }

    public static void about(){
        System.out.println("I'm a claass CARRRRR!!!" + xx);
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
}
