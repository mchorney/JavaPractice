package hwk15;

public class App {
    public static void main(String[] args) {
        Fruits apple = new Apple("Pink Lady");
        apple.getVitamins();
        apple.makeDrink();

        Fruits pear = new TreeFruits(TreeFruitTypes.PEAR);
        pear.getVitamins();
        pear.makeDrink();

        System.out.println("**************************");

        Fruits grape = new Grapes(GrapeType.ISABELLA);
        grape.getVitamins();
        grape.makeDrink();

        Fruits wine = new Grapes(GrapeType.PINOTNOIR);
        wine.makeDrink();

        System.out.println("**************************");
        System.out.println("**************************");

        Grapes grape2 = new Grapes(GrapeType.LADYFINGERS);
        System.out.println(grape2.getType().wineName);
        grape2.getVitamins();
        grape2.makeDrink();

        Apple apple2 = new Apple("Opal");
        System.out.println(apple2.getName());
        apple2.getVitamins();
        apple2.setName("Fuji");
        apple2.makeDrink();
        System.out.println(apple2.getName());
    }
}
