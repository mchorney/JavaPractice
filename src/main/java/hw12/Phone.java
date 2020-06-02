package hw12;

public class Phone {
    private String model;
    private Brand brand;

    public Phone(String model, Brand brand) {
        this.model = model;
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public String printPhone() {
        return "Phone " +
                "model is '" + model +
                ", brand is " + brand + '.';
    }
}