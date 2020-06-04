package homework14;

public class SUV extends Car {
    private String usedFor;
    private String features;

    public SUV(String make, String model, Color color, String usedFor, String features) {
        super(make, model, color);
        this.usedFor = usedFor;
        this.features = features;
    }

    public String getUsedFor() {
        return usedFor;
    }

    public String getFeatures() {
        return features;
    }
    public void printme() {
        System.out.println("SUV " +make+" "+model+" "+color + " - " + features+" , "+usedFor);

    }
}
