package hw14;

public class Hat extends Accessory {
    private HatType type;
    private Season season;

    public Hat(HatType type, Season season) {
        this.type = type;
        this.season = season;
    }

    public Hat(Color color, Fabric fabric, int price, HatType type, Season season) {
        super(color, fabric, price);
        this.type = type;
        this.season = season;
    }

    public HatType getType() {
        return type;
    }

    public void setType(HatType type) {
        this.type = type;
    }

    public Season getSeason() {
        return season;
    }

    public void setSeason(Season season) {
        this.season = season;
    }

    @Override
    public void printMe() {
        System.out.println("Hat: " +
                "color is " + color +
                ", fabric is " + fabric +
                ", price is $" + price +
                ", type is " + type +
                ", season is " + season);
    }
}
