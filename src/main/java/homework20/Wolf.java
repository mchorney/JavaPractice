package homework20;

public class Wolf extends Carnivores{
    private double sizeOfguardFurlayer;
    private String coarseHairColor;

    public Wolf(int year, String areaOfLiving, String name, double sizeOfguardFurlayer, String coarseHairColor) {
        super(year, areaOfLiving, name);
        this.sizeOfguardFurlayer = sizeOfguardFurlayer;
        this.coarseHairColor = coarseHairColor;
    }
    public double getSizeOfguardFurlayer() {
        return sizeOfguardFurlayer;
    }
    public void setSizeOfguardFurlayer(double sizeOfguardFurlayer) {
        this.sizeOfguardFurlayer = sizeOfguardFurlayer;
    }
    public String getCoarseHairColor() {
        return coarseHairColor;
    }
    public void setCoarseHairColor(String coarseHairColor) {
        this.coarseHairColor = coarseHairColor;
    }
    @Override
    public boolean hasCell(){
        System.out.println("Can you imagine! I also has this from the Life ancestor: And yes, I also have at least one cell and even more:)");
        return true;
    }
    @Override
    public boolean hasNucleus(){
        return true;
    }
    @Override
    public boolean isMulticellular(){
        System.out.println("I also the multicellular organism!");
        return true;
    }
    @Override
    public boolean hasVertebra() {
        System.out.println("And also has vertebra!");
        return true;
    }
    @Override
    public boolean closedCirculatorySystem() {
        System.out.println("I have closed Circulatory System!");
        return true;
    }
    @Override
    public boolean differentiationOfTheNervousSystem() {
        return true;
    }
    @Override
    public void fetalDevelopment() {
        System.out.println("I am a Walf Shaba, and I have a fetal development");
    }
    @Override
    public void milkFeeding(){
        System.out.println("I am a Walf Shaba, and I can feed my baby with milk");
    }
    @Override
    public void developedBrain() {
        System.out.println("I am a Walf Shaba, and I also have well developed brain");
    }

    public void printInfo() {
        System.out.println("Wolf: " + "Size Of guard Fur layer: " + sizeOfguardFurlayer   + ", Coarse Hair Color: " + coarseHairColor
                + ", " + "Years old: " + year + ", " + "Area Of Living: " + areaOfLiving + ", " + "Name: " + name);
    }
}
