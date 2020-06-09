package hwk17;

public class Colors {
    protected ColorChoice color;

    public Colors(ColorChoice color) {
        this.color = color;
    }

    public String getName() {
        return color.name();
    }

    public void setColor(ColorChoice color) {
        this.color = color;
    }
}
