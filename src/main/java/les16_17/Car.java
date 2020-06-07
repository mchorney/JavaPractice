package les16_17;

public class Car {
    public static String xx;
    private String brand;
    private String model;
    private String year;
    public static int count;



    public Car(String brand, String model, String year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.xx="TTTTTTT";
        count++;
    }

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

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
    public static void about(){
        System.out.println("I'm a cooool "+count+" CAAAAR!"+xx);
    }
}
