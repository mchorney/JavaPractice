package homework_15;

import homework12.Units;

import java.util.Arrays;

public class Cake_basic {
    protected int flour;
    protected int eggs;
    protected int sugar;
    protected int butter;
    protected int baking_powder;
    protected Units[] unit;

    public Cake_basic(Units[] unit, int flour, int eggs, int sugar, int butter, int baking_powder) {
        this.unit = unit;
        this.flour = flour;
        this.eggs = eggs;
        this.sugar = sugar;
        this.butter = butter;
        this.baking_powder = baking_powder;
    }

    public void printInfo(){
        System.out.println("Basic Cake Recipe. Units:" + Arrays.toString(unit) + "\n" +
                "Flour: " +flour+ "\n" +
                "Eggs: " +eggs+ "\n" +
                "Sugar" +sugar+ "\n" +
                "Butter:" +butter+ "\n" +
                "Baking powder: " +baking_powder);
    }
}
