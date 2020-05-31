package homework12;

public class Flower {
    private FlowerName name;
    private FlowerColor color;
    private TypeOfFlowering type_of_flowring;
    String SunTolerance;
    String HardinesZone;

    public Flower(FlowerName name, FlowerColor color, TypeOfFlowering type_of_flowring, String sunTolerance, String hardinesZone) {
        this.name = name;
        this.color = color;
        this.type_of_flowring = type_of_flowring;
        SunTolerance = sunTolerance;
        HardinesZone = hardinesZone;
    }

    public FlowerName getName() {
        return name;
    }

    public void setName(FlowerName name) {
        this.name = name;
    }

    public FlowerColor getColor() {
        return color;
    }

    public void setColor(FlowerColor color) {
        this.color = color;
    }

    public TypeOfFlowering getType_of_flowring() {
        return type_of_flowring;
    }

    public void setType_of_flowring(TypeOfFlowering type_of_flowring) {
        this.type_of_flowring = type_of_flowring;
    }

    public String getSunTolerance() {
        return SunTolerance;
    }

    public void setSunTolerance(String sunTolerance) {
        SunTolerance = sunTolerance;
    }

    public String getHardinesZone() {
        return HardinesZone;
    }

    public void setHardinesZone(String hardinesZone) {
        HardinesZone = hardinesZone;
    }

    public String printFlower() {
        return "Flower{" +
                "name=" + name +
                ", color=" + color +
                ", type_of_flowring=" + type_of_flowring +
                ", SunTolerance='" + SunTolerance + '\'' +
                ", HardinesZone='" + HardinesZone + '\'' +
                '}';
    }

}
