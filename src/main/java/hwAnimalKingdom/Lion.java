package hwAnimalKingdom;

import java.util.Random;

public class Lion extends Carnivores {
    public Lion(Sex sex) {
        super(14, 33, sex);
    }

    @Override
    public boolean hunt(Animals animal) {
        if (animal instanceof Mammals) {
            System.out.println("I got you!");
            animal.die();
            return true;
        } else {
            System.out.println("I do not hunt those.");
            return false;
        }
    }

    @Override
    public Life reproduce() {
        Random rnd = new Random();
        rnd.nextBoolean();
        if (rnd.nextBoolean()) {
            return new Lion(Sex.FEMALE);
        } else {
            return new Lion(Sex.MALE);
        }

    }


}
