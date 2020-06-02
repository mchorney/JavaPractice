package hw14;

public class App {
    public static void main(String[] args) {

        Dog bulldog = new Dog("Bulldog", "white", false, 4);
        bulldog.printAnimal();

        Deer sambar = new Deer("Sambar", "brown", true, 4, true);
        sambar.printAnimal();

        Turtle diamondback = new Turtle("Diamondback", "green", true, 4, true);
        diamondback.printAnimal();

        Snake cobra = new Snake("Cobra", "yellow", false,  true);
        cobra.printAnimal();

    }
}
