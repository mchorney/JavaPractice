package homework11;

public class Forest {
    private int amount_of_coniferous_plants;
    private int amount_of_deciduous_plants;
    private String location;
    private double area;

    //Constructors
    public Forest() {}
    public Forest(int amount_of_coniferous_plants, int amount_of_deciduous_plants, String location, double area) {
        this.amount_of_coniferous_plants = amount_of_coniferous_plants;
        this.amount_of_deciduous_plants = amount_of_deciduous_plants;
        this.location = location;
        this.area = area;
    }
    public Forest(int amount_of_deciduous_plants, int amount_of_coniferous_plants, double area) {
        this.amount_of_deciduous_plants = amount_of_deciduous_plants;
        this.amount_of_coniferous_plants = amount_of_coniferous_plants;
        this.area = area;
    }
    public Forest(String location, double area) {
        this.location = location;
        this.area = area;
    }

    // Getters& Setters
    public int getAmount_of_coniferous_plants() {
        return amount_of_coniferous_plants;
    }
    public void setAmount_of_coniferous_plants() {
        this.amount_of_coniferous_plants = amount_of_coniferous_plants;
    }
    public int getAmount_of_deciduous_plants() {
        return amount_of_deciduous_plants;
    }
    public void setAmount_of_deciduous_plants() {
        this.amount_of_deciduous_plants = amount_of_deciduous_plants;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public double getArea() {
        return area;
    }
    public void setArea(double area) {
        this.area = area;
    }
    public void printClass() {
        System.out.println("Amount_of_coniferous_plants: " + amount_of_coniferous_plants + "\nAmount_of_deciduous_plants: "
                + amount_of_deciduous_plants + "\nLocation: " + location + "\nArea: " +
                + area);
    }
}







