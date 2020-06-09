package hwk15;

public class TreeFruits implements Fruits{
    protected TreeFruitTypes types;


    public TreeFruits(TreeFruitTypes types) {
        this.types = types;
    }

    public String getName() {
        return types.name();
    }

    @Override
    public void getVitamins() {
        System.out.println(types.name() + " has lots of vitamins");
    }

    @Override
    public void makeDrink() {
        System.out.println("You are drinking " + types.name() + " juice.");
    }

}
