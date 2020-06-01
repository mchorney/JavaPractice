package hw11;

public class Floor {
    private String type;
    private String color;
    private int[] thickness;

    public Floor(String type, String color, int[] thickness) {
        this.color = color;
        this.thickness = thickness;
        this.type = type;
    }

    public Floor() {
    }

    ;

    public Floor(String type, String color) {
        this.type = type;
        this.color = color;
    }


    public void setColor(String color) {
        this.color = color;
    }

    public void setThickness(int[] thickness) {
        this.thickness = thickness;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;

    }

    public int[] getThickness() {
        return thickness;
    }

    public void printout() {
        System.out.println("Type = " + this.type + "\nColor = " + this.color);
        for (int thickness : this.thickness){
            System.out.println(thickness);
        }
    }
}
