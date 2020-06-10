package hw19.animals;

public class Wolf extends Carnivores {
    @Override
    public void haveFourChamberedHeart() {
        System.out.println("* As a Wolf, I have four chambered heart");
    }

    @Override
    public void haveSkeletalStructure() {
        System.out.println("* As a Wolf, I have skeletal structure");
    }

    @Override
    public void multicellular() {
        System.out.println("* As a Wolf, I am multicellular");
    }

    @Override
    public void canBreath() {
        System.out.println("* As a Wolf, I can breath");
    }

    public void printMyName(String name){
        System.out.println("My name is " + name + ", and I'm a Wolf. Here are some fun facts about me:");
    }
}
