package hwk14;

public class Fruit {
    protected String name;
    protected String color;
    protected Taste taste;
    protected boolean seeds;
    protected SugarLevel sugarlevel;

    public Fruit(String name, String color, Taste taste, boolean seeds, SugarLevel sugarlevel) {
        this.name = name;
        this.color = color;
        this.taste = taste;
        this.seeds = seeds;
        this.sugarlevel = sugarlevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Taste getTaste() {
        return taste;
    }

    public void setTaste(Taste taste) {
        this.taste = taste;
    }

    public boolean isSeeds() {
        return seeds;
    }

    public void setSeeds(boolean seeds) {
        this.seeds = seeds;
    }

    public SugarLevel getSugarlevel() {
        return sugarlevel;
    }

    public void setSugarlevel(SugarLevel sugarlevel) {
        this.sugarlevel = sugarlevel;
    }

    public void printFruit() {
        System.out.println("Fruit{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", taste=" + taste.name() +
                ", seeds=" + seeds +
                ", sugarlevel=" + sugarlevel.name() +
                '}');
    }
}
