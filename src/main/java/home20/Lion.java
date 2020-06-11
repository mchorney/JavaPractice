package home20;

import org.w3c.dom.ls.LSOutput;

public class Lion extends Carnivores{
    private String name;
    private int weight;

    public Lion(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    @Override
    public void eatmyPrey(){
        System.out.println("I eat meat. ");
    }

    @Override
    public void nursingTheirYoung(){
        System.out.println("My lioness feeds children milk. ");
    }

    @Override
    public void haveaSpinalColumn(){
        System.out.println("I have a spine. ");
    }

    @Override
    public void multicellular(){
        System.out.println("I multicellular. ");
    }

    @Override
    public void canBreath(){
        System.out.println("i breath clean aer. ");
    }

    @Override
    public String toString() {
        return "Lion{" +
                "name='" + name + '\'' +
                ", weight=" + weight +" kg"+
                '}';
    }
}
