package homework_15;

import homework12.Units;

import java.util.Arrays;

public class Cake_chocolate extends Cake_basic implements Bake {
    protected int cocoa_powder;
    protected int dark_chocolate;

    public Cake_chocolate(Units[] unit, int flour, int eggs, int sugar, int butter, int baking_powder, int cocoa_powder, int dark_chocolate) {
        super(unit, flour, eggs, sugar, butter, baking_powder);
        this.cocoa_powder = cocoa_powder;
        this.dark_chocolate = dark_chocolate;
    }

    @Override
    public void bake() {
        System.out.println("Chocolate Cake Recipe. Units:" + Arrays.toString(unit) + "\n" +
                "Flour: " +flour+ "\n" +
                "Eggs: " +eggs+ "\n" +
                "Sugar" +sugar+ "\n" +
                "Butter:" +butter+ "\n" +
                "Baking powder: " +baking_powder+ "\n" +
                "Cocoa powder: " +cocoa_powder+ "\n" +
                "Dark chocolate: " +dark_chocolate);
    }
}
