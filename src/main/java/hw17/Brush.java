package hw17;

public class Brush {

    private String targetedArea;
    private String color;
    private int price;

    public Brush(String targetedArea, String color, int price) {
        this.targetedArea = targetedArea;
        this.color = color;
        this.price = price;
    }

    public String getTargetedArea() {
        return targetedArea;
    }

    public void setTargetedArea(String targetedArea) {
        this.targetedArea = targetedArea;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
