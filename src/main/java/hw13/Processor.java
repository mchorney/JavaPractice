package hw13;

public class  Processor {
    private String  brand;
    private String  model;
    private double clockspeed;

    public Processor(String brand, String model, double clockspeed) {
        this.brand = brand;
        this.model = model;
        this.clockspeed = clockspeed;
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

    public double getClockspeed() {
        return clockspeed;
    }

    public void setClockspeed(double clockspeed) {
        this.clockspeed = clockspeed;
    }

    public void printOut() {
        System.out.println("Processor " +brand+ ",model " +model+ ", clock speed " +clockspeed+ " GHz, ");
    }
}
