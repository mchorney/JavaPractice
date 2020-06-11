package hw20;

public class App {
    public static void main(String[] args) {
        Lion lion = new Lion("Masai", 4);
        Wolf wolf = new Wolf("White Wolf", 6);
        BlueWhale blueWhale = new BlueWhale("Kasatka", 8);
        System.out.println(lion.toString());
        lion.canBreath();
        lion.canMove();
        lion.haveSpinalColumn();
        lion.killForFood();
        lion.milkFeed();
        System.out.println("------------------------------");
        System.out.println(wolf.toString());
        wolf.canBreath();
        wolf.canMove();
        wolf.haveSpinalColumn();
        wolf.killForFood();
        wolf.milkFeed();
        System.out.println("------------------------------");
        System.out.println(blueWhale.toString());
        blueWhale.canBreath();
        blueWhale.canMove();
        blueWhale.haveSpinalColumn();
        blueWhale.killForFood();
        blueWhale.milkFeed();
    }
}