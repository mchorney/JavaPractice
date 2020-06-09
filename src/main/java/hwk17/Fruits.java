package hwk17;

public class Fruits {
    protected FruitTypes type;


    public Fruits(FruitTypes type) {
        this.type = type;
    }

    public String getName() {
        return type.name();
    }

    public void getVitamins() {
        System.out.println(type.name() + " has lots of vitamins");
    }

    public void makeDrink() {
        System.out.println("You are drinking " + type.name() + " juice.");
    }

}
