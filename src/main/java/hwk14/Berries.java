package hwk14;

public class Berries extends Fruit {
    private BerriesFamily family;
    private boolean skin;

    public Berries(String name, String color, Taste taste, boolean seeds, SugarLevel sugarlevel, BerriesFamily family, boolean skin) {
        super(name, color, taste, seeds, sugarlevel);
        this.family = family;
        this.skin = skin;
    }

    public BerriesFamily getFamily() {
        return family;
    }

    public boolean isSkin() {
        return skin;
    }

    @Override
    public void printFruit() {
        System.out.println("Berries{" +
                "family=" + family +
                ", skin=" + skin +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", taste=" + taste +
                ", seeds=" + seeds +
                ", sugarlevel=" + sugarlevel +
                '}');
    }
}
