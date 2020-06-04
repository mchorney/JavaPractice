package homework14;

public class Compact extends Car {
    private String feature;

    public Compact(String make, String model, Color color, String feature) {
        super(make, model, color);
        this.feature = feature;
    }

    public String getFeature() {
        return feature;
    }

    public void printme() {
        System.out.println("Compact " +make+" "+model+": color =" + color + ", feature = " + feature);
    }
}
