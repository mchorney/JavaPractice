package hw11;

public class Laptops {
    private String brand;
    private String model;
    private int year;
    private String parameters;
    private int[] discount;

    public Laptops(){}
    public Laptops(String b, String m, int y, String p, int[] d){
        brand=b;
        model=m;
        year=y;
        parameters=p;
        discount=d;
    }

    public void printOut(){
        int x;
        if(year<=1998){
            x = discount[3];
            System.out.println("We have discount on this model " + x + "%");
        }
        else if (year<=2000){
            x = discount[2];
            System.out.println("We have discount on this model " + x + "%");
        }
        else if (year<=2004){
            x = discount[1];
            System.out.println("We have discount on this model " + x + "%");
        }
        else {
            System.out.println("No discount");
        }
        System.out.println("Brand = " + brand + "\nModel = " + model + "\nYear = " + year + "\nParameters = " +parameters + "\n");
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDiscount(int[] discount) {
        this.discount = discount;
    }

    public void setParameters(String parameters) {
        this.parameters = parameters;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public int[] getDiscount() {
        return discount;
    }

    public String getModel() {
        return model;
    }

    public String getParameters() {
        return parameters;
    }
}
