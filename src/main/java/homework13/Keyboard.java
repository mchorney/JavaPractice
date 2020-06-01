package homework13;

public class Keyboard {
    private Brand keyboardBrand;
    private Color color;
    private CordPresence cordPresence;
    private String typesOfSwitches;

    public Keyboard(Brand keyboardBrand, Color color, CordPresence cordPresence, String typesOfSwitches) {
        this.keyboardBrand = keyboardBrand;
        this.color = color;
        this.cordPresence = cordPresence;
        this.typesOfSwitches = typesOfSwitches;
    }

    public Brand getKeyboardBrand() {
        return keyboardBrand;
    }

    public void setKeyboardBrand(Brand keyboardBrand) {
        this.keyboardBrand = keyboardBrand;
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

    public String getTypesOfSwitches() {
        return typesOfSwitches;
    }

    public void setTypesOfSwitches(String typesOfSwitches) {
        this.typesOfSwitches = typesOfSwitches;
    }

    public String printInfo() {
        return "Keyboard{" +
                "keyboardBrand=" + keyboardBrand +
                ", color=" + color +
                ", cordPresence=" + cordPresence +
                ", typesOfSwitches='" + typesOfSwitches + '\'' +
                '}';
    }
}
