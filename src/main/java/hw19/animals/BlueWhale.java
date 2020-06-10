package hw19.animals;

public class BlueWhale extends Carnivores {
    @Override
    public void haveFourChamberedHeart() {
        System.out.println("* As a Blue Whale, I have four chambered heart");
    }

    @Override
    public void haveSkeletalStructure() {
        System.out.println("* As a Blue Whale, I have skeletal structure");
    }

    @Override
    public void multicellular() {
        System.out.println("* As a Blue Whale, I am multicellular");
    }

    @Override
    public void canBreath() {
        System.out.println("* As a Blue Whale, I can breath");
    }

    public void printMyName(String name){
        System.out.println("My name is " + name + ", and I'm a Blue Whale. Here are some fun facts about me:");
    }
}
