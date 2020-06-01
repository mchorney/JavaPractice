package homework13;

public class Mouse {
    private Brand mouseBrand;
    private Color color;
    private CordPresence cordPresence;
    private int numberOfButtons;

    public Mouse(Brand mouseBrand, Color color, CordPresence cordPresence, int numberOfButtons) {
        this.mouseBrand = mouseBrand;
        this.color = color;
        this.cordPresence = cordPresence;
        this.numberOfButtons = numberOfButtons;
    }

    public Brand getMouseBrand() {
        return mouseBrand;
    }

    public void setMouseBrand(Brand mouseBrand) {
        this.mouseBrand = mouseBrand;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public CordPresence getCordPresence() {
        return cordPresence;
    }

    public void setCordPresence(CordPresence cordPresence) {
        this.cordPresence = cordPresence;
    }

    public int getNumberOfButtons() {
        return numberOfButtons;
    }

    public void setNumberOfButtons(int numberOfButtons) {
        this.numberOfButtons = numberOfButtons;
    }

    public String ptintInfo() {
        return "Mouse{" +
                "mouseBrand=" + mouseBrand +
                ", color=" + color +
                ", cordPresence=" + cordPresence +
                ", numberOfButtons=" + numberOfButtons +
                '}';
    }
}
