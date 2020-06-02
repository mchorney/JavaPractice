package homework12;

public class Device {
    private String type;
    private PhoneModel model;
    private String color;

    public Device(String type, PhoneModel model, String color){
        this.type=type;
        this.model=model;
        this.color=color;
    }

    public String getType() {
        return type;
    }

    public PhoneModel getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Device {" +
                "type='" + type + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
