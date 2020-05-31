package l13;

public class Keyboard {

    private Brand brand;
    private KeyboardSize keyboardSize;
    private ConnectionType connectionType;

    public Keyboard(Brand brand, KeyboardSize keyboardSize, ConnectionType connectionType) {
        this.brand = brand;
        this.keyboardSize = keyboardSize;
        this.connectionType = connectionType;
    }

    public KeyboardSize getKeyboardSize() {
        return keyboardSize;
    }

    public void setKeyboardSize(KeyboardSize keyboardSize) {
        this.keyboardSize = keyboardSize;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public ConnectionType getConnectionType() {
        return connectionType;
    }

    public void setConnectionType(ConnectionType connectionType) {
        this.connectionType = connectionType;
    }

    public String printInfo() {
        return "Keyboard brand: " + getBrand() + ". Keyboard size: " + getKeyboardSize() + ". Keyboard connection type: " + getConnectionType() + ".";
    }
}
