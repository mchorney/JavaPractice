package hwk15;

public class Grapes implements Fruits{
    private GrapeType type;

    public Grapes(GrapeType type) {
        this.type = type;
    }

    public GrapeType getType() {
        return type;
    }

    @Override
    public void makeDrink() {
        System.out.println("You are drinking " + type.wineName + " wine.");
    }

    @Override
    public void getVitamins() {
        System.out.println("Grapes have lots of vitamine K!");
    }
}
