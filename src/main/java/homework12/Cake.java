package homework12;

import java.util.Arrays;

public class Cake {
    private String name;
    private int serving_size;
    private int calories;
    private int fat;
    private int carbs;
    private int protein;
    private Units[] units;
    private Nutrition_parameters parameters;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getServing_size() {
        return serving_size;
    }

    public void setServing_size(int serving_size) {
        this.serving_size = serving_size;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public int getFat() {
        return fat;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }

    public int getCarbs() {
        return carbs;
    }

    public void setCarbs(int carbs) {
        this.carbs = carbs;
    }

    public int getProtein() {
        return protein;
    }

    public void setProtein(int protein) {
        this.protein = protein;
    }

    public Units[] getUnits() {
        return units;
    }

    public void setUnits(Units[] units) {
        this.units = units;
    }

    public Nutrition_parameters getParameters() {
        return parameters;
    }

    public void setParameters(Nutrition_parameters parameters) {
        this.parameters = parameters;
    }

    public Cake(String name, int serving_size, int calories, int fat, int carbs, int protein, Units[] units) {
        this.name = name;
        this.serving_size = serving_size;
        this.calories = calories;
        this.fat = fat;
        this.carbs = carbs;
        this.protein = protein;
        this.units = units;
    }
//isCalories должно быть true, а по факту false, тк срабатывает ветка "...no code for this option..."
    public String printInfo(){
        if (Nutrition_parameters_class.isCalories){
            return name+" "+serving_size+" " + Arrays.toString(units) +
                    "\nCalories: "+calories+ " " +" [KCAL]"+
                    "\nFat: " +fat+ " " +Arrays.toString(units)+
                    "\nCarbs: " +carbs+ " " +Arrays.toString(units)+
                    "\nProtein: " +protein+ " " +Arrays.toString(units);
        }
            return "...no code for this option...";
    }
}


