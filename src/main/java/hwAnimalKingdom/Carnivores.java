package hwAnimalKingdom;

public abstract class Carnivores implements Mammals {
    private double lifeSpan;
    private int vertebraCount;
    private Sex sex;

    public Carnivores(double lifeSpan, int vertebraCount, Sex sex) {
        this.lifeSpan = lifeSpan;
        this.vertebraCount= vertebraCount;
        this.sex= sex;
    }

    public abstract boolean hunt(Animals animal);

    @Override
    public void feedMilk(Mammals[] baby) {
        System.out.println("Feeding babies...");
        for (Mammals m : baby) {
            System.out.println("   Baby has been fed.");
        }
        System.out.println("All babies have been fed.");
    }

    @Override
    public void die() {
        System.out.println("Carnivore has died. ");

    }

    @Override
    public double getLifeSpan() {
        return lifeSpan;
    }

    @Override
    public int getVertebraCount() {
        return vertebraCount;
    }

    @Override
    public void breath() {
        System.out.println("Carnivore is breathing!");
    }

    @Override
    public Sex getSex() {
        return sex;
    }
}
