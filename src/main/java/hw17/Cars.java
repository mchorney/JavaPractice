package hw17;

public class Cars {
    private String brand;
    private String model;

    public Cars(String brand, String model) {
        this.brand = brand;
        this.model = model;
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

    @Override
    public String toString() {
        return "Cars{" +
                "brand='" + brand + '\'' +
                " model='" + model + '\'' +
                '}';
    }

    void printInfo (){
        System.out.println("Car is "+ brand + " " + model);


    }
}