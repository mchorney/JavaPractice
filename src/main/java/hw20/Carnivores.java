package hw20;

public abstract class Carnivores implements Mammals {
    static int fangs = 4;
    protected int teeth;
    protected int claws;

    public Carnivores(int teeth, int claws) {
        this.teeth = teeth;
        this.claws = claws;
    }

    public void devourTheFlash() {
        System.out.println("Eat meat. All carnivores have " + fangs + " fangs for hunting.");
    }

    protected abstract void liveInPack();
}
