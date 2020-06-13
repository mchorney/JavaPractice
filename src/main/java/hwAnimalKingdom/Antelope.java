package hwAnimalKingdom;

import java.util.Random;

public class Antelope extends Herbivores{
    public Antelope( Sex sex) {
        super(19, sex);
    }

    @Override
    public Life reproduce() {
        Random rnd = new Random();
        
        if (rnd.nextBoolean()) {
            return new Antelope(Sex.FEMALE);
        } else {
            return new Antelope(Sex.MALE);
        }
    }

    @Override
    public double eatGrass(int hours) {
        return hours*2;
    }



}
