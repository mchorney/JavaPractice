package hw12_Enums;

import java.util.Arrays;

public class Coffee {
    private String name;
    private TypesOfCoffee typesOfCoffee;
    private OtherIngredients[] otherIngredients;

    public Coffee(String name, TypesOfCoffee typesOfCoffee, OtherIngredients[] otherIngredients) {
        this.name = name;
        this.typesOfCoffee = typesOfCoffee;
        this.otherIngredients = otherIngredients;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TypesOfCoffee getTypesOfCoffee() {
        return typesOfCoffee;
    }

    public void setTypesOfCoffee(TypesOfCoffee typesOfCoffee) {
        this.typesOfCoffee = typesOfCoffee;
    }

    public OtherIngredients[] getOtherIngredients() {
        return otherIngredients;
    }

    public void setOtherIngredients(OtherIngredients[] otherIngredients) {
        this.otherIngredients = otherIngredients;
    }
    public String order(){
        return name+" "+typesOfCoffee+" with "+Arrays.toString(otherIngredients)+".";
    }
}
