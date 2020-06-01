package homework_13;

public class Processor {
    private String p_brand;
    private String frequency;

    public String getP_brand() {
        return p_brand;
    }

    public void setP_brand(String p_brand) {
        this.p_brand = p_brand;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public Processor(String p_brand, String frequency) {
        this.p_brand = p_brand;
        this.frequency = frequency;
    }

    public void printInfo(){
        System.out.println("Processor: " +p_brand+ " Frequency: " +frequency);
    }
}
