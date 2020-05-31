package l11_1;

public class Snickers {
    private String model;
    private String[] color;

    public Snickers(String model, String[] color) {
        this.model = model;
        this.color = color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String[] color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public String[] getColor() {
        return color;
    }
}
