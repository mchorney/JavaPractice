package homework15;

public class App {
    public static void main(String[] args) {

        Flyable karlson = new KarlsonWhoLivesOnRoof();
        karlson.canFly();

        Flyable humminbird = new Hummingbird("Trochilidae", "North America", 1, true);
        humminbird.canFly();
        ((Hummingbird) humminbird).canSing();
        System.out.println(((Hummingbird) humminbird).aboutMe());

        Bird nightingale = new Nightingale("Muscicapidae", "North of Russia", 2);
        ((Nightingale) nightingale).canFly();
        nightingale.canSing();
        System.out.println(((Nightingale) nightingale).aboutMe());

        new Whale().canFly();
    }
}
