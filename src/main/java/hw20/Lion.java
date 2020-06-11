package hw20;

public class Lion extends Carnivores{
    private int paws;
    private String prideName;
    private boolean isHavePride;

    public Lion(int teeth, int claws) {
        super(teeth, claws);
    }

    public Lion(int teeth, int claws, int paws, String prideName, boolean isHavePride) {
        super(teeth, claws);
        this.paws = paws;
        this.prideName = prideName;
        this.isHavePride = isHavePride;
    }

    public int getPaws() {
        return paws;
    }

    public void setPaws(int paws) {
        this.paws = paws;
    }

    public String getPrideName() {
        return prideName;
    }

    public void setPrideName(String prideName) {
        this.prideName = prideName;
    }

    public boolean isHavePride() {
        return isHavePride;
    }

    public void setHavePride(boolean havePride) {
        isHavePride = havePride;
    }

    @Override
    protected void liveInPack() {
        System.out.println("Lions are living in pride.");
    }

    @Override
    public void suckMilk() {
        System.out.println("Even little lion sucks milk.");
    }

    @Override
    public void toHaveKingdom() {
        System.out.println("Lions king of the animals but it belongs to the Kingdom of Animals.");
    }

    @Override
    public void toExist() {
        System.out.println("I am! Rooow!");
    }

    @Override
    public void beAware() {
        System.out.println("Be fruitful and multiply. Do not over hunt.");
    }
}
