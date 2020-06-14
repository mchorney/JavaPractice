package hwAnimalKingdom;

public class Worm implements Invertebrates {
    private double length;

    public Worm(double length) {
        this.length = length;
    }

    @Override
    public boolean isTasty() {
        return false;
    }

    @Override
    public void breath() {
        System.out.println("Worm is breathing!");

    }

    @Override
    public Sex getSex() {
        return Sex.UNDEFINED;
    }

    @Override
    public Life reproduce() {
        return new Worm(22);

    }

    @Override
    public void die() {
        System.out.println("Worm is died!");

    }

    @Override
    public double getLifeSpan() {
        return 7;
    }
}
