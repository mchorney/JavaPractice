package hw14;

public class Deer extends Animal{
    private int numberOfLegs;
    boolean horns;

    public Deer(String name, String color, boolean vegetarian, int numberOfLegs, boolean horns) {
        super(name, color, vegetarian);
        this.numberOfLegs = numberOfLegs;
        this.horns = horns;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public boolean isHorns() {
        return horns;
    }

    public void setHorns(boolean horns) {
        this.horns = horns;
    }


    @Override
    public void printAnimal(){
        System.out.println("Deer{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", vegetarian=" + vegetarian + '\'' +
                ", numberOFLegs=" + numberOfLegs + '\'' +
                ", horns='" + horns +
                '}');
    }
}
