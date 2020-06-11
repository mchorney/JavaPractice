package hw20;

public class App {
    public static void main(String[] args) {
        Wolf wolf = new Wolf(1,10,"Grey",8);
        wolf.suckMilk();
        wolf.devourTheFlash();
        wolf.toExist();
        wolf.toHaveKingdom();
        wolf.liveInPack();
        wolf.toExist();
        wolf.beAware();
        Life.beAccountable();
        System.out.println();

        Lion lion = new Lion(24,8,4,"Lion Pride",true);
        lion.suckMilk();
        lion.devourTheFlash();
        lion.toExist();
        lion.toHaveKingdom();
        lion.liveInPack();
        lion.toExist();
        lion.beAware();
        Life.beAccountable();
        System.out.println();

        BlueWhale blueWhale = new BlueWhale(0,0,4,"Pacific Ocean",28.5);
        blueWhale.suckMilk();
        blueWhale.devourTheFlash();
        blueWhale.toExist();
        blueWhale.toHaveKingdom();
        blueWhale.liveInPack();
        blueWhale.toExist();
        blueWhale.beAware();
        Life.beAccountable();
    }
}
