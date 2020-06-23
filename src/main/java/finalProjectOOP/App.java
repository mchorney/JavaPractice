package finalProjectOOP;

public class App {
    public static void main(String[] args) {
        Lion lion = new Lion("King", 7);
        lion.canBreath();
        lion.evolution();
        lion.flesh();
        lion.food();
        lion.voice();

        Wolf wolf = new Wolf("Bobbi", "Lox");
        wolf. canBreath();
        wolf.evolution();
        wolf.food();
        wolf.flesh();
        wolf.voice();

        BlueWhale blueWhale = new BlueWhale("Dipp Dawe", 15, "Male");
        blueWhale.canBreath();
        blueWhale.evolution();
        blueWhale.food();
        blueWhale.swimming();
        blueWhale.voice();
    }
}
