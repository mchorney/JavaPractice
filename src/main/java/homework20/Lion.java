package homework20;

public class Lion extends Carnivores {
    private double weight;
    private boolean isHunter;

    public Lion(int year, String areaOfLiving, String name, double weight, boolean isHunter) {
        super(year, areaOfLiving, name);
        this.weight = weight;
        this.isHunter = isHunter;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public boolean isHunter() {
        return isHunter;
    }
    public void setHunter(boolean hunter) {
        isHunter = hunter;
    }
    @Override
    public boolean hasCell() {
        System.out.println("Can you imagine! As the blueWhale and the wolf, I also has this from the Life ancestor: And yes, I also have at least one cell and even more!");
        return true;
    }
    @Override
    public boolean hasNucleus() {
        return true;
    }
    @Override
    public boolean isMulticellular() {
        System.out.println("Hey! I am multicellular organism!");
        return true;
    }
    @Override
    public boolean hasVertebra() {
        System.out.println("I has a vertebra!");
        return true;
    }
    @Override
    public boolean closedCirculatorySystem() {
        return true;
    }
    @Override
    public boolean differentiationOfTheNervousSystem() {
        System.out.println("I have very advanced nervious system!");
        return true;
    }
    @Override
    public void fetalDevelopment() {
        System.out.println("I am a Lion Elisa, and I have a fetal development");
    }
    @Override
    public void milkFeeding() {
        System.out.println("I am a Lion Elisa, and I can feed my baby with milk");
    }

    ;

    @Override
    public void developedBrain() {
        System.out.println("I am a Lion Elisa, and I also have super developed brain");
    }

    public void printInfo() {
        System.out.println("Lion: " + "My weight: " + weight + ", I am a hunter: : " + isHunter + ", " + "Years old: "
                + year + ", " + "Area Of Living: " + areaOfLiving + ", Name: " + name);
    }
}
