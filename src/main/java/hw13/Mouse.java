package hw13;

public class Mouse {
    private String brand;
    private String model;
    private Type mousetype;

    public Mouse(String brand, String model, Type mousetype) {
        this.brand = brand;
        this.model = model;
        this.mousetype = mousetype;
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

    public Type getMousetype() {
        return mousetype;
    }

    public void setMousetype(Type mousetype) {
        this.mousetype = mousetype;
    }
    public String printInfo(){
        return  "Mouse {Brand = "+ brand + ";"+ "Model"+ model + ";" +"Type = " + mousetype + '}';
    }
}
