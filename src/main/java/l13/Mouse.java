package l13;

public class Mouse {
    private Brand brand;
    private MouseType mouseType;
    private ConnectionType connectionType;

    public Mouse(Brand brand, MouseType mouseType, ConnectionType connectionType) {
        this.brand = brand;
        this.mouseType = mouseType;
        this.connectionType = connectionType;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public MouseType getMouseType() {
        return mouseType;
    }

    public void setMouseType(MouseType mouseType) {
        this.mouseType = mouseType;
    }

    public ConnectionType getConnectionType() {
        return connectionType;
    }

    public void setConnectionType(ConnectionType connectionType) {
        this.connectionType = connectionType;
    }

    public String printInfo() {
        return "Mouse brand: " + getBrand() + ". Mouse type: " + getMouseType() + ". Mouse connection type: " + getConnectionType() + ".";
    }
}
