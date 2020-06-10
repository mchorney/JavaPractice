package hw17;

public class Cell_phones {
    private String brand;
    private String color;

    public Cell_phones(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    void printInfo (){
        System.out.println("Cellphone is "+ brand + " with " + color + "cover");
    }

    @Override
    public String toString() {
        return "Cell_phones{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
