package hw14;

public class App {
    public static void main(String[] args) {



    Clothes newclothes = new Clothes("GUCCI", "NEW MODELS", "EVERYTHING", "RED", 2018, MadeIn.ITALY);

    Person newManager = new Person("Mariya", "Sharapova", 1987);

    Winterwear oldcollection = new Winterwear("shanel", "winter suite", "active wear", "white", 2019, MadeIn.FRANCE, newManager);

    Springwear newCollection = new Springwear("H&M", "dresses", "evning dresses", "green", 2021, MadeIn.USA, newManager, "Alexandra");

newclothes.printMe();
newCollection.printMe();
    }
}
