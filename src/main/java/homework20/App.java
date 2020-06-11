package homework20;

public class App {
    public static void main(String[] args) {
        BlueWhale blueWhale = new BlueWhale(3, "Pacific Ocean", "Ivy", 110000, "Grey");
        blueWhale.printInfo();
        System.out.println("This feature I received from my the most early ancestor: ");
        blueWhale.hasCell();
        System.out.println("And those features are from some others ancestors: ");
        blueWhale.isMulticellular();
        blueWhale.hasVertebra();
        blueWhale.differentiationOfTheNervousSystem();
        System.out.println("And some more information about me: ");
        blueWhale.fetalDevelopment();
        blueWhale.milkFeeding();
        blueWhale.developedBrain();

        Wolf wolf = new Wolf(2, "Pacific NorthWest", "Shaba", 2, "black");
        wolf.printInfo();
        System.out.println("This feature I received from my the most early ancestor: ");
        wolf.hasCell();
        System.out.println("And those features are from some others ancestors: ");
        wolf.isMulticellular();
        wolf.hasVertebra();
        wolf.closedCirculatorySystem();
        System.out.println("And some more information about me: ");
        wolf.milkFeeding();
        wolf.developedBrain();

        Lion lion = new Lion(4, "Africa", "Elisa", 420, true);
        lion.printInfo();
        System.out.println("This feature I received from my the most early ancestor: ");
        lion.hasCell();
        System.out.println("And those features are from some others ancestors: ");
        lion.isMulticellular();
        lion.hasVertebra();
        lion.differentiationOfTheNervousSystem();
        System.out.println("And some more information about me: ");
        lion.fetalDevelopment();
        lion.milkFeeding();
        lion.developedBrain();
    }
}
