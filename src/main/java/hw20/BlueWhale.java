package hw20;

public class BlueWhale extends Carnivores {
    private int flippers;
    private String flockLocation;
    private double weight;

    public BlueWhale(int teeth, int claws) {
        super(teeth, claws);
    }

    public BlueWhale(int teeth, int claws, int flippers, String flockLocation, double weight) {
        super(teeth, claws);
        this.flippers = flippers;
        this.flockLocation = flockLocation;
        this.weight = weight;
    }

    public int getFlippers() {
        return flippers;
    }

    public void setFlippers(int flippers) {
        this.flippers = flippers;
    }

    public String getFlockLocation() {
        return flockLocation;
    }

    public void setFlockLocation(String flockLocation) {
        this.flockLocation = flockLocation;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public void devourTheFlash() {
        System.out.println("Upppss! Not all carnivores have " + fangs + " fangs.");
    }

    @Override
    protected void liveInPack() {
        System.out.println("BlueWhale is carnivores but living in flock.");
    }

    @Override
    public void suckMilk() {
        System.out.println("It is hard to feed baby BlueWhale wit milk in the ocean.");
    }

    @Override
    public void toHaveKingdom() {
        System.out.println("BlueWhale is the biggest animal of the Animal of Kingdom ever!");
    }

    @Override
    public void toExist() {
        System.out.println("I do exist.");
    }

    @Override
    public void beAware() {
        System.out.println("Be fruitful and multiply. Please.");
    }
}
