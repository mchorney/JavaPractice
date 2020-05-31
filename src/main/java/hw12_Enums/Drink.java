package hw12_Enums;

import java.util.Arrays;

public class Drink {
    private String name;
    private KindOf kindOf;
    private FruitIngregients[] fruitIngredients;
    private OtherIngredients[] otherIngredients;

    public Drink(KindOf kindOf, String name, FruitIngregients[] fruitIngrigients, OtherIngredients[] otherIngridients) {
        this.name = name;
        this.fruitIngredients = fruitIngrigients;
        this.otherIngredients = otherIngridients;
        this.kindOf=kindOf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FruitIngregients[] getFruitIngredients() {
        return fruitIngredients;
    }

    public void setFruitIngredients(FruitIngregients[] fruitIngrigients) {
        this.fruitIngredients = fruitIngrigients;
    }

    public OtherIngredients[] getOtherIngredients() {
        return otherIngredients;
    }

    public void setOtherIngredients(OtherIngredients[] otherIngridients) {
        this.otherIngredients = otherIngridients;
    }

    public KindOf getKindOf() {
        return kindOf;
    }

    public void setKindOf(KindOf kindOf) {
        this.kindOf = kindOf;
    }

    public String order(){
        return name+" "+kindOf+" with "+Arrays.toString(fruitIngredients)+" and "+Arrays.toString(otherIngredients)+".";
    }
}
