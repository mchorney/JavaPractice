package hw20;

public class app {
    public static void main(String[] args) {


        Carnivores lion = new Lion("Lion", "Cat type");
        lion.printInfo();

        Carnivores wolf = new Wolf("Wolf", "Dogs");
        wolf.printInfo();

        Carnivores blueWhale = new BlueWhale("BlueWhale", "Fish");
        blueWhale.printInfo();




    }
}
