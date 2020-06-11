package home20;

public class BlueWhale extends Carnivores {
    private String name;
    private int weight;
    private String color;

    public BlueWhale(String name, int weight, String color) {
        this.name = name;
        this.weight = weight;
        this.color = color;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public void eatmyPrey(){
        System.out.println("I eat fish, this is my prey.");
    }
    @Override
   public void nursingTheirYoung(){
        System.out.println("Femail BlueWhale feeds our children with milk. ");
    }
    @Override
    public void haveaSpinalColumn(){
        System.out.println("i have sine.");
    }
    @Override
    public void multicellular(){
        System.out.println("I multicellular.");
    }
    @Override
    public void canBreath(){
        System.out.println("I breath when I up the water.");
    }


    public void printMe() {
        System.out.println("BlueWhale{" +" my name is " + name + ", my weight is " + weight +" kg"+ ", my color is " + color +'}');
    }
}
