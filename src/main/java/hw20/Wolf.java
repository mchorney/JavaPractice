package hw20;

public class Wolf extends Carnivores{
    private String skinColor;
    private int breadAmount;

    public Wolf(int teeth, int claws) {
        super(teeth, claws);
    }

    public Wolf(int teeth, int claws, String skinColor, int breadAmount) {
        super(teeth, claws);
        this.skinColor = skinColor;
        this.breadAmount = breadAmount;
    }

    public String getSkinColor() {
        return skinColor;
    }

    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
    }

    public int getBreadAmount() {
        return breadAmount;
    }

    public void setBreadAmount(int breadAmount) {
        this.breadAmount = breadAmount;
    }

    @Override
    protected void liveInPack() {
        System.out.println("I care about pack members.");
    }

    @Override
    public void suckMilk() {
        System.out.println("When I'm puppy I'm sucking milk.");
    }

    @Override
    public void toHaveKingdom() {
        System.out.println("I'm belonging to the Kingdom of Animals.");
    }

    @Override
    public void toExist() {
        System.out.println("I am! Wooo!");
    }
}
