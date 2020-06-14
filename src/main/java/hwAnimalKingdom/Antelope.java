package hwAnimalKingdom;

import java.util.Random;

public class Antelope extends Herbivores{
    private String name;

    public Antelope( Sex sex, String name) {

        super(19, sex);
        this.name=name;
    }

    @Override
    public Life reproduce() {
        Random rnd = new Random();
        
        if (rnd.nextBoolean()) {
            return new Antelope(Sex.FEMALE, "Baby of "+name);
        } else {
            return new Antelope(Sex.MALE,"Baby of "+name);
        }
    }

    @Override
    public double eatGrass(int hours) {
        return hours*2;
    }

    @Override
    public String toString() {
        return "Antelope{" +
                "name='" + name + '\'' +
                '}';
    }
}
