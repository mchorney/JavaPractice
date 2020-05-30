package hw11;

public class TV {

    private String brand;
    private String model;
    private int size;

    public TV(){}

    public TV(String brand,String model, int size){
        this.brand=brand;
        this.model=model;
        this.size=size;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getSize() { return size; }


    public void setModel(String model) {
        this.model = model;
    }

    public void setBrand(String brand) { this.brand = brand; }

    public void setSize(int size) { this.size = size; }

    public void printOut(){
        System.out.println("This is " + brand + " Smart TV mobel "+model+" with diagonal "+size+" inch.");
    }


}
