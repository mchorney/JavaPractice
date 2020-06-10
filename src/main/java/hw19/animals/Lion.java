package hw19.animals;

public class Lion extends Carnivores {

    @Override
    public void haveFourChamberedHeart() {
        System.out.println("* As a Lion, I have four chambered heart");
    }

    @Override
    public void haveSkeletalStructure() {
        System.out.println("* As a Lion, I have skeletal structure");
    }

    @Override
    public void multicellular() {
        System.out.println("* As a Lion, I am multicellular");
    }

    @Override
    public void canBreath() {
        System.out.println("* As a Lion, I can breath");
    }

    public void printMyName(String name){
        System.out.println("My name is " + name + ", and I'm a Lion. Here are some fun facts about me:");
    }
}
