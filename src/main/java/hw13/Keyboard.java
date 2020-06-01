package hw13;

public class Keyboard {
    private Brand brand;
    private String model;
    private Type ktype;

    public Keyboard(Brand brand, String model, Type ktype) {
        this.brand = brand;
        this.model = model;
        this.ktype = ktype;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Type getKtype() {
        return ktype;
    }

    public void setKtype(Type ktype) {
        this.ktype = ktype;
    }
    public String printInfo(){
        return "Keyboard {Brand = "+ brand + ";"+ "Model = "+ model + ";"+ktype+ '}';
    }
}
