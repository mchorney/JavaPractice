package homework_14_1;

import homework12.Units;

import java.util.Arrays;

public class Cake_recipe_banana extends Cake_recipe_basic {
    protected int banana;

    public Cake_recipe_banana(Units[] unit, int flour, int eggs, int sugar, int butter, int baking_powder, int banana) {
        super(unit, flour, eggs, sugar, butter, baking_powder);
        this.banana = banana;
    }

    public void printInfo(){
        System.out.println("Basic Banana Cake Recipe. Units:" + Arrays.toString(unit) + "\n" +
                "Flour: " +flour+ "\n" +
                "Eggs: " +eggs+ "\n" +
                "Sugar" +sugar+ "\n" +
                "Butter:" +butter+ "\n" +
                "Baking powder: " +baking_powder+ "\n" +
                "Banana: " +banana);
    }
}
