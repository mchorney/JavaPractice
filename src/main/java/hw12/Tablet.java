package hw12;

import java.util.Arrays;

public class Tablet {
    private String model;
    private Color[] colors;

    public Tablet(String model, Color[] colors) {
        this.model = model;
        this.colors = colors;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Color[] getColors() {
        return colors;
    }

    public void setColors(Color[] colors) {
        this.colors = colors;
    }

    public String printTablet() {
        return "Tablet " +
                "model is '" + model +
                ", color is  " + Arrays.toString(colors) + '.';
    }
}
