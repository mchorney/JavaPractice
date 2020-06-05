package homework15;

public class Whale implements Flyable {
    public boolean canFly() {
        System.out.println("I am whale - I can swim but I can't fly");
        return false;
    }
}
