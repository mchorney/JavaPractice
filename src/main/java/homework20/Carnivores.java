package homework20;

public abstract class Carnivores implements Mammals {
    protected int year;
    protected String areaOfLiving;
    protected String name;

    public Carnivores(){}

    public Carnivores(int year, String areaOfLiving, String name) {
        this.year = year;
        this.areaOfLiving = areaOfLiving;
        this.name = name;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public String getAreaOfLiving() {
        return areaOfLiving;
    }
    public void setAreaOfLiving(String areaOfLiving) {
        this.areaOfLiving = areaOfLiving;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public abstract boolean hasCell();
    public abstract boolean hasNucleus();
    public abstract boolean isMulticellular();
    public abstract boolean hasVertebra();
    public abstract boolean closedCirculatorySystem();
    public abstract boolean differentiationOfTheNervousSystem();
    public abstract void fetalDevelopment();
    public abstract void milkFeeding();
    public abstract void developedBrain();

    @Override
    public String toString() {
        return "Carnivores{" +
                "year=" + year +
                ", areaOfLiving='" + areaOfLiving + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
