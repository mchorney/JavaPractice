package hwk14;

public class App {
    public static void main(String[] args) {
        Fruit banana = new Fruit("banana", "yellow", Taste.SWEET, false, SugarLevel.HIGH);
        System.out.println(banana.name.toUpperCase() + " has " + banana.getSugarlevel()+ " sugar");
        banana.printFruit();

        Citrus lemon = new Citrus("lemon", "yellow", Taste.SOUR, true, SugarLevel.LOW, Type.HIBRID, CitrusFamily.CITRON);
        System.out.println(lemon.name.toUpperCase() + " has " + lemon.getSugarlevel()+ " sugar");
        lemon.printFruit();

        Berries blueberries = new Berries("blueberries", "blue", Taste.SWEET, false, SugarLevel.LOW, BerriesFamily.ERICACEAE, false);
        System.out.println(blueberries.name.toUpperCase() + " has " + blueberries.getSugarlevel()+ " sugar");
        blueberries.printFruit();
    }
}
