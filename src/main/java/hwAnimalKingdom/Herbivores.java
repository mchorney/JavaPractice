package hwAnimalKingdom;

public abstract class Herbivores implements Vertebrates, Mammals{
    private double lifeSpan;
    private int vertebraCount;
    private Sex sex;
    public abstract double eatGrass(int x);

    public Herbivores(double lifeSpan, Sex sex) {
        this.lifeSpan = lifeSpan;
        this.sex = sex;
    }

    @Override
    public void breath() {
        System.out.println("Herbivore is breathing!");
    }

    @Override
    public Sex getSex() {
        return sex;
    }

    @Override
    public int getVertebraCount() {
        return vertebraCount;
    }


    @Override
    public void die() {
        System.out.println("Herbivore has died. ");
    }

    @Override
    public double getLifeSpan() {
        return lifeSpan;
    }

    @Override
    public void feedMilk(Mammals[] baby) {

    }
}
