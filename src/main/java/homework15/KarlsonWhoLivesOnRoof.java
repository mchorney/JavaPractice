package homework15;

public class KarlsonWhoLivesOnRoof implements Flyable {
    @Override
    public boolean canFly() {
        System.out.println("Let me introduce myself! I am Karlson who lives on one of the Stockholms roofs :) I can fly, but I am not a bird :)");
        return true;
    }
}
