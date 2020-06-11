package homework20;

public class BlueWhale extends Carnivores {
    private double size;
    private String skin_color;

    public BlueWhale(int year, String areaOfLiving, String name, double size, String skin_color) {
        super(year, areaOfLiving, name);
        this.size = size;
        this.skin_color = skin_color;
    }
    public double getSize() {
        return size;
    }
    public void setSize(double size) {
        this.size = size;
    }
    public String getSkin_color() {
        return skin_color;
    }
    public void setSkin_color(String skin_color) {
        this.skin_color = skin_color;
    }
    @Override
    public boolean hasCell() {
        System.out.println("Can you imagine! this is from the Life ancestor: And yes, I have at least one cell and even more:)");
        return true;
    }
    @Override
    public boolean hasNucleus() {
        return true;
    }
    @Override
    public boolean isMulticellular() {
        System.out.println("I am multicellular organism!");
        return true;
    }
    @Override
    public boolean hasVertebra() {
        System.out.println("And I has vertebra!");
        return true;
    }
    @Override
    public boolean closedCirculatorySystem() {
        return true;
    }
    @Override
    public boolean differentiationOfTheNervousSystem() {
        System.out.println("And I have differentiation Of The Nervous System!");
        return true;
    }
    @Override
    public void fetalDevelopment() {
        System.out.println("I am a BlueWhale Ivy, and I have a fetal development");
    }
    @Override
    public void milkFeeding() {
        System.out.println("I am a BlueWhale Ivy, and I feed my baby with milk");
    }
    @Override
    public void developedBrain() {
        System.out.println("I am a BlueWhale Ivy, and I have well developed brain");
    }
    public void printInfo() {
        System.out.println("BlueWhale: " + "size=" + size + ", Skin color: " + skin_color + " ," + "Years old: " + year + ", "
                + "Area Of Living: " + areaOfLiving + ", Name: " + name);
    }
}
