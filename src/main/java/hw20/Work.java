package hw20;

public class Work {
    public static void main(String[] args) {
        Lion lion = new Lion("Simba", 2);
        Wolf wolf = new Wolf("Night Wolf", 5);
        BlueWhale blueWhale = new BlueWhale("Kit", 3);
        System.out.println(lion.toString());
        lion.canBreath();
        lion.canMove();
        lion.isChordates();
        lion.killForFood();
        lion.milkFeed();
        System.out.println("---");
        System.out.println(wolf.toString());
        wolf.canBreath();
        wolf.canMove();
        wolf.isChordates();
        wolf.killForFood();
        wolf.milkFeed();
        System.out.println("---");
        System.out.println(blueWhale.toString());
        blueWhale.canBreath();
        blueWhale.canMove();
        blueWhale.isChordates();
        blueWhale.killForFood();
        blueWhale.milkFeed();
    }
}
