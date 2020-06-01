package hw13;

public class GraphicCard {
    private Brand brand;
    private String model;

    public GraphicCard(Brand brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Brand getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String printInfo(){
        return "graphic Card { brand = "+brand+ ";"+"Model = "+model +'}';
    }

}
