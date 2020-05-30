package hw11;

public class Software {
    private String brand;
    private String name;
    private String[] requirements;
    private double[] version;

    public void printOut() {
        System.out.println("Brand = " + brand + "\nName = " + name + "\nWe have different versions");
        double[] x = version;
        for (double v:x) {
            System.out.println("Version = " + v);
        }
        String[] y = requirements;
        for (String v:y) {
            System.out.println("Requirement = " + v);
        }
    }

    public Software (String b, String n, String[] r, double[] v) {
        brand=b;
        name=n;
        requirements=r;
        version=v;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRequirements(String[] requirements) {
        this.requirements = requirements;
    }

    public void setVersion(double[] version) {
        this.version = version;
    }

    public String getBrand() {
        return brand;
    }

    public String getName() {
        return name;
    }

    public String[] getRequirements() {
        return requirements;
    }

    public double[] getVersion() {
        return version;
    }
}
