package finalProject;

public class Aapp {
    public static void main(String[] args) {
        Bluewhale bluewhale = new Bluewhale("Boby tick", 222222.22222);
        bluewhale.food();
        bluewhale.canMove();
        bluewhale.flesh();
        bluewhale.voice();

        System.out.println(" ");
        Lion lion = new Lion("blue Lion","boss");

        lion.flesh();
        lion.food();
        lion.voice();
        lion.canMove();

        System.out.println(" ");
        Wolf wolf = new Wolf("babut woolf");
        wolf.food();
        wolf.flesh();
        wolf.voice();
        wolf.canMove();
    }
}
