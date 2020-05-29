package homework11;

public class Dress {
    private int size;
    private String color;
    private double price;
    private String occasion;
    private String sleeve_length;
    private String neckline;

    //Constructors
    public Dress() {}
    public Dress(int size, String color, double price, String occasion, String sleeve_length, String neckline) {
        this.size = size;
        this.color = color;
        this.price = price;
        this.occasion = occasion;
        this.sleeve_length = sleeve_length;
        this.neckline = neckline;
    }
    public Dress(int size, String color, double price, String occasion,String sleeve_length) {
        this.size = size;
        this.color = color;
        this.price = price;
        this.occasion = occasion;
        this.sleeve_length = sleeve_length;
    }
    public Dress(int size, String color, double price) {
        this.size = size;
        this.color = color;
        this.price = price;
    }
    public Dress(int size, String color) {
        this.size = size;
        this.color = color;
    }
    public Dress(int size) {
        this.size = size;
    }
    // Getters & Setters
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getOccasion() {
        return occasion;
    }
    public void setOccasion() {
        this.occasion = occasion;
    }
    public String getSleeve_length() {
        return sleeve_length;
    }
    public void setSleeve_length() {
        this.sleeve_length = sleeve_length;
    }
    public String getNeckline() {
        return neckline;
    }
    public void setNeckline() {
        this.neckline = neckline;
    }
    public void printClass(){
        System.out.println("Size: " + size + "\nColor: " + color + "\nPrice: " + price + "\nOccasion: " + occasion + "\nSleeve length:  "
                + sleeve_length + "\nNeckline: " + neckline);
    }
}
