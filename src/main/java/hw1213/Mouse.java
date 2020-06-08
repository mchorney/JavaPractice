package hw1213;

public class Mouse {
    private String brand;
    private String model;
    private MousType mousType;

    public Mouse(String brand, String model, MousType mousType) {
        this.brand = brand;
        this.model = model;
        this.mousType = mousType;
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

    public MousType getMousType() {
        return mousType;
    }

    public void setMousType(MousType mousType) {
        this.mousType = mousType;
    }
    public void printinfo(){
        System.out.println("Brand="+brand);
        System.out.println("Model="+model);
        System.out.println("Type="+mousType);
    }
}
