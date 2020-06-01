package hw13;


public class Mouse {
    private String name;
    private DeviceColor deviceColor;
    private MouseType mouseType;

    public Mouse(String name, DeviceColor deviceColor, MouseType mouseType) {
        this.name = name;
        this.deviceColor = deviceColor;
        this.mouseType = mouseType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DeviceColor getDeviceColorcolor() {
        return deviceColor;
    }

    public void setDeviceColorcolor(DeviceColor deviceColorcolor) {
        this.deviceColor = deviceColor;
    }

    public MouseType getMouseType() {
        return mouseType;
    }

    public void setMouseType(MouseType mouseType) {
        this.mouseType = mouseType;
    }

    @Override
    public String toString() {
        return "Mouse{" +
                "name='" + name + '\'' +
                ", deviceColorcolor=" + deviceColor +
                ", mouseType=" + mouseType +
                '}';
    }
    public void printInfo(){
        System.out.println(toString());
    }
}

