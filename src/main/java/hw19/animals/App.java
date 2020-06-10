package hw19.animals;

public class App {
    public static void main(String[] args) {

        System.out.println("*****************");
        BlueWhale blueWhale = new BlueWhale();
        blueWhale.printMyName("Sammy");
        blueWhale.canBreath();
        blueWhale.haveFourChamberedHeart();
        blueWhale.haveSkeletalStructure();
        blueWhale.multicellular();

        System.out.println("*****************");
        Lion lion = new Lion();
        lion.printMyName("Simba");
        lion.canBreath();
        lion.haveFourChamberedHeart();
        lion.haveSkeletalStructure();
        lion.multicellular();

        System.out.println("*****************");
        Wolf wolf = new Wolf();
        wolf.printMyName("Jack");
        wolf.canBreath();
        wolf.haveFourChamberedHeart();
        wolf.haveSkeletalStructure();
        wolf.multicellular();

    }
}
