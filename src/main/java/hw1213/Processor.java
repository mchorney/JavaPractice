package hw1213;

public enum Processor {
    ;
    private String brand;
    private String model;
    private String selflife;

    Processor(String brand, String model, String selflife) {
        this.brand = brand;
        this.model = model;
        this.selflife = selflife;
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

    public String getSelflife() {
        return selflife;
    }

    public void setSelflife(String selflife) {
        this.selflife = selflife;
    }

}
