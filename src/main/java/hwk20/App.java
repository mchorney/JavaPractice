package hwk20;

public class App {
    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.alive();
        lion.backbone();
        lion.breath();
        lion.breed();
        lion.eatMeat();
        lion.move();
        lion.talk();
        lion.walk();

        Wolf wolf = new Wolf();
        wolf.alive();
        wolf.backbone();
        wolf.breath();
        wolf.breed();
        wolf.eatMeat();
        wolf.move();
        wolf.talk();
        wolf.walk();

        BlueWhale whale = new BlueWhale();
        whale.alive();
        whale.backbone();
        whale.breath();
        whale.breed();
        whale.eatMeat();
        whale.move();
        whale.talk();
        whale.walk();
    }
}
