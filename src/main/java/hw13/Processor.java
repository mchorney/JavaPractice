package hw13;

public class  Processor {
    private ProcessorName  brand;
    private String  model;
    private double clockspeed;

    public Processor(ProcessorName brand, String model, double clockspeed) {
        this.brand = brand;
        this.model = model;
        this.clockspeed = clockspeed;
    }

    public ProcessorName getBrand() {
        return brand;
    }

    public void setBrand(ProcessorName brand) {
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

    public String printOut() {
        return ("Processor " +brand+ " " +model+ ", clock speed " +clockspeed+ " GHz, ");
    }
}
