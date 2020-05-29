package home11;

public class Phone {
    private String brand;
    private String model;
    private int memory;
    private String color;

    public Phone(){
    }

    public Phone(String brand,String model,int memory,String color){
        this.brand=brand;
        this.model=model;
        this.memory=memory;
        this.color=color;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getMemory() {
        return memory;
    }

    public String getColor() {
        return color;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public void printClass(){
        System.out.println("I lake to use "+brand +" "+ model+" by the phone "+memory+"GB memory is "+color);
    }
}